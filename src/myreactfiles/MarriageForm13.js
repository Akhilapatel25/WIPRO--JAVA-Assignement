import React, { Component } from "react";

class MarriageForm extends Component {
  constructor(props) {
    super(props);
    // State contains all form fields and submitted data
    this.state = {
      brideName: "",
      groomName: "",
      date: "",
      venue: "",
      submitted: null, // Stores submitted details
    };
  }

  // Handle input changes dynamically using name attribute ,points to the current updated value
  handleChange = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };

  // Handle form submission
  handleSubmit = (e) => {
    e.preventDefault();
    this.setState({
      submitted: {
        brideName: this.state.brideName,
        groomName: this.state.groomName,
        date: this.state.date,
        venue: this.state.venue,
      },
      // Clear form after submission
      brideName: "",
      groomName: "",
      date: "",
      venue: "",
    });
  };

  render() {
    return (
      <div className="container mt-4">{/* Bootstrap class that gives padding and centers content*/}
            <div className="card shadow p-4"> {/*Bootstrap class for a white box with rounded corners,,,shadow--->that adds a light shadow effect */}
          <h2 className="text-center mb-4">Marriage Form</h2> {/*Bootstrap class to center the text.*/}
          <form onSubmit={this.handleSubmit}>
            {/* Bride Name */}
            <div className="form-group mb-3">
              <label>Bride Name</label>
              <input
                type="text"
                name="brideName"
                className="form-control"
                value={this.state.brideName}  //Controlled by state...makes the input box show whatever is in the state
                onChange={this.handleChange}  //it triggers the handleChange function that it points to the current text box field.
                placeholder="Enter Bride's Name"
                required
              />
            </div>

            {/* Groom Name */}
            <div className="form-group mb-3">
              <label>Groom Name</label>
              <input
                type="text"
                name="groomName"
                className="form-control"
                value={this.state.groomName}
                onChange={this.handleChange}
                placeholder="Enter Groom's Name"
                required
              />
            </div>

            {/* Date */}
            <div className="form-group mb-3">
              <label>Marriage Date</label>
              <input
                type="date"
                name="date"
                className="form-control"
                value={this.state.date}
                onChange={this.handleChange}
                required
              />
            </div>

            {/* Venue */}
            <div className="form-group mb-3">
              <label>Venue</label>
              <input
                type="text"
                name="venue"
                className="form-control"
                value={this.state.venue}
                onChange={this.handleChange}
                placeholder="Enter Venue"
                required
              />
            </div>

            {/* Submit Button */}
            <button type="submit" className="btn btn-primary w-100">
              Submit
            </button>
          </form>
        </div>

        {/* Displaying submitted details */}
        {/*current state submited data*/}
        {this.state.submitted && (
          <div className="card mt-4 shadow p-3">
            <h3 className="text-center">Marriage Details</h3>
            <p><strong>Bride Name:</strong> {this.state.submitted.brideName}</p> {/*it diplays the current state submitted bridename*/}
            <p><strong>Groom Name:</strong> {this.state.submitted.groomName}</p>
            <p><strong>Date:</strong> {this.state.submitted.date}</p>
            <p><strong>Venue:</strong> {this.state.submitted.venue}</p>
          </div>
        )}
      </div>
    );
  }
}
//export the file to import it in App.js
export default MarriageForm;
