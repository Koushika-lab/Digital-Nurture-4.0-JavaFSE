import React from 'react';

function UserPage() {
  const handleBooking = (flightId) => {
    alert(`Ticket booked for flight ID: ${flightId}`);
  };

  const flights = [
    { id: 1, from: 'Hyderabad', to: 'Delhi', time: '10:00 AM' },
    { id: 2, from: 'Bangalore', to: 'Mumbai', time: '1:00 PM' },
  ];

  return (
    <div>
      <h3>Book Your Flight</h3>
      <ul>
        {flights.map((flight) => (
          <li key={flight.id}>
            {flight.from} → {flight.to} at {flight.time}
            <button onClick={() => handleBooking(flight.id)} style={{ marginLeft: '10px' }}>
              Book Ticket
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default UserPage;
