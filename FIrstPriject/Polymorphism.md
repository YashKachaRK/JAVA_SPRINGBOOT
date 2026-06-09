# 12. Polymorphism.md

# Java Polymorphism

## What is Polymorphism?

Polymorphism means **"Many Forms"**.

In Java, polymorphism allows one object, method, or reference variable to behave in multiple ways.

### Real-Life Example

A person can have multiple roles:

- Student at college
- Employee at office
- Son/Daughter at home

Same person → Different behaviors.

This is called **Polymorphism**.

---

# Why Use Polymorphism?

- Code Reusability
- Flexibility
- Easy Maintenance
- Dynamic Method Calls
- Better OOP Design

---

# Types of Polymorphism

Java supports two types:

1. Compile-Time Polymorphism (Method Overloading)
2. Run-Time Polymorphism (Method Overriding)

---

# 1. Compile-Time Polymorphism

Also called:

- Static Binding
- Method Overloading

Occurs when multiple methods have the same name but different parameters.

---

## Method Overloading

### Example 1

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
    }
}
```

### Output

```text
30
60
```

---

## Example 2

Different Data Types

```java
class Display {

    void show(int num) {
        System.out.println(num);
    }

    void show(String text) {
        System.out.println(text);
    }
}
```

---

## Rules for Method Overloading

✔ Method name must be same

✔ Parameters must be different

Can differ by:

- Number of Parameters
- Type of Parameters
- Order of Parameters

---

### Valid Overloading

```java
void show()
void show(int a)
void show(String name)
void show(int a, String name)
```

---

### Invalid Overloading

Changing only return type

```java
int add(int a, int b)
double add(int a, int b)
```

❌ Compilation Error

---

# 2. Run-Time Polymorphism

Also called:

- Dynamic Binding
- Method Overriding

Occurs when a child class provides its own implementation of a parent class method.

---

## Method Overriding

### Example

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

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
```

### Output

```text
Dog Barks
```

---

# How Run-Time Polymorphism Works

```java
Animal a = new Dog();
```

### Reference Type

```java
Animal
```

### Object Type

```java
Dog
```

At runtime Java decides which method to call.

Output:

```text
Dog Barks
```

---

# Another Example

```java
class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}
```

### Output

```text
Drawing Circle
Drawing Rectangle
```

---

# Upcasting

Converting child object reference into parent reference.

```java
Animal a = new Dog();
```

This is called Upcasting.

---

# Downcasting

Converting parent reference back into child reference.

```java
Dog d = (Dog) a;
```

Example:

```java
Animal a = new Dog();

Dog d = (Dog) a;

d.sound();
```

---

# Polymorphism with Interfaces

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
```

---

# Method Overloading vs Method Overriding

| Method Overloading | Method Overriding |
|-------------------|-------------------|
| Compile Time | Run Time |
| Same Class | Parent & Child Class |
| Parameters Different | Parameters Same |
| Return Type Can Differ | Return Type Same/Compatible |
| Static Binding | Dynamic Binding |

---

# Real-Life Example

```java
class Payment {

    void pay() {
        System.out.println("Generic Payment");
    }
}

class UPI extends Payment {

    void pay() {
        System.out.println("UPI Payment");
    }
}

class CreditCard extends Payment {

    void pay() {
        System.out.println("Credit Card Payment");
    }
}
```

Usage:

```java
Payment p;

p = new UPI();
p.pay();

p = new CreditCard();
p.pay();
```

Output:

```text
UPI Payment
Credit Card Payment
```

---

# Advantages of Polymorphism

- Code Reusability
- Flexibility
- Loose Coupling
- Easier Maintenance
- Dynamic Method Dispatch

---

# Disadvantages

- Slight Runtime Overhead
- More Complex Debugging

---

# Interview Questions

## Q1. What is Polymorphism?

Polymorphism means one entity can take many forms.

---

## Q2. How many types of Polymorphism are there in Java?

1. Compile-Time Polymorphism
2. Run-Time Polymorphism

---

## Q3. What is Method Overloading?

Multiple methods with the same name but different parameters.

---

## Q4. What is Method Overriding?

A child class provides a specific implementation of a parent class method.

---

## Q5. Can we overload the main method?

Yes.

```java
public static void main(String[] args)

public static void main(int a)
```

---

## Q6. Can static methods be overridden?

No.

They are hidden, not overridden.

---

## Q7. What is Dynamic Method Dispatch?

The process where the overridden method is selected at runtime.

---

## Q8. What is Upcasting?

```java
Animal a = new Dog();
```

Child object assigned to parent reference.

---

## Q9. What is Downcasting?

```java
Dog d = (Dog) a;
```

Parent reference converted to child reference.

---

## Q10. Difference Between Overloading and Overriding?

| Overloading | Overriding |
|------------|------------|
| Compile Time | Run Time |
| Same Class | Parent-Child |
| Different Parameters | Same Parameters |
| Static Binding | Dynamic Binding |

---

# Summary

- Polymorphism means "Many Forms".
- Two Types:
  - Compile-Time (Method Overloading)
  - Run-Time (Method Overriding)
- Overloading occurs in the same class.
- Overriding occurs between parent and child classes.
- Runtime polymorphism uses dynamic method dispatch.
- Upcasting enables flexible code design.
- Polymorphism is one of the four pillars of OOP.