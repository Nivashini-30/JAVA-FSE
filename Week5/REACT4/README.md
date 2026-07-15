# Blog App (React Lifecycle Hooks)

A React class-component-based application designed to demonstrate the implementation of component lifecycle hooks, specifically fetching API data on mount and handling runtime errors cleanly. Built as part of the CTS Week 5 React hands-on curriculum.

## Features & Objectives

* **componentDidMount():** Used to trigger the `loadPosts()` method to fetch data from an external REST API (`JSONPlaceholder`) immediately after the component mounts.
* **componentDidCatch():** Implements error boundaries to gracefully catch runtime errors and display them as alert messages to keep the app robust[cite: 1].
* **OOP Integration:** Maps the raw JSON response to a structured local `Post` JavaScript class before storing it in state[cite: 1].

---

## Project Structure

React4/
├── public/
│   └── index.html         
├── src/
│   ├── Post.js           
│   ├── Posts.js          
│   ├── App.js           
│   └── index.js         
├── package.json
└── README.md
