# Java Class and Object

## What is a Class?

A Class is a blueprint or template used to create objects.

It defines:

* Variables (Attributes)
* Methods (Behaviors)

Example:

```java
class Student {

    String name;
    int age;
}
```

Here, `Student` is a class.

---

# What is an Object?

An Object is an instance of a class.

It occupies memory and can access class variables and methods.

Example:

```java
Student s1 = new Student();
```

Here:

* Student = Class
* s1 = Object
* new = Keyword used to create object

---

# Real Life Example

```text
Class  → Car Blueprint

Object → BMW Car
          Audi Car
          Tesla Car
```

A class is a design.

An object is the actual thing created from that design.

---

# Creating a Class

```java
class Student {

    String name;
    int age;
}
```

---

# Creating an Object

```java
Student s1 = new Student();
```

---

# Accessing Variables Using Object

```java
class Student {

    String name;
    int age;
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Yash";
        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
```

Output:

```text
Yash
21
```

---

# Class with Method

```java
class Student {

    String name;

    void display() {
        System.out.println(name);
    }
}
```

---

# Accessing Method

```java
class Student {

    String name;

    void display() {
        System.out.println(name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Yash";

        s1.display();
    }
}
```

Output:

```text
Yash
```

---

# Multiple Objects

```java
class Student {

    String name;
    int age;
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Yash";
        s1.age = 21;

        s2.name = "Rahul";
        s2.age = 22;

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
```

Output:

```text
Yash
Rahul
```

---

# Memory Representation

```text
Student s1 = new Student();
```

Memory:

```text
Stack Memory
-------------
s1
 |
 V

Heap Memory
-------------
Student Object
-------------
name
age
```

---

# Constructor Introduction

A Constructor initializes objects.

Constructor name must be the same as the class name.

```java
class Student {

    Student() {
        System.out.println("Constructor Called");
    }
}
```

---

# Default Constructor Example

```java
class Student {

    Student() {
        System.out.println("Object Created");
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
    }
}
```

Output:

```text
Object Created
```

---

# Parameterized Constructor

```java
class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;
    }
}
```

---

# Example

```java
class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;
    }

    void display() {

        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 =
                new Student("Yash", 21);

        s1.display();
    }
}
```

Output:

```text
Yash
21
```

---

# this Keyword

Refers to the current object.

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;
    }
}
```

---

# Anonymous Object

Object without reference variable.

```java
new Student();
```

Example:

```java
new Student().display();
```

---

# Class vs Object

| Class                | Object           |
| -------------------- | ---------------- |
| Blueprint            | Instance         |
| Logical Entity       | Physical Entity  |
| No Memory Allocation | Memory Allocated |
| Created Once         | Can Create Many  |

---

# Interview Questions

## 1. What is a Class?

A class is a blueprint used to create objects.

Example:

```java
class Student {
}
```

---

## 2. What is an Object?

An object is an instance of a class.

Example:

```java
Student s1 = new Student();
```

---

## 3. How do you create an object?

Syntax:

```java
ClassName objectName =
        new ClassName();
```

Example:

```java
Student s1 =
        new Student();
```

---

## 4. Difference Between Class and Object?

| Class     | Object      |
| --------- | ----------- |
| Blueprint | Instance    |
| No Memory | Uses Memory |
| Template  | Real Entity |

---

## 5. What is the new Keyword?

Used to create objects in heap memory.

```java
Student s1 =
        new Student();
```

---

## 6. Where are Objects Stored?

Objects are stored in Heap Memory.

---

## 7. What is a Constructor?

A special method used to initialize objects.

Example:

```java
Student() {
}
```

---

## 8. What are the Rules of Constructor?

* Same name as class
* No return type
* Called automatically

---

## 9. What is a Default Constructor?

Constructor with no parameters.

```java
Student() {
}
```

---

## 10. What is a Parameterized Constructor?

Constructor with parameters.

```java
Student(String name, int age) {
}
```

---

## 11. What is this Keyword?

Refers to the current object.

```java
this.name = name;
```

---

## 12. Can a Class Have Multiple Objects?

Yes.

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
```

---

## 13. Can a Class Exist Without an Object?

Yes.

A class can exist without creating objects.

---

## 14. Can an Object Exist Without a Class?

No.

Objects are always created from a class.

---

## 15. What is an Anonymous Object?

Object without storing reference.

```java
new Student();
```

---

## 16. What is Instance Variable?

Variables declared inside a class and outside methods.

```java
class Student {

    String name;
}
```

---

## 17. What is the Output?

```java
class Student {

    String name = "Java";
}

public class Main {

    public static void main(String[] args) {

        Student s =
                new Student();

        System.out.println(s.name);
    }
}
```

Output:

```text
Java
```

---

# Quick Revision

| Concept                   | Example           |
| ------------------------- | ----------------- |
| Class                     | Student           |
| Object                    | s1                |
| Object Creation           | new Student()     |
| Constructor               | Student()         |
| Parameterized Constructor | Student(String n) |
| this Keyword              | this.name         |
| Anonymous Object          | new Student()     |

## Memory Trick

```text
Class
  ↓
Blueprint

Object
  ↓
Real Instance

new
  ↓
Create Object

Constructor
  ↓
Initialize Object

this
  ↓
Current Object
```
