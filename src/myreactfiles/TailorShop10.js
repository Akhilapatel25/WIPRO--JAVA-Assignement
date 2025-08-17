import React from "react";

function ServiceCard({ service }) {
  return (
    <div className="col-md-4 mb-4">
      <div className="card shadow-sm">
        <div className="card-body">
          <h5 className="card-title">{service.serviceName}</h5>
          <p className="card-text">Price: ₹{service.price}</p>
          <h6>Fabrics Available:</h6>
          <ul>
            {/* nested map} */}
             {service.fabricsAvailable.map((fabric, index) => (  
              <li key={index}>{fabric}</li>
            ))}
          </ul>
         </div>
      </div>
    </div>
  );
}

function TailorShop() {
  const tailoringServices = [
    {
      serviceName: "Shirts",
      price: 500,
      fabricsAvailable: ["Cotton", "Linen", "Polyester"],
    },
    {
      serviceName: "Pants",
      price: 800,
      fabricsAvailable: ["Denim", "Linen", "Twill"],
    },
    {
      serviceName: "Lehenga",
      price: 2500,
      fabricsAvailable: ["Silk", "Velvet", "Georgette"],
    },
    {
      serviceName: "Blouse",
      price: 700,
      fabricsAvailable: ["Cotton Silk", "Brocade", "Net"],
    },
  ];

  return (
    <div className="container my-4">
      <h2 className="text-center mb-4">Tailoring Shop Services</h2>
      <div className="row">
        {tailoringServices.map((service, index) => (
          <ServiceCard key={index} service={service} />
        ))}
      </div>
    </div>
  );
}

export default TailorShop;//its mandatory to export the component to import it in App.js because im creating separate file for the component.
