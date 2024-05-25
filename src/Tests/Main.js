import React, { useState } from "react";
import ProductList from "./ProductList";
import ProductDetails from "./ProductDetails";
import alexImage from "../assets/1.jpeg";
import sedraImage from "../assets/2.jpg";
import JosephImage from "../assets/3.jpg";
import VanImage from "../assets/4.jpeg";
import '../App.css'

const productsItems = [
  {
    id: 1,
    name: "Alex",
    image:alexImage,
    description:"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed doeiusmod tempor incididunt ut labore et dolore magna aliqua.",
    price: 24,
  },
  {
    id: 2,
    name: "Sedra",
    image:sedraImage,
    description:"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed doeiusmod tempor incididunt ut labore et dolore magna aliqua.",
    price: 22,
  },
  {
    id: 3,
    name: "Joseph",
    image:JosephImage,
    description:"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed doeiusmod tempor incididunt ut labore et dolore magna aliqua.",
    price: 23,
  },
  {
    id: 4,
    name: "Van",
    image:VanImage,
    description:"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed doeiusmod tempor incididunt ut labore et dolore magna aliqua.",
    price: 25,
  },
];
export default function Main() {
  const [selectedProduct, setSelectedProduct] = useState(null);

  const handleProductClick = (product) => {
    setSelectedProduct(product);
  };

  const appStyle = {
    display: 'flex',
    justifyContent: "flex-start",
    alignContent: "center"  };

  return (
    <div  style={{ display: "flex", flexFlow: "row-reverse", justifyContent: "flex-start", alignContent: "center"}}>
      <div style={{ flex: 1, maxHeight: "100vh", overflowY: "auto" ,marginLeft:"40px",backgroundColor:"#eddeb9"}}>
        <ProductList products={productsItems} onProductClick={handleProductClick} />
      </div>
      <div style={{ flex: 3, maxHeight: "100vh", overflowY: "hidden" ,backgroundColor:"#f5d584"}}>
        {selectedProduct && <ProductDetails product={selectedProduct} />}
      </div>
    </div>
  );
}