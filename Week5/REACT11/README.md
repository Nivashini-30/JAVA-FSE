# Event Examples App (React Hands-On 11)

An interactive React application built to explore and implement event handling concepts, synthetic events, and state mutations within form elements[cite: 5].

## Features & Objectives

* **Multi-Method Execution:** The "Increment" button sequentially calls multiple distinct actions—incrementing the calculation counter state and firing an alert banner message[cite: 5].
* **Parameterized Event Handlers:** The "Say welcome" button utilizes inline arrow functions to pass explicit argument strings into method definitions[cite: 5].
* **Synthetic Events:** Demonstrates React's synthetic event wrappers by intercepting element clicks and parsing tracking arguments to produce text flags[cite: 5].
* **Form Submission handling:** Captures amount input values, overrides default browser form reload behaviors (`e.preventDefault()`), and evaluates output conversions directly on click[cite: 5].

---

## Project Structure

eventexamplesapp/
├── public/
│   └── index.html           
├── src/
│   ├── App.js                 
│   ├── CurrencyConvertor.js  
│   └── index.js              
└── package.json              
