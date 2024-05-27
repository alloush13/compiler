parser grammar ReactParser;

options {
    tokenVocab = ReactLexer;
}

program : HashBangLine? sourceElements? EOF;

sourceElement: statement;

statement
    : block
    | variableStatement
    | importStatement
    | exportStatement
    | expressionStatement
    | ifStatement
    | forStatement
    | returnStatement
    | labelledStatement
    | functionDeclaration
    ;

block: OpenBrace statementList? CloseBrace;

statementList: statement+ ;

importStatement : Import importFromBlock ;

importFromBlock
    : ((importNamespace)|( aliasName ',' moduleItems)| (moduleItems))importFrom eos
    | StringLiteral eos
    ;

moduleItems: OpenBrace (aliasName ',')* (aliasName ','?)? CloseBrace;


importNamespace: Identifier | (Identifier As Identifier)? |('*' As Identifier);

importFrom : From StringLiteral ;

aliasName: Identifier (As Identifier)?;

exportStatement
    : Export (exportFromBlock | declaration) eos # ExportDeclaration
    | Export Default singleExpression   SemiColon?      # ExportDefaultDeclaration
    ;

exportFromBlock
    : importNamespace importFrom eos
    | moduleItems importFrom? eos
    ;

declaration
    : variableStatement
    | functionDeclaration
    ;

variableStatement
    : variableDeclarationList eos
    ;

variableDeclarationList
    : varModifier variableDeclaration (',' variableDeclaration)*
    ;

variableDeclaration
    : assignable (Assign singleExpression)?
    ;


expressionStatement
    :  expressionSequence eos
    ;

ifStatement: If '(' expressionSequence ')' statement (Else statement)?;

forStatement : For '(' (expressionSequence | variableDeclarationList)? ';' expressionSequence? ';' expressionSequence? ')' statement ;

varModifier: Var| Let| Const;


returnStatement
    : Return ( expressionSequence)? eos
    | Return '(' jsxElements ')' eos
    ;





labelledStatement
    : Identifier ':' statement
    ;


functionDeclaration
    : Async? Function_ '*'? Identifier '(' formalParameterList? ')' OpenBrace functionBody CloseBrace
    ;

formalParameterList
    : formalParameterArg (',' formalParameterArg)* (',' lastFormalParameterArg)?
    | lastFormalParameterArg
    ;

formalParameterArg
    : assignable (Assign singleExpression)?
    ;

lastFormalParameterArg
    : Ellipsis singleExpression
    ;

functionBody
    : sourceElements?
    ;

sourceElements
    : sourceElement+
    ;

arrayLiteral
    : ('[' elementList ']')
    ;

elementList
    : ','* arrayElement? (','+ arrayElement)* ','* // Yes, everything is optional
    ;

arrayElement
    : Ellipsis? singleExpression
    ;

propertyAssignment
    : propertyName ':' singleExpression                                          # PropertyExpressionAssignment
    | '[' singleExpression ']' ':' singleExpression                              # ComputedPropertyExpressionAssignment
    | Async? '*'? propertyName '(' formalParameterList? ')' OpenBrace functionBody CloseBrace # FunctionProperty
    ;

propertyName
    : Identifier
    | StringLiteral
    | '[' singleExpression ']'
    ;

arguments : '(' (argument (',' argument)* ','?)? ')' ;

argument : Ellipsis? (singleExpression | Identifier) ;

expressionSequence: Ellipsis? singleExpression (',' Ellipsis? singleExpression)*;

