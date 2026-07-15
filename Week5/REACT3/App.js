import React from 'react';
import { CalculateScore } from './Components/CalculateScore'; // Notice capital 'C'[cite: 3]

function App() {
  return (
    <div>
      <CalculateScore 
        Name="Steeve" 
        School="DNV Public School" 
        total={284} 
        goal={3} 
      />
    </div>
  );
}

export default App;