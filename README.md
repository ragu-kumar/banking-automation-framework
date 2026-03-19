# Banking Automation Framework (Selenium + TestNG + REST Assured)

## Overview

This project demonstrates a **scalable hybrid test automation framework** designed for banking/fintech applications.
It combines **UI automation (Selenium)** and **API validation (REST Assured)** to achieve end-to-end test coverage.

The framework is built with **maintainability, scalability, and parallel execution** in mind.

---

## Key Features

*  Page Object Model (POM) design pattern
*  Thread-safe WebDriver using ThreadLocal
*  Config-driven execution (no hardcoding)
*  Parallel execution using TestNG
*  UI + API integration testing
*  Centralized driver and configuration management
*  Clean layered architecture

---

## Project Structure

src/main/java
  base        → Driver setup and test initialization
  pages       → Page Object classes (UI interactions)
  services    → Business logic layer (test workflows)
  api         → API validation layer
  utils       → Common utilities (config, reporting)

src/test/java
  tests       → Test classes (end-to-end scenarios)

src/main/resources
  config.properties → Environment configuration

Root
  testng.xml  → Test execution configuration
  pom.xml     → Dependency management

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* REST Assured
* Maven

---

## Test Flow Covered

* Login to banking application
* Select customer
* Perform deposit
* Perform withdrawal
* Validate flow using API

---

## How to Run

### Using Eclipse

* Right-click on `testng.xml`
* Run as → TestNG Suite

### Using Maven

```
mvn clean test
```

---

## Configuration

Update values in:

```
src/main/resources/config.properties
```

Example:

```
browser=chrome
url=https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
```

---

## Design Highlights

### ThreadLocal WebDriver

Ensures safe parallel execution by isolating driver instances per thread.

### Layered Architecture

* Test → Service → Page → Driver
  Clear separation improves maintainability.

### Config Driven

No hardcoded values → easy environment switch.

---

## Future Enhancements

* CI/CD integration (Jenkins/GitHub Actions)
* Docker execution
* Advanced reporting (Allure/Extent)
* Test data management
* Cross-browser execution

---

## Author

Ragu Kumar
Senior QA Automation Engineer

---

## Note

This framework is designed to demonstrate **real-world automation architecture** rather than simple test scripts.
