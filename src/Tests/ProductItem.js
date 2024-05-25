import React from "react";

export default function ProductItem({ product, onClick }) {


  const productStyle = {
    display: "flex",
    alignItems: "center",
    padding: "1em",
    cursor: "pointer",
  };



  return (
    <li
       style={{
          display: "flex",
          flexDirection: "column",
          justifyContent: "flex-start",
          cursor: "pointer",
          margin: "30px 0",
          padding: "10px 10px",
          border: "1px solid gold",
          backgroundColor: '#dda114',
          boxShadow: '0px 0px 10px 0px rgba(0,0,0,0.75)',
          borderRadius: '15%'
       }}
       onClick={() => onClick(product)}    >
       <h2>{product.name}</h2>
       <img src={product.image} style={{ width: "100%",borderRadius: '30%'
}} />
    </li>
 )

}
