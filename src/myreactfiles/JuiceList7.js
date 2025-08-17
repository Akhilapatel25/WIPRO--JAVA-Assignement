import React from "react";

function Juice({ id, name, price }) {
  return (
    <tr>
      <td>{id}</td>
      <td>{name}</td>
      <td>{price}</td>
    </tr>
  );
}

function JuiceList() {
  const juices = [
    { id: 1, name: "Beetroot Juice", price: 50 },
    { id: 2, name: "Grape Juice", price: 40 },
    { id: 3, name: "Mango Juice", price: 60 },
    { id: 4, name: "Papaya Juice", price: 70 },
  ];

  return (
    <div>
      <h2>Juice List</h2>
      <table border="1" cellPadding="10" style={{ borderCollapse: "collapse" }}>
        <thead>
          <tr>
            <th>ID</th>
            <th>Juice Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {juices.map((juice) => (
            <Juice key={juice.id} {...juice} />
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default JuiceList;//its mandatory to export the component to import it in App.js because im creating separate file for the component.
