# Java String

## What is a String?

A String is a sequence of characters enclosed in double quotes (`"`).

Examples:

```java
String name = "Yash";
String city = "Rajkot";
```

In Java, String is a class and objects of the String class are used to store text.

---

# Why String is Important?

Strings are used to store:

* Names
* Emails
* Addresses
* Messages
* User Input
* File Paths

Example:

```java
String username = "yash123";
String email = "yash@gmail.com";
```

---

# String Creation

There are two ways to create Strings.

## 1. String Literal

```java
String s1 = "Java";
```

Java stores this string in the String Pool.

---

## 2. Using new Keyword

```java
String s2 = new String("Java");
```

Java creates a new object in Heap Memory.

---

# String Literal Example

```java
public class Main {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1);
        System.out.println(s2);
    }
}
```

Output:

```text
Java
Java
```

---

# String Using new Keyword

```java
public class Main {
    public static void main(String[] args) {

        String s1 = new String("Java");

        System.out.println(s1);
    }
}
```

Output:

```text
Java
```

---

# Immutable Nature of String

Strings are Immutable.

Immutable means:

```text
Cannot be changed after creation.
```

Example:

```java
String str = "Java";

str.concat(" Programming");

System.out.println(str);
```

Output:

```text
Java
```

Why?

Because `concat()` creates a new String object.

The original String remains unchanged.

---

# Correct Way

```java
String str = "Java";

str = str.concat(" Programming");

System.out.println(str);
```

Output:

```text
Java Programming
```

---

# String Pool

String Pool is a special memory area inside Heap Memory where Java stores String literals.

Example:

```java
String s1 = "Java";
String s2 = "Java";
```

Memory:

```text
String Pool
-------------
Java  ← s1
      ← s2
```

Only one object is created.

This saves memory.

---

# String Pool Example

```java
public class Main {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);
    }
}
```

Output:

```text
true
```

Because both references point to the same object in the String Pool.

---

# String vs new String()

## String Literal

```java
String s1 = "Java";
String s2 = "Java";
```

Only one object is created.

---

## Using new Keyword

```java
String s1 = new String("Java");
String s2 = new String("Java");
```

Two separate objects are created.

---

# Memory Comparison

## String Literal

```java
String s1 = "Java";
String s2 = "Java";
```

Memory:

```text
String Pool
-------------
Java
```

Objects Created:

```text
1
```

---

## new String()

```java
String s1 = new String("Java");
String s2 = new String("Java");
```

Memory:

```text
Heap
-----
Object 1

Object 2
```

Objects Created:

```text
2
```

---

# equals() vs ==

One of the most important Java interview questions.

---

## == Operator

Compares memory addresses (references).

Example:

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);
```

Output:

```text
false
```

Because both objects have different memory addresses.

---

## equals() Method

Compares actual content.

Example:

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1.equals(s2));
```

Output:

```text
true
```

Because content is the same.

---

# equals() vs == Table

| Feature          | ==              | equals()    |
| ---------------- | --------------- | ----------- |
| Compares         | References      | Values      |
| Object Address   | Yes             | No          |
| Content Check    | No              | Yes         |
| Used for Strings | Not Recommended | Recommended |

---

# Example

```java
public class Main {
    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
```

Output:

```text
false
true
```

---

# Common String Operations

## Concatenation

```java
String first = "Java";
String second = "Programming";

System.out.println(first + " " + second);
```

Output:

```text
Java Programming
```

---

## Length

```java
String name = "Yash";

System.out.println(name.length());
```

Output:

```text
4
```

---

## Character Access

```java
String name = "Java";

System.out.println(name.charAt(1));
```

Output:

```text
a
```

---

# Interview Questions

## 1. What is String in Java?

String is a class used to store a sequence of characters.

Example:

```java
String name = "Yash";
```

---

## 2. Is String a Primitive Data Type?

No.

String is a class (Non-Primitive Data Type).

---

## 3. Why is String Immutable?

For:

* Security
* Performance
* Thread Safety
* String Pool Optimization

---

## 4. What is String Pool?

A special memory area where String literals are stored.

Example:

```java
String s1 = "Java";
String s2 = "Java";
```

Only one object is created.

---

## 5. Difference Between String and StringBuilder?

| String      | StringBuilder |
| ----------- | ------------- |
| Immutable   | Mutable       |
| Slower      | Faster        |
| Thread Safe | No            |

---

## 6. Difference Between String and StringBuffer?

| String         | StringBuffer         |
| -------------- | -------------------- |
| Immutable      | Mutable              |
| Faster Reads   | Faster Modifications |
| Not Modifiable | Modifiable           |

---

## 7. Difference Between == and equals()?

| ==                 | equals()        |
| ------------------ | --------------- |
| Compare References | Compare Content |
| Address Check      | Value Check     |

---

## 8. What is the Output?

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);
```

Output:

```text
true
```

Reason:

Both point to the same String Pool object.

---

## 9. What is the Output?

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);
```

Output:

```text
false
```

Reason:

Different objects.

---

## 10. What is the Output?

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1.equals(s2));
```

Output:

```text
true
```

Reason:

Content is the same.

---

## 11. How many objects are created?

```java
String s = new String("Java");
```

Answer:

```text
2 Objects
```

1. String Pool Object
2. Heap Object

---

## 12. Which is Recommended?

```java
String s = "Java";
```

Recommended because it uses the String Pool and saves memory.

---

# Quick Revision

| Topic          | Key Point              |
| -------------- | ---------------------- |
| String         | Sequence of Characters |
| String Literal | Stored in String Pool  |
| new String()   | Stored in Heap         |
| Immutable      | Cannot be Modified     |
| ==             | Compare References     |
| equals()       | Compare Content        |
| String Pool    | Saves Memory           |

## Memory Trick

```text
String Literal
      ↓
String Pool
      ↓
Memory Efficient

new String()
      ↓
Heap Memory
      ↓
New Object Every Time

==
Compare Address

equals()
Compare Content
```
