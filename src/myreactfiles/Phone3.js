import React, { useState } from 'react';

const Phone3 = () => {

  //i given the default values for brand,model and price  
  const [phone, setPhone] = useState({
    brand: "IQOO",
    model: "IQOO neo 7 pro",
    price: 28000
  });

 //here the updatePrice is to update the price of the phone which is increasing price
  const updatePrice = () => {
    setPhone({ ...phone, price: phone.price + 5000 }); 
  };

  return (
    <div>
      <h2>Phone Details</h2>
      <p><b>Brand:</b> {phone.brand}</p>
      <p><b>Model:</b> {phone.model}</p>
      <p><b>Price:</b> ₹{phone.price}</p>

      <button onClick={updatePrice}>Update Price</button>
    </div>
  );
};

export default Phone3;//its mandatory to export the component to import it in App.js because im creating separate file for the component.
