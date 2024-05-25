import React from "react";

export default function ProductDetails({ product }) {
  const productDetailsStyle = {
    width: '500px',
    padding: '4em',
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    backgroundColor: '#f8daa6', // Change to your desired color
    boxShadow: '0px 0px 10px 0px rgba(0,0,0,0.75)', // Add shadow
    overflowY: 'hidden', // Hide overflow
    marginLeft:'30%',
    marginTop:'5px',
    borderRadius: '20%'



  };

  const imageStyle = {
    width: '300px',
    height: '500px',
    marginBottom: '2em',
    border: 'solid 1px #dda114' ,
    boxShadow: '0px 0px 10px 0px rgba(0,0,0,0.75)', // Add shadow

    borderRadius: '20%'
  };

  const textStyle = {
    textAlign: 'center',
    marginBottom: '2em',
    color:'#835d04',
  };

  return (
    <div style={productDetailsStyle} >
      <h1 style={textStyle}>{product.name}</h1>
      <img src={product.image} alt={product.name} style={imageStyle} />
      <p style={textStyle}>{product.description}</p>
    </div>
  );
 }

