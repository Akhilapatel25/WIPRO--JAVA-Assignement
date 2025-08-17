import React from "react";

function TempleList() {
  const temples = [
    {
      id: 1,
      name: "Kashi Vishwanath Temple",
      location: "Varanasi, Uttar Pradesh",
      deities: ["Shiva"],
    },
    {
      id: 2,
      name: "Sri Venkateswara Temple",
      location: "Tirupati, Andhra Pradesh",
      deities: ["Venkateswara", "Lakshmi"],
    },
    {
       id: 3,
      name: "Prem Mandir",
      location: "Vrindavan, Uttar Pradesh",
      deities: ["Radha", "Krishna"],
    },
  ];

  return (
    <div>
      <h2>Famous Temples in India</h2>
      <table border="1" cellPadding="8" style={{ borderCollapse: "collapse" }}>
        <thead>
          <tr>
            <th>ID</th>
            <th>Temple Name</th>
            <th>Location</th>
            <th>Deities</th>
          </tr>
        </thead>
        <tbody>
          {temples.map((temple) => (
            <tr key={temple.id}>
              <td>{temple.id}</td>
              <td>{temple.name}</td>
              <td>{temple.location}</td>
              <td>
                <ul>
                  {temple.deities.map((deity, index) => (
                    <li key={index}>{deity}</li>
                  ))}
                </ul>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default TempleList;//its mandatory to export the component to import it in App.js because im creating separate file for the component.
