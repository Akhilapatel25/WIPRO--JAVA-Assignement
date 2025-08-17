import React from "react";

// Child component (CanteenItem)
//presentation component also,because only UI part is available
const CanteenItem = ({ name, price, category, available }) => {
  return (
    <li>
      {name} – Price: ₹{price} – Category: {category} – {available && `Available`}
      {!available && `Not Available`}
    </li>
  );
};

// Parent component (CanteenMenu)
//container component
const CanteenMenu = () => {
  return (
    <div style={{ padding: "20px" }}>
      <h2>Canteen Name: Campus Food Court</h2>
      <p>Location: Block A, Ground Floor</p>
      <p>Open Hours: 8:00 AM – 8:00 PM</p>

      <h3>Canteen Menu:</h3>
      <ul>
        <CanteenItem name="Idli" price={30} category="Breakfast" available={true} />
        <CanteenItem name="Dosa" price={5} category="Breakfast" available={true} />
        <CanteenItem name="Vada" price={2} category="Snack" available={false} />
        <CanteenItem name="Poori" price={40} category="Breakfast" available={true} />
        <CanteenItem name="Meals" price={120} category="Lunch" available={true} />
      </ul>
    </div>
  );
};

export default CanteenMenu;//its mandatory to export the component to import it in App.js because im creating separate file for the component.