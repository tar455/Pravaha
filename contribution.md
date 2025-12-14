# Contributing to Pravaha Browser

Thank you for your interest in contributing to **Pravaha** 🎉

Pravaha is an experimental, lightweight browser built using **JavaFX + React**. We welcome contributions of all kinds — bug fixes, features, documentation, UI improvements, and ideas.

---

## 📌 Table of Contents

* Code of Conduct
* How Can I Contribute?
* Project Architecture Overview
* Getting Started
* Development Workflow
* Commit Message Guidelines
* Pull Request Process
* Reporting Bugs
* Feature Requests
* Style Guidelines
* Community & Support

---

## 🤝 Code of Conduct

Please be respectful, inclusive, and constructive in all interactions. Harassment, discrimination, or abusive behavior will not be tolerated.

---

## 🛠️ How Can I Contribute?

You can contribute by:

* Fixing bugs
* Improving performance
* Adding new browser features
* Enhancing UI/UX (React)
* Improving JavaFX-WebView integration
* Writing or improving documentation
* Reviewing pull requests

No contribution is too small 🙂

---

## 🧱 Project Architecture Overview

```
backend-javaFx/
 ├── src/main/java/        # JavaFX application & browser logic
 ├── src/main/resources/
 │    └── react-pravaha-ui/ # React production build (served by WebView)
 ├── pom.xml
 └── react-pravaha-ui/      # React source code (Vite)
      ├── src/
      ├── package.json
      └── vite.config.js
```

* **JavaFX**: Windowing, WebView, native integration
* **React (Vite)**: Browser UI (address bar, buttons, tabs)
* **JS Bridge**: Communication between React and JavaFX

---

## 🚀 Getting Started

### Prerequisites

* Java 17+
* Maven 3.8+
* Node.js 18+
* npm or yarn

### Clone the Repository

```bash
git clone https://github.com/<your-username>/pravaha.git
cd pravaha
```

---

## 🧪 Development Workflow

### Frontend (React)

```bash
cd react-pravaha-ui
npm install
npm run dev
```

For production build:

```bash
npm run build
npm run copy-build
```

This copies the build output to:

```
backend-javaFx/src/main/resources/react-pravaha-ui/
```

---

### Backend (JavaFX)

```bash
cd backend-javaFx
mvn clean javafx:run
```

---

## 🧾 Commit Message Guidelines

Follow a clear and meaningful format:

```
<type>: <short description>

[optional body]
```

### Examples

* `feat: add fullscreen support for video playback`
* `fix: resolve WebView navigation issue`
* `docs: update CONTRIBUTING guidelines`

Types:

* feat
* fix
* docs
* refactor
* test
* chore

---

## 🔁 Pull Request Process

1. Fork the repository
2. Create a feature branch

   ```bash
   git checkout -b feature/my-feature
   ```
3. Commit your changes
4. Push to your fork
5. Open a Pull Request (PR)

### PR Checklist

* Code builds successfully
* No breaking changes (or clearly documented)
* Follows project coding style
* PR description explains **what & why**

---

## 🐞 Reporting Bugs

Please open an issue and include:

* OS (Linux / Windows / macOS)
* Java version
* Steps to reproduce
* Expected vs actual behavior
* Screenshots or logs (if available)

---

## 💡 Feature Requests

We encourage feature ideas!

When opening a feature request:

* Explain the use case
* Describe expected behavior
* Mention similar browser behavior (if any)

---

## 🎨 Style Guidelines

### Java

* Follow standard Java conventions
* Prefer composition over inheritance
* Keep UI logic out of controllers where possible

### React

* Functional components
* Hooks-based design
* Clean, minimal UI (browser-first UX)

---

## 📬 Community & Support

* Open an issue for bugs or discussions
* Be patient and respectful
* Help others when you can

---

## ❤️ Final Note

Pravaha is a learning-driven, experimental browser project.
Your contributions help make it better for everyone.

**Thank you for contributing!** 🚀
