import React from "react";

const SweetsList = () => {
  // Array of sweets (JSON objects)
  const sweets = [
    { id: 1, name: "Kashmir Kalakandh", price: 120 },
    { id: 2, name: "Motichoor Laddu", price: 80 },
    { id: 3, name: "Peda", price: 70 },
    { id: 4, name: "Mysore Pak", price: 150 },
    { id: 5, name: "Jilebi", price: 90 }
  ];

  return (
    <div>
      <h2>Sweets List</h2>
      {sweets.map((sweet) => (
        <div key={sweet.id}>
          {sweet.name} - Price: ₹{sweet.price}
        </div>
      ))}
    </div>
  );
};

export default SweetsList;//its mandatory to export the component to import it in App.js because im creating separate file for the component.
