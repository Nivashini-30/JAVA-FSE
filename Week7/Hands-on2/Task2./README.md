# Student Course Portal - Hands-on 2 (Task 2: Component Architecture & Layout)

This repository contains the completed implementation for **Task 2 of Hands-on 2** in the Student Course Portal Angular application.

---

## Task Overview

The objective of this task is to establish a clean component architecture by generating page components using the Angular CLI and assembling them into a cohesive layout within `AppComponent`:
1. **Header Component** (`app-header`): Navigation bar with portal title and placeholder links.
2. **Home Component** (`app-home`): Welcome banner and dashboard summary statistics.
3. **Course List Component** (`app-course-list`): View placeholder for the course catalog.
4. **Student Profile Component** (`app-student-profile`): View placeholder for user profile details.

---

## Implemented Components & Structure

| Component | Selector | Purpose / Content |
| :--- | :--- | :--- |
| **HeaderComponent** | `<app-header>` | Renders portal title "Student Course Portal" and navigation links (`Home`, `Courses`, `Profile`). |
| **HomeComponent** | `<app-home>` | Renders welcome heading, brief description, and hardcoded summary stats (`Courses Available: 12`, `Enrolled: 3`, `GPA: 3.8`). |
| **CourseListComponent** | `<app-course-list>` | Standalone component created for academic catalog views. |
| **StudentProfileComponent** | `<app-student-profile>` | Standalone component created for student profile management. |

---

## File Structure

```text
Task2/
├── angular.json
├── package.json
├── tsconfig.json
├── tsconfig.app.json
└── src/
    ├── index.html
    ├── main.ts
    ├── styles.css
    └── app/
        ├── app.component.html
        ├── app.component.ts
        ├── app.config.ts
        ├── app.routes.ts
        ├── components/
        │   └── header/
        │       ├── header.component.html
        │       ├── header.component.ts
        │       └── header.component.spec.ts
        └── pages/
            ├── course-list/
            │   ├── course-list.component.html
            │   ├── course-list.component.ts
            │   └── course-list.component.spec.ts
            ├── home/
            │   ├── home.component.html
            │   ├── home.component.ts
            │   └── home.component.spec.ts
            └── student-profile/
                ├── student-profile.component.html
                ├── student-profile.component.ts
                └── student-profile.component.spec.ts
