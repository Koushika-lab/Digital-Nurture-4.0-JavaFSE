import React from 'react';

function GuestPage() {
  const flights = [
    { id: 1, from: 'Hyderabad', to: 'Delhi', time: '10:00 AM' },
    { id: 2, from: 'Bangalore', to: 'Mumbai', time: '1:00 PM' },
  ];

  return (
    <div>
      <h3>Available Flights</h3>
      <ul>
        {flights.map((flight) => (
          <li key={flight.id}>
            {flight.from} → {flight.to} at {flight.time}
          </li>
        ))}
      </ul>
      <p><i>Login to book tickets</i></p>
    </div>
  );
}

export default GuestPage;
