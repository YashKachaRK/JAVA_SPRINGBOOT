# 11. Abstraction.md

# Java Abstraction

## What is Abstraction?

Abstraction is the process of hiding implementation details and showing only essential functionality to the user.

### Real-Life Example

A car driver only knows:

- Start the car
- Accelerate
- Brake

The driver does not need to know how the engine works internally.

This is called **Abstraction**.

---

# Why Use Abstraction?

- Hides unnecessary details
- Increases security
- Reduces complexity
- Improves maintainability
- Focuses on what an object does rather than how it does it

---

# Ways to Achieve Abstraction

Java provides two ways:

1. Abstract Class
2. Interface

---

# Abstract Class

A class declared with the `abstract` keyword.

### Features

- Can have abstract methods
- Can have normal methods
- Cannot create objects directly

### Syntax

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}
```

---

# Abstract Method

A method without a body.

```java
abstract void sound();
```

- Must be implemented by child classes.

---

# Example: Abstract Class

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
```

### Output

```text
Dog Barks
Animal is eating
```

---

# Why Can't We Create an Object of an Abstract Class?

❌ Invalid

```java
Animal a = new Animal();
```

Because an abstract class may contain incomplete methods.

---

# Abstract Class with Constructor

Abstract classes can have constructors.

```java
abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }

    abstract void sound();
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog Barks");
    }
}
```

### Output

```text
Animal Constructor
Dog Barks
```

---

# Multiple Abstract Methods

```java
abstract class Shape {

    abstract void draw();

    abstract void area();
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }

    void area() {
        System.out.println("Calculating Area");
    }
}
```

---

# Interface

An interface is a blueprint of a class.

Used to achieve 100% abstraction.

### Syntax

```java
interface Animal {

    void sound();
}
```

---

# Implementing an Interface

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog Barks");
    }
}
```

---

# Interface Example

```java
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car Started");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();
    }
}
```

### Output

```text
Car Started
```

---

# Multiple Inheritance Using Interfaces

```java
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {

    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }
}
```

---

# Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|-----------|---------------|-----------|
| Keyword | abstract | interface |
| Object Creation | Not Allowed | Not Allowed |
| Constructors | Yes | No |
| Normal Methods | Yes | Yes (default/static) |
| Abstract Methods | Yes | Yes |
| Multiple Inheritance | No | Yes |
| Variables | Any Type | public static final |

---

# Real-Life Example

## Abstract Class

```java
abstract class Bank {

    abstract double interestRate();
}

class SBI extends Bank {

    double interestRate() {
        return 7.5;
    }
}
```

---

## Interface

```java
interface Payment {

    void pay(double amount);
}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid: " + amount);
    }
}
```

---

# Key Rules

### Abstract Class

✔ Can contain:

- Constructors
- Variables
- Abstract Methods
- Normal Methods

✔ Can extend another class

---

### Interface

✔ Supports Multiple Inheritance

✔ Methods are public by default

✔ Variables are:

```java
public static final
```

---

# Interview Questions

## Q1. What is Abstraction?

Abstraction is the process of hiding implementation details and showing only essential features.

---

## Q2. How is Abstraction achieved in Java?

- Abstract Class
- Interface

---

## Q3. Can we create an object of an Abstract Class?

No.

```java
Animal a = new Animal(); // Error
```

---

## Q4. Can Abstract Classes have constructors?

Yes.

---

## Q5. Can an Abstract Class contain normal methods?

Yes.

---

## Q6. Can an Interface have method bodies?

Yes, using:

- default methods
- static methods

(Java 8+)

---

## Q7. Can an Interface have constructors?

No.

---

## Q8. Why are Interfaces used?

- Achieve abstraction
- Support multiple inheritance
- Define common behavior

---

## Q9. Difference between Abstraction and Encapsulation?

| Abstraction | Encapsulation |
|-------------|--------------|
| Hides implementation | Hides data |
| Focuses on behavior | Focuses on security |
| Achieved using Abstract Class & Interface | Achieved using private variables |

---

## Q10. Which is better: Abstract Class or Interface?

Use:

- Abstract Class → when classes share common code.
- Interface → when classes only share behavior.

---

# Summary

- Abstraction hides implementation details.
- Achieved using Abstract Classes and Interfaces.
- Abstract Classes can contain abstract and normal methods.
- Interfaces support multiple inheritance.
- Abstract Classes can have constructors.
- Interfaces cannot have constructors.
- Abstraction reduces complexity and improves code design.