# Student Course Portal - Hands-on 2 (Task 1: Data Binding Types)

This repository contains the completed implementation for **Task 1 of Hands-on 2** in the Student Course Portal Angular application[cite: 1].

---

## Task Overview

The objective of this task is to demonstrate Angular's four primary data binding mechanisms within a single standalone component (`HomeComponent`)[cite: 1]:
1. **String Interpolation** (`{{ portalName }}`)[cite: 1]
2. **Property Binding** (`[disabled]`)[cite: 1]
3. **Event Binding** (`(click)`)[cite: 1]
4. **Two-Way Data Binding** (`[(ngModel)]`)[cite: 1]

---

## Implemented Binding Types

| Binding Type | Syntax | Direction | Implementation in Task |
| :--- | :--- | :--- | :--- |
| **Interpolation** | `{{ portalName }}` | Component $\rightarrow$ DOM | Displays portal title dynamically in `<h1>` tag[cite: 1] |
| **Property Binding** | `[disabled]="!isPortalActive"` | Component $\rightarrow$ DOM Property | Controls the enabled/disabled state of the Enroll button[cite: 1] |
| **Event Binding** | `(click)="onEnrollClick()"` | DOM $\rightarrow$ Component | Triggers button click handler to update enrollment message[cite: 1] |
| **Two-Way Binding** | `[(ngModel)]="searchTerm"` | DOM $\leftrightarrow$ Component | Binds input field to component property for live search feedback[cite: 1] |

---

## Concept Explanation: `[property]` vs `[(ngModel)]`

* **`[property]` (One-Way Data Binding, Component $\rightarrow$ DOM):** Data flows in a single direction from the TypeScript component class to the DOM property[cite: 1]. Updates in the component reflect in the view, but user interactions on the DOM element do not update the TypeScript variable[cite: 1].
* **`[(ngModel)]` (Two-Way Data Binding, DOM $\leftrightarrow$ Component):** Data flows bidirectionally[cite: 1]. Updating the TypeScript property updates the input element, and typing into the input field instantly updates the component property[cite: 1]. Under the hood, `[(ngModel)]` is shorthand for `[ngModel]="prop" (ngModelChange)="prop=$event"`[cite: 1].

---

## File Structure

```text
Hands-on2/Task1/
├── angular.json
├── package.json
├── tsconfig.json
└── src/
    ├── index.html
    ├── main.ts
    ├── styles.css
    └── app/
        ├── app.component.ts
        ├── app.component.html
        ├── app.config.ts
        ├── app.routes.ts
        └── pages/
            └── home/
                ├── home.component.ts
                └── home.component.html
```[cite: 1]

---

## 🚀 Getting Started

### 1. Install Dependencies
```bash
npm install
```[cite: 1]

### 2. Run Local Development Server
```bash
ng serve
```[cite: 1]

Navigate to `http://localhost:4200/` in your browser[cite: 1].

---

## Commands to Commit and Push

Run the following commands in your VS Code terminal:

```bash
git add .
git commit -m "feat: implement all four data binding types in HomeComponent (Hands-on 2 Task 1)"
git push origin main
