# 13. Interface.md

# Java Interface

## What is an Interface?

An Interface in Java is a blueprint of a class that contains abstract methods and constants.

It is used to achieve:

- Abstraction
- Multiple Inheritance
- Loose Coupling
- Standardized Behavior

---

# Why Use Interfaces?

Interfaces help define **what a class should do**, without specifying **how it should do it**.

### Real-Life Example

A remote control defines:

```text
Turn On
Turn Off
Increase Volume
```

But different TV brands implement these actions differently.

---

# Syntax

```java
interface Animal {

    void sound();
}
```

A class implements an interface using the `implements` keyword.

```java
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog Barks");
    }
}
```

---

# Basic Example

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

        Dog d = new Dog();

        d.sound();
    }
}
```

### Output

```text
Dog Barks
```

---

# Important Rules

### 1. Interface Methods are Public and Abstract

```java
interface Animal {

    void sound();
}
```

Java treats it as:

```java
interface Animal {

    public abstract void sound();
}
```

---

### 2. Interface Variables are Constants

```java
interface Test {

    int VALUE = 100;
}
```

Java treats it as:

```java
public static final int VALUE = 100;
```

---

### Example

```java
interface Test {

    int VALUE = 100;
}

public class Main {

    public static void main(String[] args) {

        System.out.println(Test.VALUE);
    }
}
```

### Output

```text
100
```

---

# Multiple Interfaces

A class can implement multiple interfaces.

### Example

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

# Why Multiple Inheritance Works with Interfaces?

Java does not allow:

```java
class C extends A, B
```

❌ Compilation Error

But Java allows:

```java
class C implements A, B
```

✔ No ambiguity because interfaces only define behavior.

---

# Interface Reference Variable

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

### Output

```text
Dog Barks
```

---

# Interface and Polymorphism

```java
interface Shape {

    void draw();
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
```

Usage:

```java
Shape s;

s = new Circle();
s.draw();

s = new Rectangle();
s.draw();
```

### Output

```text
Drawing Circle
Drawing Rectangle
```

---

# Default Methods (Java 8)

Interfaces can contain methods with implementation using the `default` keyword.

```java
interface Vehicle {

    default void start() {
        System.out.println("Vehicle Started");
    }
}
```

### Example

```java
interface Vehicle {

    default void start() {
        System.out.println("Vehicle Started");
    }
}

class Car implements Vehicle {
}
```

---

# Static Methods in Interface (Java 8)

```java
interface MathUtil {

    static int square(int n) {
        return n * n;
    }
}
```

Usage:

```java
System.out.println(MathUtil.square(5));
```

### Output

```text
25
```

---

# Private Methods in Interface (Java 9)

```java
interface Test {

    private void show() {
        System.out.println("Private Method");
    }
}
```

Used internally by default methods.

---

# Functional Interface

An interface with exactly one abstract method.

### Example

```java
@FunctionalInterface
interface Greeting {

    void sayHello();
}
```

Used with Lambda Expressions.

---

# Lambda Example

```java
@FunctionalInterface
interface Greeting {

    void sayHello();
}

public class Main {

    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello");

        g.sayHello();
    }
}
```

### Output

```text
Hello
```

---

# Marker Interface

An interface with no methods.

### Example

```java
interface Serializable {
}
```

Used to provide metadata to the JVM.

Examples:

- Serializable
- Cloneable

---

# Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|----------|-----------|---------------|
| Keyword | interface | abstract |
| Constructors | No | Yes |
| Multiple Inheritance | Yes | No |
| Variables | public static final | Any Type |
| Methods | Abstract, Default, Static | Abstract and Normal |
| Object Creation | No | No |

---

# Real-Life Example

```java
interface Payment {

    void pay(double amount);
}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}
```

Usage:

```java
Payment p;

p = new UPI();
p.pay(1000);

p = new CreditCard();
p.pay(5000);
```

### Output

```text
Paid using UPI: 1000.0
Paid using Credit Card: 5000.0
```

---

# Advantages of Interface

- Achieves Abstraction
- Supports Multiple Inheritance
- Promotes Loose Coupling
- Improves Maintainability
- Enables Polymorphism

---

# Disadvantages

- Cannot have instance variables
- Cannot have constructors
- Requires implementation in child classes

---

# Interview Questions

## Q1. What is an Interface?

An Interface is a blueprint of a class that contains abstract methods and constants.

---

## Q2. Which keyword is used to implement an interface?

```java
implements
```

---

## Q3. Can we create an object of an interface?

No.

```java
Animal a = new Animal(); // Error
```

---

## Q4. Can an interface have constructors?

No.

---

## Q5. Can an interface have method bodies?

Yes.

Using:

- default methods
- static methods

(Java 8+)

---

## Q6. Can a class implement multiple interfaces?

Yes.

```java
class Test implements A, B
```

---

## Q7. What are interface variables by default?

```java
public static final
```

---

## Q8. What are interface methods by default?

```java
public abstract
```

---

## Q9. What is a Functional Interface?

An interface containing exactly one abstract method.

---

## Q10. Difference Between Interface and Abstract Class?

| Interface | Abstract Class |
|-----------|---------------|
| Multiple Inheritance | No Multiple Inheritance |
| No Constructor | Constructor Allowed |
| Constants Only | Any Variables |
| Mostly Abstraction | Partial Abstraction |

---

# Summary

- Interface is a blueprint of a class.
- Keyword used: `interface`.
- Implemented using `implements`.
- Supports Multiple Inheritance.
- Methods are `public abstract` by default.
- Variables are `public static final` by default.
- Can contain Default and Static methods (Java 8+).
- Functional Interfaces are used with Lambda Expressions.
- Interfaces help achieve abstraction and loose coupling.
    }
}
