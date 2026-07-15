import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [counter, setCounter] = useState(5);

  // Method 1: Increment values
  const incrementValue = () => {
    setCounter(prev => prev + 1);
  };

  // Method 2: Say Hello followed by a static message[cite: 5]
  const sayHello = () => {
    alert("Hello! Member1");
  };

  // Triggers multiple internal actions sequentially[cite: 5]
  const handleIncrementClick = () => {
    incrementValue();
    sayHello();
  };

  // Decrements counter status value[cite: 5]
  const handleDecrementClick = () => {
    setCounter(prev => prev - 1);
  };

  // Argument parameter acceptance handler[cite: 5]
  const sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic click interaction handler[cite: 5]
  const handlePress = (e) => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      {/* Renders structural counter status */}
      <div style={{ fontSize: '20px', marginBottom: '15px' }}>{counter}</div>
      
      <div style={{ display: 'flex', flexDirection: 'column', gap: '5px', width: '120px', marginBottom: '30px' }}>
        <button onClick={handleIncrementClick}>Increment</button>
        <button onClick={handleDecrementClick}>Decrement</button>
        <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
        <button onClick={handlePress}>Click on me</button>
      </div>

      {/* Embedded Secondary Form Component Module[cite: 5] */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;