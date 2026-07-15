# Ticket Booking App (React Hands-On 12)

A React application designed to demonstrate conditional rendering techniques, the use of element variables, and strategies to prevent components from rendering in specific application states[cite: 5].

## Features & Objectives

* **Conditional Rendering:** Renders different layout states ("Please sign up." or "Welcome back") dynamically depending on whether a user is logged in or out[cite: 5].
* **Element Variables:** Stores React elements inside standard JavaScript variables to switch between custom `LoginButton` and `LogoutButton` elements dynamically[cite: 5].
* **Preventing Component Rendering:** Demonstrates structural control by returning `null` inside the booking interaction sub-component, preventing unauthenticated guest users from seeing or accessing the ticket booking panel[cite: 5].
* **Props & State Management:** Coordinates component communication through dynamic prop passing and structural event parameters[cite: 5].

---

## Project Structure

ticketbookingapp/
├── public/
│   └── index.html            
├── src/
│   ├── App.js                
│   ├── FlightDetails.js      
│   └── index.js              
└── package.json              
