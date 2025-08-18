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
      <button onClick={() => alert("Groceries Added to Cart!")}> {/* it is to get alert popup message that ,after we click on add to cart then it will display that groceries are added to cart(like verfication)*/ }
        Add to Cart
      </button>
    </div>
  );
}

export default GroceryList;

