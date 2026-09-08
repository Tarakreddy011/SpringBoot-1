# Spring Boot Learning Hub & Hands-on Practice

A collection of RESTful APIs, Spring ecosystem components, and core backend concepts built during Placement Enhancement Program (PEP) and summer technical training. This repository serves as a hands-on learning workspace for mastering Java backend development using Spring Boot.

## Core Concepts Implemented

* **REST API Development:** Endpoint creation, request mapping, and handling HTTP methods.
* **DTO Pattern & Data Transfer:** Implementing Data Transfer Objects (DTOs) for clean separation between database entities and API request/response payloads.
* **Global Exception Handling:** Centralized exception handling using `@ControllerAdvice` and `@ExceptionHandler` for custom error responses.
* **Input Validation:** Declarative request body validation using Spring Boot Starter Validation annotations (`@NotNull`, `@Size`, `@Email`, etc.).
* **Dependency Injection & IoC:** Exploring Spring IoC container management, component scanning, bean lifecycles, scopes, and circular dependency resolution.

## Tech Stack

* **Language:** Java
* **Framework:** Spring Boot
* **Build Tool:** Maven (`mvnw` / `pom.xml`)
* **Libraries:** Spring Web, Spring Boot Validation

## Project Structure

```text
SpringBoot-1/
├── .mvn/              # Maven wrapper configuration
├── src/               # Application source code (Controllers, Services, DTOs, Exceptions)
├── mvnw / mvnw.cmd    # Cross-platform Maven executable scripts
└── pom.xml            # Project dependencies and build settings

```

## Getting Started

### Prerequisites

* JDK 17 or higher
* Maven (optional, wrapper included)

### Running the Application

1. **Clone the Repository:**
```bash
git clone https://github.com/Tarakreddy011/SpringBoot-1.git
cd SpringBoot-1

```


2. **Build and Run:**
* **Linux/macOS:**
```bash
./mvnw spring-boot:run

```


* **Windows:**
```cmd
mvnw.cmd spring-boot:run

```
