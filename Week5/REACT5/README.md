# Cohorts Tracker (React Styling Lab)

An interactive React dashboard application that lists and tracks cohort details for Cognizant Academy teams. This application demonstrates how to style React components using CSS Modules and dynamic inline styles[cite: 2].

## Features & Objectives

* **CSS Modules:** Uses `.module.css` files to prevent global CSS class pollution and encapsulate card styles scoped to the specific component[cite: 2].
* **Dynamic Inline Styles:** Conditionally updates the title header color depending on the cohort's status attribute (`green` for ongoing, `blue` for other states)[cite: 2].
* **Styled Elements:** Custom styles applied to containers and sub-level list headers (`<dt>`) using explicit tag nested definitions[cite: 2].

---

## Project Structure

React5/
├── public/
│   └── index.html               
├── src/
│   ├── CohortDetails.js         
│   ├── CohortDetails.module.css 
│   ├── App.js                    
│   └── index.js                  
├── package.json                  
└── README.md                   
