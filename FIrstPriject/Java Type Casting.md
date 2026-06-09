# Java Type Casting

## What is Type Casting?

Type Casting is the process of converting one data type into another.

There are two types of type casting in Java:

1. Widening Casting (Automatic)
2. Narrowing Casting (Manual)

---

# Primitive Data Types Size Table

| Data Type | Size              | Range                                                   |
| --------- | ----------------- | ------------------------------------------------------- |
| byte      | 1 byte (8 bits)   | -128 to 127                                             |
| short     | 2 bytes (16 bits) | -32,768 to 32,767                                       |
| int       | 4 bytes (32 bits) | -2,147,483,648 to 2,147,483,647                         |
| long      | 8 bytes (64 bits) | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | 4 bytes (32 bits) | ±3.4E-38 to ±3.4E+38                                    |
| double    | 8 bytes (64 bits) | ±1.7E-308 to ±1.7E+308                                  |
| char      | 2 bytes (16 bits) | 0 to 65,535 (Unicode)                                   |
| boolean   | JVM dependent     | true / false                                            |

---

# Widening Casting (Implicit)

Converting a smaller data type into a larger data type.

## Casting Order

```text
byte → short → int → long → float → double
          ↘
           char
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int num = 100;

        double d = num;

        System.out.println(num);
        System.out.println(d);
    }
}
```

### Output

```text
100
100.0
```

---

# Narrowing Casting (Explicit)

Converting a larger data type into a smaller data type.

## Example

```java
public class Main {
    public static void main(String[] args) {

        double d = 99.99;

        int num = (int) d;

        System.out.println(d);
        System.out.println(num);
    }
}
```

### Output

```text
99.99
99
```

---

# Common Type Casting Examples

## int → long

```java
int a = 100;
long b = a;

System.out.println(b);
```

Output:

```text
100
```

---

## long → int

```java
long a = 1000;
int b = (int) a;

System.out.println(b);
```

Output:

```text
1000
```

---

## char → int

```java
char ch = 'A';
int ascii = ch;

System.out.println(ascii);
```

Output:

```text
65
```

---

## int → char

```java
int num = 65;
char ch = (char) num;

System.out.println(ch);
```

Output:

```text
A
```

---

# Widening vs Narrowing

| Feature    | Widening Casting | Narrowing Casting |
| ---------- | ---------------- | ----------------- |
| Conversion | Small → Large    | Large → Small     |
| Automatic  | Yes              | No                |
| Syntax     | No cast needed   | Cast required     |
| Data Loss  | No               | Possible          |
| Example    | int → double     | double → int      |

---

# Interview Questions

## 1. What is Type Casting?

Type Casting is the conversion of one data type into another.

---

## 2. What are the two types of Type Casting?

* Widening Casting
* Narrowing Casting

---

## 3. Which casting is automatic?

Widening Casting.

```java
int a = 10;
double b = a;
```

---

## 4. Which casting may cause data loss?

Narrowing Casting.

```java
double d = 10.99;
int n = (int) d;
```

Output:

```text
10
```

---

## 5. Why do we use `(int)` or `(double)`?

To explicitly tell Java to convert a value to another data type.

```java
double d = 12.5;
int n = (int) d;
```

---

# Quick Revision

| Rule               | Example               |
| ------------------ | --------------------- |
| Widening           | `int → double`        |
| Narrowing          | `double → int`        |
| Automatic          | `double d = 10;`      |
| Manual             | `int n = (int) 10.5;` |
| Data Loss Possible | Narrowing Casting     |

## Memory Trick

```text
Small → Large  = Widening = Automatic

Large → Small  = Narrowing = Manual
```
