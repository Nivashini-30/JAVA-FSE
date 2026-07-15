# Student Score Calculator (React App)

A lightweight React application that displays student details and calculates their score percentage safely using props. Built as part of the CTS Week 5 React hands-on curriculum.

## Features

* **Dynamic Component Rendering:** Uses functional components to dynamically render student details (`Name`, `School`, `Total Marks`).
* **Safe Score Calculation:** Implements a bulletproof division algorithm that handles floating-point math safely and prevents application crashes if input values are missing or zero.
* **Component Styling:** Styled cleanly using external CSS.

---

## Project Structure

React3/
├── public/
├── src/
│   ├── Components/
│   │   └── CalculateScore.js   
│   ├── Stylesheets/
│   │   └── mystyle.css        
│   ├── App.js                 
│   └── index.js               
├── package.json
└── README.md