singleExpression
    : anoymousFunction                              # FunctionExpression
    | singleExpression '[' expressionSequence ']'   # MemberIndexExpression
    | singleExpression '?'? '.' '#'? Identifier # MemberDotExpression
    // Split to try `new Date()` first, then `new Date`.
    | singleExpression arguments                                           # ArgumentsExpression
    | Void singleExpression                                                # VoidExpression
    | singleExpression ('*' | '/' | '%') singleExpression                  # MultiplicativeExpression
    | singleExpression ('+' | '-') singleExpression                        # AdditiveExpression

    | singleExpression (LessThan | MoreThan | '<=' | '>=') singleExpression # RelationalExpression


    | singleExpression ('==' | '!=' | '===' | '!==') singleExpression      # EqualityExpression
    | singleExpression '&' singleExpression                                # BitAndExpression
    | singleExpression '^' singleExpression                                # BitXOrExpression
    | singleExpression '|' singleExpression                                # BitOrExpression
    | singleExpression '&&' singleExpression                               # LogicalAndExpression
    | singleExpression '||' singleExpression                               # LogicalOrExpression
    | singleExpression '?' singleExpression ':' singleExpression           # TernaryExpression

    | Import '(' singleExpression ')'                                      # ImportExpression

    | This                                                                 # ThisExpression
    | Identifier                                                           # IdentifierExpression
    | literal                                                              # LiteralExpression
    | arrayLiteral                                                         # ArrayLiteralExpression
    | objectLiteral                                                        # ObjectLiteralExpression
    | jsxElements                                                          # jsxElementExpression
    | '(' expressionSequence ')'                                           # ParenthesizedExpression
    ;

jsxElements
    : jsxElement+
    ;

jsxElementBegin
    : JsxElementBegin
    | JsxOpeningElementBegin
    | JsxChildrenOpeningElementBegin
    ;

jsxElement
    : jsxSelfClosingElement
    | jsxOpeningElement jsxChildren jsxClosingElement
    ;

jsxSelfClosingElement
    : jsxElementBegin jsxSelfClosingElementName jsxAttributes? JsxOpeningElementSlashEnd
    ;

jsxOpeningElement
    : jsxElementBegin jsxOpeningElementName jsxAttributes? JsxOpeningElementEnd
    ;

jsxClosingElement
    : JsxChildrenClosingElementSlashBegin jsxClosingElementName JsxClosingElementEnd
    ;

jsxChildren
    : HtmlChardata? ((jsxElement | objectExpressionSequence) HtmlChardata?)*
    ;

jsxSelfClosingElementName
    : JsxOpeningElementId?
    ;

jsxOpeningElementName
    : JsxOpeningElementId?
    ;

jsxClosingElementName
    : JsxClosingElementId?
    ;

jsxAttributes
    : jsxSpreadAttribute jsxAttributes?
    | jsxAttribute jsxAttributes?
    ;

jsxSpreadAttribute
    : JsxOpeningElementOpenBrace Ellipsis singleExpression CloseBrace
    ;

jsxAttribute
    : jsxAttributeName JsxAssign jsxAttributeValue
    | jsxAttributeName
    ;

jsxAttributeName
    : JsxOpeningElementId
    ;

jsxAttributeValue
    : JsxAttributeValue
    | jsxElement
    | objectExpressionSequence
    ;

assignable
    : Identifier
    | arrayLiteral
    | objectLiteral
    ;

objectLiteral
    : OpenBrace (propertyAssignment (',' propertyAssignment)* ','?)? CloseBrace
    ;

openBrace
    : OpenBrace
    | JsxOpeningElementOpenBrace
    | JsxChildrenOpenBrace
    ;

objectExpressionSequence
    : openBrace expressionSequence CloseBrace
    ;

anoymousFunction
    : functionDeclaration                                                     # FunctionDecl
    | Async? Function_ '*'? '(' formalParameterList? ')' OpenBrace functionBody CloseBrace # AnoymousFunctionDecl
    | Async? arrowFunctionParameters '=>' arrowFunctionBody                   # ArrowFunction
    ;

arrowFunctionParameters
    : Identifier
    | '(' formalParameterList? ')'
    ;

arrowFunctionBody
    : singleExpression
    | OpenBrace functionBody CloseBrace
    ;

literal
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | RegularExpressionLiteral
    |DecimalLiteral
    ;


eos : (SemiColon| EOF )?;