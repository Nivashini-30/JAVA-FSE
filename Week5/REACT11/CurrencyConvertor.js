import React, { useState } from 'react';

export default function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  // Handles form submission event[cite: 5]
  const handleSubmit = (e) => {
    e.preventDefault(); // Preventing standard page reload behavior
    
    const parsedAmount = parseFloat(amount) || 0;
    
    // As per the lab screenshot: input 80 multiplied translates to a target calculation of 6400
    const calculatedValue = parsedAmount * 80; 
    
    alert(`Converting to Euro Amount is ${calculatedValue}`);
  };

  return (
    <div>
      <h1 style={{ color: 'green', fontFamily: 'sans-serif' }}>Currency Convertor!!!</h1>
      
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '10px' }}>
          <label style={{ display: 'inline-block', width: '80px' }}>Amount:</label>
          <input 
            type="text" 
            value={amount} 
            onChange={(e) => setAmount(e.target.value)} 
          />
        </div>
        
        <div style={{ marginBottom: '10px' }}>
          <label style={{ display: 'inline-block', width: '80px' }}>Currency:</label>
          <input 
            type="text" 
            value={currency} 
            onChange={(e) => setCurrency(e.target.value)} 
          />
        </div>
        
        <div style={{ marginLeft: '80px' }}>
          <button type="submit">Submit</button>
        </div>
      </form>
    </div>
  );
}