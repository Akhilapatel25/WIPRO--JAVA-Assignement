
import React, { useState } from "react";

// functional component BakingForm
const BakingForm = () => {
  //State for managing form inputs (as one object)
  // Initially all fields are empty
  //setFormData is method to maintain state
  //formData state variable
  const [formData, setFormData] = useState({
    itemName: "",
    quantity: "",
    ingredients: "",
    bakingTime: "",
    category: "",
  });

  // State for storing submitted baking items (as an array of objects)
  const [bakingItems, setBakingItems] = useState([]);

  // Function to handle changes in input fields
  const handleChange = (e) => {
    const { name, value } = e.target; 
    // e.target.name ---refers to the input's "name" attribute
    // e.target.value--- refers to the current value typed/selected

    // Update only the changed field using spread operator
    setFormData({
      ...formData,        // keep old data as it is
      [name]: value,      // update only the changed field dynamically
    });
  };

  // Function to handle form submission
  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent page reload on form submit

    // validation part  check required fields
    if (!formData.itemName || !formData.quantity || !formData.category) {
      alert("Please fill all required fields!");
      return;
    }

    // Add new item to the array (spread operator adds existing  items + new one)
    setBakingItems([...bakingItems, formData]);

    // clear form after submission (empty fields again)
    setFormData({
      itemName: "",
      quantity: "",
      ingredients: "",
      bakingTime: "",
      category: "",
    });
  };

  return (
    // Bootstrap container with margin-top
    <div className="container mt-5">

      {/* Bootstrap class for a white box with rounded corners,*/}
      <div className="card p-4 shadow-lg">
        <h3 className="text-center mb-3">Baking Items Form</h3>

        {/* Form starts here */}
        <form onSubmit={handleSubmit}>
          {/* Item Name Input */}
          <div className="mb-3">
            <label className="form-label">Item Name</label>
            <input
              type="text"
              name="itemName"            
              value={formData.itemName}    // controlled input (linked to state)
              onChange={handleChange}      // updates state on typing
              className="form-control"
              placeholder="Enter item name"
              required                     // HTML required validation
            />
          </div>

          {/* Quantity Input */}
          <div className="mb-3">
            <label className="form-label">Quantity</label>
            <input
              type="number"
              name="quantity"
              value={formData.quantity}
              onChange={handleChange}
              className="form-control"
              placeholder="Enter quantity"
              required
            />
          </div>

          {/* Ingredients Textarea */}
          <div className="mb-3">
            <label className="form-label">Ingredients</label>
            <textarea
              name="ingredients"
              value={formData.ingredients}
              onChange={handleChange}
              className="form-control"
              placeholder="Enter ingredients"
            ></textarea>
          </div>

          {/* Baking Time Input */}
          <div className="mb-3">
            <label className="form-label">Baking Time (in mins)</label>
            <input
              type="number"
              name="bakingTime"
              value={formData.bakingTime}
              onChange={handleChange}
              className="form-control"
              placeholder="Enter baking time"
            />
          </div>

          {/* Category Dropdown */}
          <div className="mb-3">
            <label className="form-label">Category</label>
            <select
              name="category"
              value={formData.category}
              onChange={handleChange}
              className="form-control"
              required
            >
              <option value="">-- Select Category --</option>
              <option value="Cake">Cake</option>
              <option value="Bread">Bread</option>
              <option value="Pastry">Pastry</option>
            </select>
          </div>

          {/* Submit button */}
          <button type="submit" className="btn btn-primary w-100">
            Add Item
          </button>
        </form>
      </div>

      {/* Table section */}
      <div className="card mt-4 p-3 shadow-lg"> 
        <h4 className="text-center mb-3">Baking Items List</h4>

        {/* If no items, show message. Else, render table */}
        {bakingItems.length === 0 ? (
          <p className="text-center">No items added yet.</p>
        ) : (
          <table className="table table-bordered table-hover">
            <thead className="table-dark">
              <tr>
                <th>#</th>
                <th>Item Name</th>
                <th>Quantity</th>
                <th>Ingredients</th>
                <th>Baking Time</th>
                <th>Category</th>
              </tr>
            </thead>
            <tbody>
              {/* iterate over bakingItems array and display each item in table row */}
              {bakingItems.map((item, index) => (
                <tr key={index}>
                  <td>{index + 1}</td>               {/* Row number */}
                  <td>{item.itemName}</td>           {/* Item Name */}
                  <td>{item.quantity}</td>           {/* Quantity */}
                  <td>{item.ingredients}</td>        {/* Ingredients */}
                  <td>{item.bakingTime} mins</td>    {/* Baking Time */}
                  <td>{item.category}</td>           {/* Category */}
                </tr>
              ))}
            </tbody>
          </table>
        )}
      </div>
    </div>
  );
};

// Export the component so it can be imported in App.js
export default BakingForm;
