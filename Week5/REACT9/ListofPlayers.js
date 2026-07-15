import React from 'react';

// Component to list all players using map
export function ListofPlayers({ players }) {
  return (
    <div>
      {players.map((item, index) => {
        return (
          <div key={index}>
            <li>Mr. {item.name} <span>{item.score}</span></li>
          </div>
        );
      })}
    </div>
  );
}

// Component to list players with score below 70 using arrow functions
export function Scorebelow70({ players }) {
  const players70 = [];
  
  // Filtering scores <= 70 using map and push[cite: 3]
  players.map((item) => {
    if (item.score <= 70) {
      players70.push(item);
    }
    return item;
  });

  return (
    <div>
      {players70.map((item, index) => {
        return (
          <div key={index}>
            <li>Mr. {item.name} <span>{item.score}</span></li>
          </div>
        );
      })}
    </div>
  );
}