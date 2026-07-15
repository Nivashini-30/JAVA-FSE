import React from 'react';

export default function FlightDetails({ isLoggedIn }) {
  const flights = [
    { id: "AI-101", from: "Chennai", to: "Delhi", time: "06:00 AM" },
    { id: "6E-532", from: "Bangalore", to: "Mumbai", time: "09:15 AM" }
  ];

  return (
    <div style={{ marginTop: '30px', fontFamily: 'sans-serif' }}>
      <h2>Available Flight Details (Public View)</h2>
      <table border="1" cellPadding="10" style={{ borderCollapse: 'collapse', width: '100%', maxWidth: '500px' }}>
        <thead>
          <tr>
            <th>Flight ID</th>
            <th>From</th>
            <th>To</th>
            <th>Departure</th>
          </tr>
        </thead>
        <tbody>
          {flights.map(flight => (
            <tr key={flight.id}>
              <td>{flight.id}</td>
              <td>{flight.from}</td>
              <td>{flight.to}</td>
              <td>{flight.time}</td>
            </tr>
          ))}
        </tbody>
      </table>

      {/* Conditional booking actions block */}
      <BookingActions isLoggedIn={isLoggedIn} />
    </div>
  );
}

// Child component showcasing how to prevent components from rendering
function BookingActions({ isLoggedIn }) {
  // If user is not logged in, prevent the booking interface from rendering entirely
  if (!isLoggedIn) {
    return null;
  }

  return (
    <div style={{ marginTop: '20px', padding: '15px', backgroundColor: '#e6f7ff', border: '1px solid #91d5ff', borderRadius: '4px', maxWidth: '500px' }}>
      <h3 style={{ color: '#0050b3', margin: '0 0 10px 0' }}>Booking Panel (Authenticated)</h3>
      <button onClick={() => alert("Ticket Booked Successfully!")} style={{ padding: '8px 16px', backgroundColor: '#1890ff', color: 'white', border: 'none', borderRadius: '4px', cursor: 'pointer' }}>
        Book Ticket Now
      </button>
    </div>
  );
}