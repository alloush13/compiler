import React from 'react'
import ProductItem from './ProductItem'



export default function ProductList({ products, onProductClick }) {
  const productListStyle = {
    width: '50%',
    overflowY: 'auto',
    padding: "0 70px",
    listStyle: "none"
  };

  return (
    <ul style={productListStyle}>
      {products.map(product => (
        <ProductItem key={product.id} product={product} onClick={onProductClick}  />
      ))}
    </ul>
  );
 }

