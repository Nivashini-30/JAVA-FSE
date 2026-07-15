import React, { useState } from 'react';
import FlightDetails from './FlightDetails';

// Hint Component 1: Login Button
function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

// Hint Component 2: Logout Button
function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

// Sub-components for Greeting structures
function UserGreeting() {
  return <h1>Welcome back</h1>;
}

function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

// Hint Component 3: Greeting Router
function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  // Implementing Element Variables for Conditional Rendering
  let button;
  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div style={{ padding: '40px', fontFamily: 'sans-serif' }}>
      {/* Greeting routing component display */}
      <Greeting isLoggedIn={isLoggedIn} />
      
      {/* Render the saved element variable */}
      <div style={{ marginTop: '15px' }}>
        {button}
      </div>

      {/* Flight tracking display context */}
      <FlightDetails isLoggedIn={isLoggedIn} />
    </div>
  );
}

export default App;