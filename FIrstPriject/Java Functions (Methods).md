# Java Functions (Methods)

## What is a Function (Method)?

A function (called a **Method** in Java) is a block of code that performs a specific task.

Benefits:

* Code Reusability
* Better Readability
* Easier Maintenance
* Reduces Repetition

---

# Method Syntax

```java
accessModifier returnType methodName(parameters) {

    // code

    return value;
}
```

Example:

```java
public static void greet() {
    System.out.println("Hello Java");
}
```

---

# Method Components

| Component | Description      |
| --------- | ---------------- |
| public    | Access Modifier  |
| static    | Belongs to Class |
| void      | No Return Value  |
| greet     | Method Name      |
| ()        | Parameters       |
| {}        | Method Body      |

---

# Simple Method Example

```java
public class Main {

    static void greet() {
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) {

        greet();
    }
}
```

Output:

```text
Welcome to Java
```

---

# Method with Parameters

Parameters allow passing values into a method.

```java
public class Main {

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        greet("Yash");
    }
}
```

Output:

```text
Hello Yash
```

---

# Method with Multiple Parameters

```java
public class Main {

    static void student(String name, int age) {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        student("Yash", 21);
    }
}
```

Output:

```text
Yash 21
```

---

# Method Returning Value

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);
    }
}
```

Output:

```text
30
```

---

# Return Statement

The `return` keyword sends a value back to the caller.

Example:

```java
static int square(int n) {
    return n * n;
}
```

---

# Types of Methods

| Type   | Parameters | Return Value |
| ------ | ---------- | ------------ |
| Type 1 | No         | No           |
| Type 2 | Yes        | No           |
| Type 3 | No         | Yes          |
| Type 4 | Yes        | Yes          |

---

# Type 1: No Parameters, No Return

```java
static void show() {
    System.out.println("Java");
}
```

---

# Type 2: Parameters, No Return

```java
static void show(int age) {
    System.out.println(age);
}
```

---

# Type 3: No Parameters, Return Value

```java
static int getNumber() {
    return 100;
}
```

---

# Type 4: Parameters and Return Value

```java
static int multiply(int a, int b) {
    return a * b;
}
```

---

# Method Calling

A method can be called multiple times.

```java
public class Main {

    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        greet();
        greet();
        greet();
    }
}
```

Output:

```text
Hello
Hello
Hello
```

---

# Static Method

Can be called directly using the class name.

```java
public class Main {

    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {

        display();
    }
}
```

---

# Non-Static Method

Requires an object.

```java
public class Main {

    void display() {
        System.out.println("Non Static Method");
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.display();
    }
}
```

---

# Method Overloading

Same method name with different parameters.

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
    }
}
```

Output:

```text
30
60
```

---

# Recursive Method

A method calling itself.

## Factorial Example

```java
public class Main {

    static int factorial(int n) {

        if(n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}
```

Output:

```text
120
```

---

# Pass By Value

Java always uses Pass By Value.

```java
public class Main {

    static void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {

        int a = 10;

        change(a);

        System.out.println(a);
    }
}
```

Output:

```text
10
```

---

# Interview Questions

## 1. What is a Method in Java?

A method is a block of code that performs a specific task.

---

## 2. Why are methods used?

* Reusability
* Readability
* Reduced Code Duplication

---

## 3. What is the syntax of a method?

```java
returnType methodName(parameters) {
}
```

---

## 4. What is the difference between a parameter and an argument?

| Parameter         | Argument                  |
| ----------------- | ------------------------- |
| Defined in Method | Passed during Method Call |
| Placeholder       | Actual Value              |

Example:

```java
static void greet(String name) // Parameter
{
}

greet("Yash"); // Argument
```

---

## 5. What is a return type?

The data type of the value returned by a method.

```java
static int add() {
    return 10;
}
```

---

## 6. What is a void method?

A method that returns nothing.

```java
static void show() {
}
```

---

## 7. What is Method Overloading?

Multiple methods with the same name but different parameters.

---

## 8. Can we overload main() method?

Yes.

```java
public static void main(int a) {
}
```

---

## 9. What is Recursion?

A method calling itself.

Example:

```java
factorial(n - 1);
```

---

## 10. Is Java Pass By Value or Pass By Reference?

Java is Pass By Value.

---

## 11. Difference between Static and Non-Static Methods?

| Static           | Non-Static        |
| ---------------- | ----------------- |
| No Object Needed | Object Required   |
| Belongs to Class | Belongs to Object |

---

## 12. Can a method return multiple values?

Not directly. Use:

* Array
* Object
* Collection

---

## 13. What is the purpose of return?

To send a value back to the caller.

```java
return result;
```

---

## 14. Can a method exist without main()?

Yes, but the program execution starts from `main()`.

---

## 15. Which method is the entry point of Java?

```java
public static void main(String[] args)
```

---

# Quick Revision

| Concept     | Example                         |
| ----------- | ------------------------------- |
| Method      | `greet()`                       |
| Parameter   | `int a`                         |
| Argument    | `10`                            |
| Return      | `return value`                  |
| Overloading | Same name, different parameters |
| Recursion   | Method calls itself             |
| Static      | No object needed                |
| Non-Static  | Object needed                   |

## Memory Trick

```text
Method = Reusable Code

Parameter = Placeholder

Argument = Actual Value

return = Give Back Value

Overloading = Same Name

Recursion = Self Calling Method
```
