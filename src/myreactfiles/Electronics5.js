import React, { useState } from "react";

function Electronics() {
  // useState hooks for each field
  const [name, setName] = useState("AC");
  const [brand, setBrand] = useState("LG");
  const [price, setPrice] = useState(20000);

  // handler functions
  const updateBrand = () => {
    setBrand("IFB"); // Example: update to IFB
  };

  const increasePrice = () => {
    setPrice(price + 2000); // Increase price by 2000
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>Electronic Item Details</h2>
      <p><b>Name:</b> {name}</p>
      <p><b>Brand:</b> {brand}</p>
      <p><b>Price:</b> ₹{price}</p>

      <button onClick={updateBrand} style={{ marginRight: "10px" }}>
        Update Brand
      </button>
      <button onClick={increasePrice}>
        Increase Price
      </button>
    </div>
  );
}

export default Electronics;
