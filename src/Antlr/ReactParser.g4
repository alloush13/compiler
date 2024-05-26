parser grammar ReactParser;

options {
    tokenVocab = ReactLexer;
}

program : HashBangLine? sourceElements? EOF;

sourceElement
    : statement
    ;

statement
    : block
    | variableStatement
    | importStatement
    | exportStatement
    | expressionStatement
    | ifStatement
    | iterationStatement
    | returnStatement
    | withStatement
    | labelledStatement
    | switchStatement
    | functionDeclaration
    ;

block: OpenBrace statementList? CloseBrace;

statementList
    : statement+
    ;

importStatement : Import importFromBlock ;

importFromBlock
    : ((aliasName)|( aliasName ',' moduleItems)| (moduleItems))importFrom eos
    | StringLiteral eos
    ;

moduleItems
    : OpenBrace (aliasName ',')* (aliasName ','?)? CloseBrace
    ;


importNamespace
    : ('*' | identifierName) (As identifierName)?
    ;

importFrom
    : From StringLiteral
    ;

aliasName
    : identifierName (As identifierName)?
    ;

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

ifStatement
    : If '(' expressionSequence ')' statement (Else statement)?
    ;

iterationStatement
    : For '(' (expressionSequence | variableDeclarationList)? ';' expressionSequence? ';' expressionSequence? ')' statement # ForStatement
    | For '(' (singleExpression | variableDeclarationList) In expressionSequence ')' statement                              # ForInStatement
   ;

varModifier
    : Var
    | Let
    | Const
    ;


returnStatement
    : Return ( expressionSequence)? eos
    | Return '(' jsxElements ')' eos
    ;


withStatement
    : With '(' expressionSequence ')' statement
    ;

switchStatement
    : Switch '(' expressionSequence ')' caseBlock
    ;

caseBlock
    : OpenBrace caseClauses? (defaultClause caseClauses?)? CloseBrace
    ;

caseClauses
    : caseClause+
    ;

caseClause
    : Case expressionSequence ':' statementList?
    ;

defaultClause
    : Default ':' statementList?
    ;

labelledStatement
    : identifier ':' statement
    ;


functionDeclaration
    : Async? Function_ '*'? identifier '(' formalParameterList? ')' OpenBrace functionBody CloseBrace
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

    | Ellipsis? singleExpression                                                 # PropertyShorthand
    ;

propertyName
    : identifierName
    | StringLiteral
    | '[' singleExpression ']'
    ;

arguments
    : '(' (argument (',' argument)* ','?)? ')'
    ;

argument
    : Ellipsis? (singleExpression | identifier)
    ;

expressionSequence
    : Ellipsis? singleExpression (',' Ellipsis? singleExpression)*
    ;

singleExpression
    : anoymousFunction                              # FunctionExpression
    | singleExpression '[' expressionSequence ']'   # MemberIndexExpression
    | singleExpression '?'? '.' '#'? identifierName # MemberDotExpression
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
    | singleExpression templateStringLiteral                               # TemplateStringExpression

    | This                                                                 # ThisExpression
    | identifier                                                           # IdentifierExpression
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
    : identifier
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
    : identifier
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
    | templateStringLiteral
    | RegularExpressionLiteral
    |DecimalLiteral
    ;

templateStringLiteral
    : BackTick templateStringAtom* BackTick
    ;

templateStringAtom
    : TemplateStringAtom
    | TemplateStringStartExpression singleExpression CloseBrace
    ;



identifierName
    : identifier
    | reservedWord
    ;

identifier
    : Identifier
    | Async
    ;

reservedWord
    : keyword
    | NullLiteral
    | BooleanLiteral
    ;

keyword
    : Break
    | Do
    | Instanceof
    | Typeof
    | Case
    | Else
    | New
    | Var
    | Catch
    | Finally
    | Return
    | Void
    | Continue
    | For
    | Switch
    | While
    | Debugger
    | Function_
    | This
    | With
    | Default
    | If
    | Throw
    | Delete
    | In
    | Try
    | Class
    | Enum
    | Extends
    | Super
    | Const
    | Export
    | Import
    | Implements
    | Let
    | Private
    | Public
    | Interface
    | Package
    | Protected
    | Static
    | Yield
    | Async
    | Await
    | From
    | As
    ;


eos : (SemiColon| EOF )?;