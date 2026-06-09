# Java Constructors

## What is a Constructor?

A Constructor is a special member of a class used to initialize objects.

It is automatically called when an object is created.

Example:

```java
Student s1 = new Student();
```

When the object is created, the constructor is executed automatically.

---

# Characteristics of Constructor

* Same name as the class
* No return type (not even void)
* Called automatically
* Used to initialize object data
* Can be overloaded

---

# Constructor Syntax

```java
class ClassName {

    ClassName() {

        // initialization code
    }
}
```

Example:

```java
class Student {

    Student() {
        System.out.println("Constructor Called");
    }
}
```

---

# Default Constructor

A constructor with no parameters.

```java
class Student {

    Student() {
        System.out.println("Student Object Created");
    }
}
```

---

# Example

```java
class Student {

    Student() {
        System.out.println("Constructor Executed");
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
Constructor Executed
```

---

# Constructor Initializing Variables

```java
class Student {

    String name;
    int age;

    Student() {

        name = "Yash";
        age = 21;
    }

    void display() {

        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

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

# Parameterized Constructor

A constructor that accepts parameters.

## Syntax

```java
ClassName(parameters) {

}
```

Example:

```java
class Student {

    Student(String name) {

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

# Constructor Overloading

Multiple constructors with different parameter lists.

```java
class Student {

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println(name);
    }

    Student(String name, int age) {
        System.out.println(name + " " + age);
    }
}
```

---

# Example

```java
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 =
                new Student("Yash");

        Student s3 =
                new Student("Yash", 21);
    }
}
```

Output:

```text
Default Constructor
Yash
Yash 21
```

---

# this Keyword in Constructor

Used to refer to the current object's variables.

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;
    }
}
```

Why?

To distinguish between local variables and instance variables.

---

# Without this

```java
class Student {

    String name;

    Student(String name) {

        name = name;
    }
}
```

Problem:

```text
Local variable assigned to itself.
```

Instance variable remains unchanged.

---

# With this

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;
    }
}
```

Correctly assigns value to object variable.

---

# Constructor Chaining

Calling one constructor from another constructor using `this()`.

```java
class Student {

    Student() {

        this("Yash");
    }

    Student(String name) {

        System.out.println(name);
    }
}
```

Output:

```text
Yash
```

---

# Constructor Chaining Example

```java
class Student {

    Student() {

        this(21);
        System.out.println("Default");
    }

    Student(int age) {

        System.out.println(age);
    }
}
```

Output:

```text
21
Default
```

---

# Copy Constructor (User Defined)

Java does not provide a built-in copy constructor, but we can create one.

```java
class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;
    }

    Student(Student s) {

        name = s.name;
        age = s.age;
    }
}
```

---

# Example

```java
public class Main {

    public static void main(String[] args) {

        Student s1 =
                new Student("Yash", 21);

        Student s2 =
                new Student(s1);

        System.out.println(s2.name);
    }
}
```

Output:

```text
Yash
```

---

# Private Constructor

Used to restrict object creation.

```java
class Demo {

    private Demo() {

    }
}
```

Commonly used in Singleton Design Pattern.

---

# Constructor vs Method

| Constructor                     | Method                |
| ------------------------------- | --------------------- |
| Same name as class              | Any valid name        |
| No return type                  | Has return type       |
| Called automatically            | Called manually       |
| Initializes objects             | Performs tasks        |
| Executes during object creation | Executes when invoked |

---

# Constructor Execution Order

```java
class Test {

    Test() {
        System.out.println("Constructor");
    }
}
```

```java
Test t = new Test();
```

Flow:

```text
Object Creation
        ↓
Memory Allocated
        ↓
Constructor Called
        ↓
Object Ready
```

---

# Interview Questions

## 1. What is a Constructor?

A special member used to initialize objects.

---

## 2. Can a Constructor Have a Return Type?

No.

Invalid:

```java
void Student() {
}
```

---

## 3. What is the Difference Between Constructor and Method?

| Constructor        | Method        |
| ------------------ | ------------- |
| Initializes Object | Performs Task |
| Automatic Call     | Manual Call   |

---

## 4. What is a Default Constructor?

A constructor with no parameters.

```java
Student() {
}
```

---

## 5. What is a Parameterized Constructor?

A constructor with parameters.

```java
Student(String name) {
}
```

---

## 6. Can Constructors Be Overloaded?

Yes.

```java
Student() {}
Student(String name) {}
```

---

## 7. Can Constructors Be Overridden?

No.

Constructors are not inherited.

---

## 8. What is Constructor Chaining?

Calling one constructor from another using `this()`.

```java
this();
```

---

## 9. What is the Use of this Keyword?

Refers to the current object's instance variables.

```java
this.name = name;
```

---

## 10. Can a Constructor Be Private?

Yes.

Used in Singleton Pattern.

```java
private Student() {
}
```

---

## 11. What Happens if No Constructor is Written?

Java provides a default constructor automatically.

---

## 12. Can a Constructor Be Static?

No.

Invalid:

```java
static Student() {
}
```

---

## 13. Can a Constructor Be Final?

No.

Constructors cannot be inherited or overridden.

---

## 14. Can a Class Have Multiple Constructors?

Yes.

This is called Constructor Overloading.

---

## 15. What is a Copy Constructor?

A constructor that creates a new object from another object.

```java
Student(Student s) {
}
```

---

# Quick Revision

| Concept                   | Example               |
| ------------------------- | --------------------- |
| Default Constructor       | `Student()`           |
| Parameterized Constructor | `Student(String n)`   |
| Constructor Overloading   | Multiple Constructors |
| Constructor Chaining      | `this()`              |
| Current Object            | `this`                |
| Copy Constructor          | `Student(Student s)`  |
| Private Constructor       | Singleton Pattern     |

## Memory Trick

```text
Constructor
     ↓
Initialize Object

No Parameter
     ↓
Default Constructor

Parameters
     ↓
Parameterized Constructor

Many Constructors
     ↓
Overloading

this()
     ↓
Constructor Chaining

this.variable
     ↓
Current Object
```
