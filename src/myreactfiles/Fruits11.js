import React, { Component } from "react";

class Fruits extends Component {
  constructor(props) {
    super(props);
    //State holds the fruits array and newFruit input value
    this.state = {
      fruits: ["Orange", "Kiwi", "Mango"],
      newFruit: ""
    };
  }
//arrow function,no need to bind it in the constructor(react automatically binds it)
// Handles input text 
  handleChange = (e) => {
    this.setState({ newFruit: e.target.value });//points to the current value,updated one
  };

  addFruit = () => {
    if (this.state.newFruit.trim() !== "") {//checking whether it is not empty
      this.setState((prevState) => ({
        fruits: [...prevState.fruits, prevState.newFruit],//here prevState means existing fruitslist ,prevState.newFruit means add new fruit to existing fruitslist.
        newFruit: ""//again keep newFruit as empty(clear) after adding it to existing state.
      }));
    }
  };

  render() {
    return (
      <div className="container mt-4">
        <h2>Fruits</h2>
        <input
          type="text"
          value={this.state.newFruit}
          onChange={this.handleChange}//this triggers the handleChange funtion
          placeholder="Enter fruit name"
         
          
        />
        <button className="btn btn-success" onClick={this.addFruit}> {/* on click add fruit ,it triggers addFruit function*/}
          Add Fruit
        </button>

        {/* Passing fruits as props to functional component */}
        <FruitList fruits={this.state.fruits} />
      </div>
    );
  }
}

// Functional Component
function FruitList({ fruits }) {
  return (
    <div className="mt-3">
      <h3>Fruit List</h3>
      <ul className="list-group">
        {/* iterating using map, index as a key for unquiness */}
        {fruits.map((fruit, index) => (
          <li key={index} className="list-group-item">
            {fruit}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Fruits;//its mandotary to export,hence it needs to import in app.js
