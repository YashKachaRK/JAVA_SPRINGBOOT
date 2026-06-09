# 10. Inheritance.md

# Java Inheritance

## What is Inheritance?

Inheritance is a mechanism in Java where one class acquires the properties and methods of another class.

- Parent Class (Super Class)
- Child Class (Sub Class)

It helps in:

- Code Reusability
- Method Overriding
- Extensibility

---

## Syntax

```java
class Parent {
    // Properties and Methods
}

class Child extends Parent {
    // Additional Properties and Methods
}
```

---

## Basic Example

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // Inherited method
        d.bark();  // Own method
    }
}
```

### Output

```text
Animal is eating
Dog is barking
```

---

# Types of Inheritance in Java

## 1. Single Inheritance

One child class inherits from one parent class.

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

### Diagram

```text
Animal
   |
  Dog
```

---

## 2. Multilevel Inheritance

A class inherits from another class, and another class inherits from it.

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
}
```

### Diagram

```text
Animal
   |
  Dog
   |
 Puppy
```

---

## 3. Hierarchical Inheritance

Multiple child classes inherit from the same parent class.

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}
```

### Diagram

```text
      Animal
      /    \
    Dog    Cat
```

---

## Multiple Inheritance in Java

Java does NOT support Multiple Inheritance using classes.

❌ Not Allowed

```java
class A {
}

class B {
}

class C extends A, B {
}
```

Reason:
- Ambiguity Problem (Diamond Problem)

### Solution

Java supports Multiple Inheritance using Interfaces.

```java
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {

    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }
}
```

---

# The super Keyword

Used to refer to parent class members.

## Calling Parent Method

```java
class Animal {

    void eat() {
        System.out.println("Animal Eating");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog Eating");
    }

    void display() {
        super.eat();
        eat();
    }
}
```

### Output

```text
Animal Eating
Dog Eating
```

---

## Calling Parent Constructor

```java
class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog Constructor");
    }
}
```

### Output

```text
Animal Constructor
Dog Constructor
```

---

# Constructor Inheritance Example

```java
class Person {

    Person() {
        System.out.println("Person Constructor");
    }
}

class Student extends Person {

    Student() {
        System.out.println("Student Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
```

### Output

```text
Person Constructor
Student Constructor
```

---

# Method Overriding

When a child class provides its own implementation of a parent class method.

```java
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
```

### Output

```text
Dog Barks
```

---

# Advantages of Inheritance

- Code Reusability
- Reduces Redundant Code
- Supports Method Overriding
- Easy Maintenance
- Better Organization of Code

---

# Disadvantages of Inheritance

- Tight Coupling
- Increased Complexity
- Changes in Parent May Affect Child Classes

---

# Real-Life Example

```java
class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car Driving");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.drive();
    }
}
```

### Output

```text
Vehicle Started
Car Driving
```

---

# Interview Questions

## Q1. What is Inheritance?

Inheritance is the process by which one class acquires the properties and methods of another class.

---

## Q2. Which keyword is used for inheritance?

```java
extends
```

---

## Q3. Does Java support Multiple Inheritance?

No, Java does not support Multiple Inheritance with classes.

It supports Multiple Inheritance through Interfaces.

---

## Q4. What is the difference between extends and implements?

| extends | implements |
|----------|------------|
| Used with Classes | Used with Interfaces |
| Single Inheritance | Multiple Interfaces Allowed |

---

## Q5. What is the super keyword?

The `super` keyword refers to the immediate parent class object.

---

## Q6. Can constructors be inherited?

No, constructors are not inherited.

---

## Q7. What is Method Overriding?

Providing a new implementation of a parent class method in the child class.

---

## Q8. Which inheritance types are supported in Java?

- Single
- Multilevel
- Hierarchical

---

## Q9. Why is Multiple Inheritance not supported with classes?

To avoid the Diamond Problem and ambiguity.

---

## Q10. What is IS-A Relationship?

Inheritance represents an IS-A relationship.

Example:

```text
Dog IS-A Animal
Car IS-A Vehicle
Student IS-A Person
```

---

# Summary

- Inheritance allows one class to acquire another class's properties and methods.
- Keyword used: `extends`
- Supports code reusability.
- Types:
  - Single
  - Multilevel
  - Hierarchical
- Multiple Inheritance is supported using Interfaces.
- `super` is used to access parent class members.
- Method Overriding is closely related to Inheritance.