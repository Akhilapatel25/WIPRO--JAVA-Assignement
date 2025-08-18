import React, { Component } from "react";   // Import React and Component class

class AccessoriesForm extends Component {
  constructor(props) {
    super(props);  
    // Initial state for all form inputs
    this.state = {
      accessoryName: "",   // stores accessory name (text input)
      description: "",     // stores description (textarea)
      category: "Electronics", // default selected category
      brand: "",           // stores brand chosen by radio button
      inStock: false,      // checkbox for availability
      warranty: "",        // warranty years (number input)
      submitted: [],       // holds submitted data for display
    };
  }

  // Handles input changes for all form elements
  handleChange = (e) => {
    const { name, value, type, checked } = e.target;  // destructuring (extract name, value, type, checked)
    // update state dynamically 
    this.setState({
      [name]: type === "checkbox" ? checked : value,
    });
  };

  // Handles form submission
  handleSubmit = (e) => {
    e.preventDefault(); // prevent page reloading on click submit

    // save submitted form details into state
    this.setState({
      submitted: {
        accessoryName: this.state.accessoryName,
        description: this.state.description,
        category: this.state.category,
        brand: this.state.brand,
        inStock: this.state.inStock,
        warranty: this.state.warranty,
      },
      // reset form fields back to default values  (clear and make it empty again)
      accessoryName: "",
      description: "",
      category: "Electronics",
      brand: "",
      inStock: false,
      warranty: "",
    });
  };

  render() {
    return (
      <div className="container mt-4">
     
        <div className="card shadow p-4">
          <h2 className="text-center mb-4">Accessories Form</h2>

          {/* Form starts here */}
          <form onSubmit={this.handleSubmit}>
            
            {/* Text input for accessory name */}
            <div className="form-group mb-3">
              <label>Accessory Name</label>
              <input
                type="text"
                name="accessoryName"
                className="form-control"
                value={this.state.accessoryName}
                onChange={this.handleChange}
                placeholder="Enter accessory name"
                required
              />
            </div>

            {/* Textarea for description */}
            <div className="form-group mb-3">
              <label>Description</label>
              <textarea
                name="description"
                className="form-control"
                value={this.state.description}
                onChange={this.handleChange}
                placeholder="Enter description"
                required
              />
            </div>

            {/* Dropdown for category selection */}
            <div className="form-group mb-3">
              <label>Category</label>
              <select
                name="category"
                className="form-control"
                value={this.state.category}
                onChange={this.handleChange}
              >
                <option value="Electronics">Electronics</option>
                <option value="Fashion">Fashion</option>
                <option value="Sports">Sports</option>
                <option value="Home">Home</option>
              </select>
            </div>

            {/* Radio buttons for brand selection */}
            <div className="form-group mb-3">
              <label className="d-block">Brand</label>
              
              {/* Sony option */}
              <div className="form-check form-check-inline">
                <input
                  type="radio"
                  name="brand"
                  value="Sony"
                  checked={this.state.brand === "Sony"}
                  onChange={this.handleChange}
                  className="form-check-input"
                />
                <label className="form-check-label">Sony</label>
              </div>

              {/* Samsung option */}
              <div className="form-check form-check-inline">
                <input
                  type="radio"
                  name="brand"
                  value="Samsung"
                  checked={this.state.brand === "Samsung"}
                  onChange={this.handleChange}
                  className="form-check-input"
                />
                <label className="form-check-label">Samsung</label>
              </div>

              {/* LG option */}
              <div className="form-check form-check-inline">
                <input
                  type="radio"
                  name="brand"
                  value="LG"
                  checked={this.state.brand === "LG"}
                  onChange={this.handleChange}
                  className="form-check-input"
                />
                <label className="form-check-label">LG</label>
              </div>
            </div>

            {/* Checkbox for stock availability */}
            <div className="form-group mb-3">
              <div className="form-check">
                <input
                  type="checkbox"
                  name="inStock"
                  className="form-check-input"
                  checked={this.state.inStock}
                  onChange={this.handleChange}
                />
                <label className="form-check-label">
                  Available in stock
                </label>
              </div>
            </div>

            {/* Number input for warranty years */}
            <div className="form-group mb-3">
              <label>Warranty (in years)</label>
              <input
                type="number"
                name="warranty"
                className="form-control"
                value={this.state.warranty}
                onChange={this.handleChange}
                min="0"
                placeholder="Enter warranty period"
              />
            </div>

            {/* Submit button */}
            <button type="submit" className="btn btn-success w-100">
              Submit
            </button>
          </form>
          {/* Form ends here */}
        </div>

        {/* Display submitted data in a table */}
        {this.state.submitted && (
          <div className="card mt-4 shadow p-3">
            <h3 className="text-center">Submitted Accessory Details</h3>
            <table className="table table-bordered table-striped mt-3">
              <tbody>
                <tr>
                  <th>Accessory Name</th>
                  <td>{this.state.submitted.accessoryName}</td>
                </tr>
                <tr>
                  <th>Description</th>
                  <td>{this.state.submitted.description}</td>
                </tr>
                <tr>
                  <th>Category</th>
                  <td>{this.state.submitted.category}</td>
                </tr>
                <tr>
                  <th>Brand</th>
                  <td>{this.state.submitted.brand}</td>
                </tr>
                <tr>
                  <th>Available in Stock</th>
                  <td>{this.state.submitted.inStock ? "Yes" : "No"}</td>
                </tr>
                <tr>
                  <th>Warranty (Years)</th>
                  <td>{this.state.submitted.warranty}</td>
                </tr>
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default AccessoriesForm;   // Export component for use
