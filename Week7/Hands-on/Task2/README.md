# Student Course Portal - Task 2: Create and Organise Components

This repository contains the implementation of **Task 2** for the Student Course Portal Angular application.

## Task Overview

The goal of this task is to create and structure core page components using the Angular CLI, design layout templates for navigation and key student statistics, and integrate them into the root component.

## Key Steps Completed

1. **Component Generation**:
   - Generated feature components using Angular CLI:
     - `components/header`
     - `pages/home`
     - `pages/course-list`
     - `pages/student-profile`

2. **Header Component (`HeaderComponent`)**:
   - Built a navigation header displaying the title **Student Course Portal**.
   - Added navigation placeholder links: `Home`, `Courses`, and `Profile`.

3. **Home Component (`HomeComponent`)**:
   - Created a welcome section with an `<h1>` heading and introductory paragraph.
   - Designed a summary stats row displaying hardcoded values:
     - **Courses Available**: 12
     - **Enrolled**: 3
     - **GPA**: 3.8

4. **Root Component Integration (`AppComponent`)**:
   - Integrated `<app-header>` and `<app-home>` into `app.component.html`, replacing default boilerplate content.
   - Configured Standalone Component imports in `app.component.ts`.

---

## Project Structure
```text
src/
├── app/
│   ├── components/
│   │   └── header/
│   │       ├── header.component.html
│   │       ├── header.component.spec.ts
│   │       └── header.component.ts
│   ├── pages/
│   │   ├── course-list/
│   │   │   ├── course-list.component.html
│   │   │   ├── course-list.component.spec.ts
│   │   │   └── course-list.component.ts
│   │   ├── home/
│   │   │   ├── home.component.html
│   │   │   ├── home.component.spec.ts
│   │   │   └── home.component.ts
│   │   └── student-profile/
│   │       ├── student-profile.component.html
│   │       ├── student-profile.component.spec.ts
│   │       └── student-profile.component.ts
│   ├── app.component.html
│   ├── app.component.spec.ts
│   ├── app.component.ts
│   ├── app.config.ts
│   └── app.routes.ts
├── index.html
├── main.ts
└── styles.css
