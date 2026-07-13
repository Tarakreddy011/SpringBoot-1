# Dependency Injection (DI) in Spring Boot

## What is Dependency Injection?

Dependency Injection (DI) is a design pattern where the Spring Framework creates objects and provides their dependencies automatically instead of the programmer creating them using the `new` keyword.

Instead of writing:

```java
OrderService orderService = new OrderService();
```

Spring creates the object and injects it wherever it is required.

---

# Why Dependency Injection?

Without DI:

- Objects are tightly coupled.
- Difficult to test.
- Difficult to replace implementations.
- Manual object creation.

With DI:

- Loose coupling.
- Easy to maintain.
- Easy to test.
- Spring manages object creation.

---

# Real-Life Example

Imagine a Car needs an Engine.

Without DI:

The car creates its own engine.

```
Car
 └── creates Engine
```

If you want to replace the engine, you must modify the Car class.

With DI:

Someone else provides the engine to the car.

```
Spring Container
       │
       ▼
    Engine Object
       │
       ▼
      Car
```

The Car only knows it needs an Engine.

---

# What is a Dependency?

A dependency is an object required by another object.

Example:

```
OrderService
      │
      ▼
NotificationService
```

Here,

- OrderService is dependent.
- NotificationService is the dependency.

---

# How Spring Performs Dependency Injection

1. Spring starts.
2. It scans classes.
3. Creates objects (Beans).
4. Stores them in the IoC Container.
5. Injects required objects automatically.

```
Application Starts
        │
        ▼
Component Scan
        │
        ▼
Create Beans
        │
        ▼
IoC Container
        │
        ▼
Inject Dependencies
```

---

# Types of Dependency Injection

There are three types:

## 1. Constructor Injection (Recommended)

Dependencies are provided through the constructor.

Advantages:

- Immutable objects
- Easy testing
- Dependency is mandatory
- Recommended by Spring

---

## 2. Setter Injection

Dependencies are provided through setter methods.

Advantages:

- Dependency is optional
- Can change dependency later

Disadvantages:

- Object may remain partially initialized.

---

## 3. Field Injection

Dependencies are injected directly into fields.

Advantages:

- Less code

Disadvantages:

- Hard to test
- Difficult to mock
- Not recommended in production

---

# Constructor Injection Example

```
StudentService
      │
      ▼
StudentRepository
```

Spring creates:

- StudentRepository Bean
- StudentService Bean

Then injects StudentRepository into StudentService.

---

# Setter Injection Example

Spring creates:

```
StudentService
```

Later,

```
setStudentRepository(...)
```

is called.

---

# Field Injection Example

Spring injects the dependency directly into the field.

```
StudentService
    │
    ▼
StudentRepository
```

---

# Why Constructor Injection is Preferred

- Dependency cannot be null.
- Makes classes immutable.
- Easier unit testing.
- Recommended by Spring Team.

---

# Dependency Injection Annotations

## @Component

Marks a class as a Spring Bean.

Example:

```
@Component
public class NotificationService {}
```

---

## @Service

Used for business logic classes.

```
@Service
public class StudentService {}
```

---

## @Repository

Used for database-related classes.

```
@Repository
public class StudentRepository {}
```

---

## @Controller

Used in Spring MVC applications.

Handles HTTP requests.

---

## @RestController

Used to create REST APIs.

Returns JSON data.

---

## @Autowired

Tells Spring to inject the required dependency automatically.

---

# What is IoC?

IoC stands for **Inversion of Control**.

Normally:

```
Programmer
     │
creates objects
```

With Spring:

```
Spring Container
      │
creates objects
```

Control shifts from the programmer to Spring.

---

# What is a Bean?

A Bean is an object created and managed by the Spring Container.

Examples:

- StudentService
- StudentRepository
- NotificationService
- PaymentService

---

# Bean Lifecycle

```
Application Starts
        │
        ▼
Bean Created
        │
        ▼
Dependencies Injected
        │
        ▼
Bean Ready
        │
        ▼
Bean Destroyed
```

---

# Advantages of Dependency Injection

- Loose coupling
- Better code reuse
- Easy testing
- Better maintainability
- Easier debugging
- Cleaner architecture

---

# Disadvantages

- Slight learning curve
- Can become confusing in very large projects
- Too many Beans may increase startup time

---

# Interview Questions

### What is Dependency Injection?

A design pattern where Spring provides required objects instead of the programmer creating them.

---

### What is a Dependency?

An object required by another object.

---

### What is IoC?

The responsibility of creating and managing objects is transferred from the programmer to the Spring Container.

---

### What is a Bean?

An object managed by the Spring IoC Container.

---

### Which Dependency Injection is recommended?

Constructor Injection.

---

### Difference between IoC and DI

| IoC | DI |
|-----|----|
| Principle | Technique |
| Spring controls object creation | Spring injects dependencies |
| Makes application loosely coupled | One implementation of IoC |

---

# Quick Revision

```
Dependency
↓
Object required by another object

DI
↓
Spring injects dependencies

IoC
↓
Spring controls object creation

Bean
↓
Object managed by Spring

Container
↓
Stores Beans

Best Injection
↓
Constructor Injection

Main Annotation
↓
@Autowired

Business Layer
↓
@Service

Database Layer
↓
@Repository

General Bean
↓
@Component

REST API
↓
@RestController
```

---

# Summary

- Dependency Injection is a core feature of Spring.
- Spring automatically creates and injects objects.
- It promotes loose coupling and easier testing.
- Constructor Injection is the recommended approach.
- Spring manages Beans inside the IoC Container.

---

# Spring Boot
- Http methods
- - GET
- - POST
- - PUT
- - DELETE
---

