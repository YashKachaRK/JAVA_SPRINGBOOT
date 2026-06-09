# Java Conditional Statements (if, else, else if, switch)

## What are Conditional Statements?

Conditional statements are used to make decisions in a program based on conditions.

They allow the program to execute different blocks of code depending on whether a condition is `true` or `false`.

---

# Types of Conditional Statements

1. if Statement
2. if-else Statement
3. else-if Ladder
4. Nested if
5. switch Statement

---

# 1. if Statement

Executes a block of code only when the condition is true.

## Syntax

```java
if(condition){
    // code
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int age = 20;

        if(age >= 18){
            System.out.println("Eligible for Voting");
        }
    }
}
```

### Output

```text
Eligible for Voting
```

---

# 2. if-else Statement

Executes one block if the condition is true and another block if it is false.

## Syntax

```java
if(condition){
    // code if true
}
else{
    // code if false
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int age = 16;

        if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Minor");
        }
    }
}
```

### Output

```text
Minor
```

---

# 3. else-if Ladder

Used when multiple conditions need to be checked.

## Syntax

```java
if(condition1){
}
else if(condition2){
}
else{
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int marks = 75;

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 80){
            System.out.println("Grade B");
        }
        else if(marks >= 70){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
```

### Output

```text
Grade C
```

---

# 4. Nested if

An if statement inside another if statement.

## Example

```java
public class Main {
    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        if(age >= 18){

            if(hasLicense){
                System.out.println("Can Drive");
            }

        }
    }
}
```

### Output

```text
Can Drive
```

---

# 5. switch Statement

Used to select one block of code from many options.

## Syntax

```java
switch(expression){

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int day = 3;

        switch(day){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
```

### Output

```text
Wednesday
```

---

# Comparison Operators

| Operator | Meaning               | Example |
| -------- | --------------------- | ------- |
| ==       | Equal To              | a == b  |
| !=       | Not Equal To          | a != b  |
| >        | Greater Than          | a > b   |
| <        | Less Than             | a < b   |
| >=       | Greater Than Equal To | a >= b  |
| <=       | Less Than Equal To    | a <= b  |

---

# Logical Operators

| Operator | Meaning | Example             |
| -------- | ------- | ------------------- |
| &&       | AND     | age > 18 && citizen |
| ||       | OR      | age > 18 || citizen |
| !        | NOT     | !isLoggedIn         |

---

# Example Using Logical Operators

```java
public class Main {
    public static void main(String[] args) {

        int age = 25;
        boolean citizen = true;

        if(age >= 18 && citizen){
            System.out.println("Eligible");
        }
    }
}
```

---

# Ternary Operator

Short form of if-else.

## Syntax

```java
condition ? value1 : value2;
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int age = 20;

        String result = (age >= 18)
                ? "Adult"
                : "Minor";

        System.out.println(result);
    }
}
```

### Output

```text
Adult
```

---

# Interview Questions and Answers

## 1. What is a conditional statement?

A conditional statement is used to execute code based on a condition.

---

## 2. What are the conditional statements in Java?

* if
* if-else
* else-if
* Nested if
* switch

---

## 3. Difference between if and if-else?

| if                                   | if-else                           |
| ------------------------------------ | --------------------------------- |
| Executes only when condition is true | Handles both true and false cases |
| No alternative block                 | Has else block                    |

---

## 4. What is an else-if ladder?

Used to check multiple conditions sequentially.

```java
if(marks >= 90){
}
else if(marks >= 80){
}
else{
}
```

---

## 5. What is a nested if statement?

An if statement placed inside another if statement.

```java
if(age >= 18){
    if(hasLicense){
        System.out.println("Can Drive");
    }
}
```

---

## 6. Why is break used in switch?

To stop execution after a matching case.

```java
case 1:
    System.out.println("Monday");
    break;
```

---

## 7. What happens if break is omitted?

Execution continues to the next cases (fall-through).

```java
case 1:
    System.out.println("Monday");

case 2:
    System.out.println("Tuesday");
```

---

## 8. What is the default case in switch?

Executed when no case matches.

```java
default:
    System.out.println("Invalid");
```

---

## 9. Difference between switch and if-else?

| switch                  | if-else                                  |
| ----------------------- | ---------------------------------------- |
| Better for fixed values | Better for ranges and complex conditions |
| Cleaner syntax          | More flexible                            |

---

## 10. What is the ternary operator?

A shorthand version of if-else.

```java
String result = (age >= 18) ? "Adult" : "Minor";
```

---

## 11. Which operator is used for AND?

```java
&&
```

Example:

```java
if(age >= 18 && citizen)
```

---

## 12. Which operator is used for OR?

```java
||
```

Example:

```java
if(age >= 18 || citizen)
```

---

## 13. Which operator is used for NOT?

```java
!
```

Example:

```java
if(!isLoggedIn)
```

---

## 14. Can switch use String values?

Yes.

```java
String day = "Monday";

switch(day){
    case "Monday":
        System.out.println("Start Week");
        break;
}
```

---

## 15. Which is faster: switch or if-else?

For many fixed values, `switch` is generally more efficient and easier to read.

---

# Quick Revision

| Statement | Purpose                        |
| --------- | ------------------------------ |
| if        | Execute when condition is true |
| if-else   | Handle true and false cases    |
| else-if   | Check multiple conditions      |
| Nested if | if inside another if           |
| switch    | Select one option from many    |
| Ternary   | Short form of if-else          |

## Memory Trick

```text
One Condition      → if

Two Possibilities  → if-else

Many Conditions    → else-if

Many Fixed Values  → switch

Short if-else      → Ternary Operator
```
