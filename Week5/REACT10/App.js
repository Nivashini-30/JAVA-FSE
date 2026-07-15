import React from 'react';
import './App.css';

function App() {
  // 1. Element to display page header[cite: 4]
  const element = "Office Space";

  // Public placeholder image for office spaces[cite: 4]
  const sr = "https://images.unsplash.com/photo-1497366216548-37526070297c?auto=format&fit=crop&w=400&q=80";

  // 2. Attribute variable rendering the image tag[cite: 4]
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;

  // 3. Main office object[cite: 4]
  const ItemName = { Name: "DBS", Rent: 50000, Address: 'Chennai' };

  // 4. Determining the text style color based on rent threshold[cite: 4]
  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push('textRed');
  } else {
    colors.push('textGreen');
  }

  // 5. List of office space objects to loop through more data[cite: 4]
  const officeList = [
    { Name: "Premium Suites", Rent: 75000, Address: "Tech Park, Bangalore" },
    { Name: "Co-Working Hub", Rent: 45000, Address: "Nungambakkam, Chennai" },
    { Name: "Shared Desk Space", Rent: 55000, Address: "Madhapur, Hyderabad" }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      {/* Primary Office Element Display[cite: 4] */}
      <h1>{element} , at Affordable Range</h1>
      {jsxatt}
      
      <h1>Name: {ItemName.Name}</h1>
      {/* Display Rent class dynamically[cite: 4] */}
      <h3 className={colors[0]}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>

      <hr style={{ margin: '40px 0' }} />

      {/* Looping through additional office objects[cite: 4] */}
      <h2>Available Rental Properties</h2>
      {officeList.map((office, index) => {
        // Determine color class for each mapped item[cite: 4]
        let listColor = office.Rent <= 60000 ? 'textRed' : 'textGreen';
        
        return (
          <div key={index} className="office-card">
            <h3>Name: {office.Name}</h3>
            <p className={listColor}>Rent: Rs. {office.Rent}</p>
            <p>Address: {office.Address}</p>
          </div>
        );
      })}
    </div>
  );
}

export default App;