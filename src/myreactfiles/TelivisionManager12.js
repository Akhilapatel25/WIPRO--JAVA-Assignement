import React, { Component } from "react";

//class component --parent component
// Manages television models (state) and allows adding new models
class TelevisionManager extends Component {
  constructor(props) {
    super(props);
    // State contains list of TV models and the current input value
    this.state = {
      televisions: ["LG", "SAMSUNG", "SONY"],
      newModel: ""
    };
  }

  // Handle input field changes and update newModel in state
  handleChange = (e) => {
    this.setState({ newModel: e.target.value });//points to the current value ,updated one
  };

  // Add a new television model to the list using spread operator
  addTelevision = () => {
    if (this.state.newModel.trim() !== "") {//checking whethere it is not empty model
      this.setState((prevState) => ({
        televisions: [...prevState.televisions, prevState.newModel], // Spread operator used to add new model to existing television models
        newModel: "" // Clear input after adding
      }));
    }
  };

  render() {
    return (
      <div className="container mt-4">
        <h2>Television model</h2>

        {/* Input field for new TV model */}
        <input
          type="text"
          value={this.state.newModel}
          onChange={this.handleChange}
          placeholder="Enter TV model"
        
        />

        {/* Button to add TV model */}
        <button className="btn btn-primary" onClick={this.addTelevision}>{/* on onclick it triggers the addTelevision funtion*/}
          Add Model
        </button>

        {/* Passing television list as props to functional component */}
        <TelevisionList televisions={this.state.televisions} />
      </div>
    );
  }
}

//Functional Component
//presentation component too,only UI part is available
// Receives television models via props and displays them
function TelevisionList({ televisions }) {
  return (
    <div className="mt-3">
      <h3>Television Models</h3>
      <ul className="list-group">
        {/* using map for iterating the models usind index for unquiness */}
        {televisions.map((model, index) => (
          <li key={index} className="list-group-item">
            {model}
          </li>
        ))}
      </ul>
    </div>
  );
}

// Exporting the Class Component (main parent component) to import it in App.js
export default TelevisionManager;
