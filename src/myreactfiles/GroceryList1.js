import React from "react";

function GroceryList({ items }) {
  return (
    <div className="p-4">
      <h2>Grocery List</h2>
      <ul>
        {items.map((item, index) => (
          // use index or better use unique value as key
          <li key={index}>{item}</li>
        ))}
      </ul>
      <button onClick={() => alert("Groceries Added to Cart!")}>
        Add to Cart
      </button>
    </div>
  );
}

export default GroceryList;
