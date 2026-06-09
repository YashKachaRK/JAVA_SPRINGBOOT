# Java Variables & Data Types

## 1. Variables in Java

A variable is a container that stores data values.

### Syntax

```java
dataType variableName = value;
```

### Example

```java
public class Main {
    public static void main(String[] args) {
        int age = 21;
        String name = "Yash";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

### Rules for Naming Variables

✅ Can contain letters, digits, `_`, `$`

✅ Must start with a letter, `_`, or `$`

❌ Cannot start with a number

❌ Cannot use Java keywords

### Valid Variable Names

```java
int age;
String firstName;
double salary;
```

### Invalid Variable Names

```java
int 1age;      // Starts with number
int class;     // Reserved keyword
```

---

# Types of Variables

## 1. Local Variable

Declared inside a method.

```java
public class Demo {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
    }
}
```

---

## 2. Instance Variable

Declared inside a class but outside methods.

```java
public class Student {
    String name = "Yash";

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
    }
}
```

---

## 3. Static Variable

Shared by all objects.

```java
public class Student {
    static String college = "ABC College";

    public static void main(String[] args) {
        System.out.println(college);
    }
}
```

---

# Data Types in Java

Data types define the type of data a variable can store.

Java data types are divided into:

1. Primitive Data Types
2. Non-Primitive Data Types

---

# Primitive Data Types

| Data Type | Size    | Example |
| --------- | ------- | ------- |
| byte      | 1 byte  | 100     |
| short     | 2 bytes | 20000   |
| int       | 4 bytes | 50000   |
| long      | 8 bytes | 100000L |
| float     | 4 bytes | 12.5f   |
| double    | 8 bytes | 99.99   |
| char      | 2 bytes | 'A'     |
| boolean   | 1 bit   | true    |

---

## Example of Primitive Data Types

```java
public class Main {
    public static void main(String[] args) {

        byte b = 100;
        short s = 20000;
        int i = 50000;
        long l = 100000L;

        float f = 12.5f;
        double d = 99.99;

        char c = 'A';
        boolean isJavaFun = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(isJavaFun);
    }
}
```

---

# Non-Primitive Data Types

Non-primitive types are created by the programmer or provided by Java.

Examples:

* String
* Array
* Class
* Object
* Interface

### Example

```java
public class Main {
    public static void main(String[] args) {

        String name = "Yash";

        int[] numbers = {10, 20, 30};

        System.out.println(name);
        System.out.println(numbers[0]);
    }
}
```

---

# Type Casting

Type casting means converting one data type into another.

## 1. Widening Casting (Automatic)

```java
public class Main {
    public static void main(String[] args) {
        int num = 100;
        double d = num;

        System.out.println(d);
    }
}
```

Output:

```text
100.0
```

---

## 2. Narrowing Casting (Manual)

```java
public class Main {
    public static void main(String[] args) {
        double d = 99.99;
        int num = (int) d;

        System.out.println(num);
    }
}
```

Output:

```text
99
```

---

# Constants in Java

Use `final` keyword to create constants.

```java
public class Main {
    public static void main(String[] args) {

        final double PI = 3.14159;

        System.out.println(PI);
    }
}
```

---

# Interview Questions & Answers

## 1. What is a variable in Java?

A variable is a named memory location used to store data.

Example:

```java
int age = 21;
```

---

## 2. What are the types of variables in Java?

* Local Variable
* Instance Variable
* Static Variable

---

## 3. What is a data type?

A data type specifies the kind of value a variable can store.

Example:

```java
int age = 25;
String name = "Yash";
```

---

## 4. Difference between Primitive and Non-Primitive Data Types?

| Primitive           | Non-Primitive         |
| ------------------- | --------------------- |
| Stores actual value | Stores reference      |
| Fixed size          | Dynamic size          |
| Built into Java     | Created by programmer |

Example:

```java
int num = 10;       // Primitive
String name = "Yash"; // Non-Primitive
```

---

## 5. What is the default value of primitive data types?

| Data Type | Default Value |
| --------- | ------------- |
| byte      | 0             |
| short     | 0             |
| int       | 0             |
| long      | 0L            |
| float     | 0.0f          |
| double    | 0.0           |
| char      | '\u0000'      |
| boolean   | false         |

---

## 6. Difference between int and Integer?

| int               | Integer         |
| ----------------- | --------------- |
| Primitive         | Wrapper Class   |
| Faster            | Slightly slower |
| Cannot store null | Can store null  |

Example:

```java
int a = 10;
Integer b = 20;
```

---

## 7. What is Type Casting?

Converting one data type into another.

Example:

```java
int num = 10;
double d = num;
```

---

## 8. What is Widening Casting?

Automatic conversion from smaller type to larger type.

```java
int a = 10;
double b = a;
```

---

## 9. What is Narrowing Casting?

Manual conversion from larger type to smaller type.

```java
double d = 99.99;
int n = (int) d;
```

---

## 10. Why is String a Non-Primitive Data Type?

Because String is a class in Java.

```java
String name = "Yash";
```

---

## 11. What is the size of an int?

```text
4 bytes (32 bits)
```

Range:

```text
-2,147,483,648 to 2,147,483,647
```

---

## 12. What is the difference between float and double?

| float             | double             |
| ----------------- | ------------------ |
| 4 bytes           | 8 bytes            |
| Less precision    | More precision     |
| Suffix f required | No suffix required |

Example:

```java
float price = 10.5f;
double amount = 10.5;
```

---

## 13. Why do we use long instead of int?

When values exceed the range of int.

```java
long population = 8000000000L;
```

---

## 14. What is the use of final keyword?

Used to create constants.

```java
final int MAX = 100;
```

Value cannot be changed later.

---

## 15. Can a variable name start with `_`?

Yes.

```java
int _count = 10;
```

---

# Quick Revision

* Variable = Stores data
* Data Type = Defines data type of variable
* Primitive = byte, short, int, long, float, double, char, boolean
* Non-Primitive = String, Array, Class, Object
* Widening = Automatic conversion
* Narrowing = Manual conversion
* final = Constant value
