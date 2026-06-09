# Java Operators

## What are Operators?

Operators are special symbols used to perform operations on variables and values.

Example:

```java
int a = 10;
int b = 20;

int sum = a + b;
```

Here `+` is an operator.

---

# Types of Operators in Java

1. Arithmetic Operators
2. Assignment Operators
3. Relational (Comparison) Operators
4. Logical Operators
5. Unary Operators
6. Bitwise Operators
7. Shift Operators
8. Ternary Operator
9. instanceof Operator

---

# 1. Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning        | Example |
| -------- | -------------- | ------- |
| +        | Addition       | a + b   |
| -        | Subtraction    | a - b   |
| *        | Multiplication | a * b   |
| /        | Division       | a / b   |
| %        | Modulus        | a % b   |

## Example

```java
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
```

### Output

```text
13
7
30
3
1
```

---

# 2. Assignment Operators

Used to assign values to variables.

| Operator | Example | Meaning   |
| -------- | ------- | --------- |
| =        | a = 10  | Assign    |
| +=       | a += 5  | a = a + 5 |
| -=       | a -= 5  | a = a - 5 |
| *=       | a *= 5  | a = a * 5 |
| /=       | a /= 5  | a = a / 5 |
| %=       | a %= 5  | a = a % 5 |

## Example

```java
int a = 10;

a += 5;

System.out.println(a);
```

Output:

```text
15
```

---

# 3. Relational Operators

Used to compare values.

| Operator | Meaning               |
| -------- | --------------------- |
| ==       | Equal To              |
| !=       | Not Equal To          |
| >        | Greater Than          |
| <        | Less Than             |
| >=       | Greater Than Equal To |
| <=       | Less Than Equal To    |

## Example

```java
int a = 10;
int b = 20;

System.out.println(a == b);
System.out.println(a < b);
System.out.println(a > b);
```

Output:

```text
false
true
false
```

---

# 4. Logical Operators

Used to combine conditions.

| Operator | Meaning |   |    |
| -------- | ------- | - | -- |
| &&       | AND     |   |    |
|          |         |   | OR |
| !        | NOT     |   |    |

## Example

```java
int age = 20;
boolean citizen = true;

System.out.println(age >= 18 && citizen);
```

Output:

```text
true
```

---

# AND Operator (&&)

```java
System.out.println(true && true);
System.out.println(true && false);
```

Output:

```text
true
false
```

---

# OR Operator (||)

```java
System.out.println(true || false);
System.out.println(false || false);
```

Output:

```text
true
false
```

---

# NOT Operator (!)

```java
boolean status = true;

System.out.println(!status);
```

Output:

```text
false
```

---

# 5. Unary Operators

Operate on a single operand.

| Operator | Meaning     |
| -------- | ----------- |
| +        | Unary Plus  |
| -        | Unary Minus |
| ++       | Increment   |
| --       | Decrement   |
| !        | Logical NOT |

---

# Increment Operator

## Pre Increment

```java
int a = 10;

System.out.println(++a);
```

Output:

```text
11
```

---

## Post Increment

```java
int a = 10;

System.out.println(a++);
System.out.println(a);
```

Output:

```text
10
11
```

---

# Decrement Operator

## Pre Decrement

```java
int a = 10;

System.out.println(--a);
```

Output:

```text
9
```

---

## Post Decrement

```java
int a = 10;

System.out.println(a--);
System.out.println(a);
```

Output:

```text
10
9
```

---

# 6. Bitwise Operators

Operate on binary values.

| Operator | Meaning     |
| -------- | ----------- |
| &        | Bitwise AND |
| |        | Bitwise OR  |
| ^        | XOR         |
| ~        | Complement  |

## Example

```java
int a = 5;
int b = 3;

System.out.println(a & b);
System.out.println(a | b);
System.out.println(a ^ b);
```

Output:

```text
1
7
6
```

---

# 7. Shift Operators

Used to shift bits.

| Operator | Meaning              |
| -------- | -------------------- |
| <<       | Left Shift           |
| >>       | Right Shift          |
| >>>      | Unsigned Right Shift |

## Example

```java
int a = 5;

System.out.println(a << 1);
System.out.println(a >> 1);
```

Output:

```text
10
2
```

---

# 8. Ternary Operator

Short form of if-else.

## Syntax

```java
condition ? value1 : value2;
```

## Example

```java
int age = 20;

String result =
        (age >= 18)
        ? "Adult"
        : "Minor";

System.out.println(result);
```

Output:

```text
Adult
```

---

# 9. instanceof Operator

Checks whether an object belongs to a class.

## Example

```java
String name = "Java";

System.out.println(name instanceof String);
```

Output:

```text
true
```

---

# Operator Precedence

| Priority       | Operators    |
| -------------- | ------------ |
| Highest        | (), []       |
| Unary          | ++, --, !    |
| Multiplicative | *, /, %      |
| Additive       | +, -         |
| Relational     | <, >, <=, >= |
| Equality       | ==, !=       |
| Logical AND    | &&           |
| Logical OR     | ||           |
| Ternary        | ?:           |
| Assignment     | =, +=, -=    |

---

# Interview Questions

## 1. What is an operator in Java?

An operator is a symbol used to perform operations on variables and values.

---

## 2. How many types of operators are available in Java?

* Arithmetic
* Assignment
* Relational
* Logical
* Unary
* Bitwise
* Shift
* Ternary
* instanceof

---

## 3. Difference between == and = ?

| =            | ==             |
| ------------ | -------------- |
| Assignment   | Comparison     |
| Assign value | Compare values |

Example:

```java
int a = 10;

if(a == 10){
    System.out.println("Equal");
}
```

---

## 4. Difference between ++a and a++ ?

### Pre Increment

```java
int a = 10;
System.out.println(++a);
```

Output:

```text
11
```

### Post Increment

```java
int a = 10;
System.out.println(a++);
```

Output:

```text
10
```

---

## 5. What is the modulus operator?

Returns remainder.

```java
System.out.println(10 % 3);
```

Output:

```text
1
```

---

## 6. What does && mean?

Logical AND operator.

Both conditions must be true.

---

## 7. What does || mean?

Logical OR operator.

At least one condition must be true.

---

## 8. What is the ternary operator?

Short form of if-else.

```java
int age = 20;

String result =
(age >= 18)
? "Adult"
: "Minor";
```

---

## 9. What is operator precedence?

The order in which operators are evaluated.

Example:

```java
System.out.println(10 + 5 * 2);
```

Output:

```text
20
```

Multiplication executes first.

---

## 10. What is instanceof?

Used to check object type.

```java
String name = "Java";

System.out.println(name instanceof String);
```

Output:

```text
true
```

---

# Quick Revision

| Category   | Operators        |
| ---------- | ---------------- |
| Arithmetic | + - * / %        |
| Assignment | = += -= *= /= %= |
| Relational | == != > < >= <=  |
| Logical    | && || !          |
| Unary      | ++ --            |
| Bitwise    | & | ^ ~          |
| Shift      | << >> >>>        |
| Ternary    | ?:               |
| Type Check | instanceof       |

## Memory Trick

```text
Math       → Arithmetic

Store      → Assignment

Compare    → Relational

Conditions → Logical

Increase   → ++

Decrease   → --

Shortcut   → Ternary

Type Check → instanceof
```
