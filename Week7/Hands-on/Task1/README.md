# Hands-On Task 1: Scaffold and Explore the Angular Project

## Task Description
This project fulfills **Task 1: Scaffold and Explore the Angular Project**. It covers setting up an Angular workspace using the Angular CLI, exploring the default project directory structure, documenting core workspace configuration files, running local development servers, and inspecting production build outputs and performance budget limits.

## Objectives
* Scaffold the Angular application (`student-course-portal` / `Task1`) using the Angular CLI.
* Document core project files and their specific purposes in a `notes.txt` file.
* Verify application functionality by running a local development server.
* Compile production-ready static assets in the `dist/` directory.
* Locate and analyze build budget limits within `angular.json`.

## Tech Stack & Tools
* **Framework:** Angular 17+ (Standalone Component Architecture)
* **Language:** TypeScript, HTML5, CSS3
* **Tooling:** Angular CLI, Node.js, npm

## Repository Structure

Task1/
├── notes.txt                     # File descriptions (Task requirement)
├── package.json                  # Dependencies, scripts, and metadata
├── angular.json                  # CLI configuration & build budget settings
├── tsconfig.json                 # Main TypeScript compiler options
├── tsconfig.app.json             # Application TypeScript configuration
├── README.md                     # Project documentation
└── src/
    ├── index.html                # Single-page host HTML (<app-root>)
    ├── main.ts                   # Bootstrap entry point
    ├── styles.css                # Application global styles
    └── app/
        ├── app.config.ts         # Application providers and routing config
        ├── app.routes.ts         # Route declarations
        ├── app.component.ts      # Root standalone component logic
        ├── app.component.html    # Root component template
        └── app.component.css     # Root component styles
