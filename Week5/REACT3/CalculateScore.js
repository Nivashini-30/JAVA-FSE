import React from 'react';
import '../Stylesheets/mystyle.css';

const percentToDecimal = (decimal) => {
  if (isNaN(decimal) || !isFinite(decimal)) {
    return "0.00%";
  }
  return (decimal.toFixed(2) + '%');
};

const calcScore = (total, goal) => {
  const parsedTotal = parseFloat(total);
  const parsedGoal = parseFloat(goal);
  
  if (parsedGoal === 0) return "0.00%";
  return percentToDecimal(parsedTotal / parsedGoal);
};

export const CalculateScore = ({ Name, School, total, goal }) => {
  return (
    <div className="formatstyle">
      <h1><span style={{ color: 'Brown' }}>Student Details:</span></h1>
      <div className="Name">
        <b><span>Name: </span></b>
        <span>{Name}</span>
      </div>
      <div className="School">
        <b><span>School: </span></b>
        <span>{School}</span>
      </div>
      <div className="Total">
        <b><span>Total: </span></b>
        <span>{total}</span>
        <span> Marks</span>
      </div>
      <div className="Score">
        <b>Score: </b>
        <span>
          {calcScore(total, goal)}
        </span>
      </div>
    </div>
  );
};