# Scanner Class Methods in Java

The `Scanner` class provides many methods to read different types of input from the user.

## Scanner Class Methods Table

| Method           | Return Type | Purpose                | Example Input | Example Code          |
| ---------------- | ----------- | ---------------------- | ------------- | --------------------- |
| next()           | String      | Reads a single word    | Yash          | `sc.next()`           |
| nextLine()       | String      | Reads a complete line  | Yash Patel    | `sc.nextLine()`       |
| nextInt()        | int         | Reads an integer       | 100           | `sc.nextInt()`        |
| nextDouble()     | double      | Reads a decimal number | 99.99         | `sc.nextDouble()`     |
| nextFloat()      | float       | Reads a float value    | 12.5          | `sc.nextFloat()`      |
| nextLong()       | long        | Reads a long value     | 9999999999    | `sc.nextLong()`       |
| nextShort()      | short       | Reads a short value    | 100           | `sc.nextShort()`      |
| nextByte()       | byte        | Reads a byte value     | 127           | `sc.nextByte()`       |
| nextBoolean()    | boolean     | Reads true/false       | true          | `sc.nextBoolean()`    |
| next().charAt(0) | char        | Reads a character      | A             | `sc.next().charAt(0)` |

---

# Examples of Scanner Methods

## next()

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Name: ");
String name = sc.next();

System.out.println(name);
```

Input:

```text
Yash Patel
```

Output:

```text
Yash
```

---

## nextLine()

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Full Name: ");
String name = sc.nextLine();

System.out.println(name);
```

Input:

```text
Yash Patel
```

Output:

```text
Yash Patel
```

---

## nextInt()

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Age: ");
int age = sc.nextInt();

System.out.println(age);
```

---

## nextDouble()

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Salary: ");
double salary = sc.nextDouble();

System.out.println(salary);
```

---

## nextBoolean()

```java
Scanner sc = new Scanner(System.in);

System.out.print("Java is Easy? ");
boolean answer = sc.nextBoolean();

System.out.println(answer);
```

Input:

```text
true
```

Output:

```text
true
```

---

# Useful Scanner Checking Methods

These methods check whether the next input is of a particular type.

| Method           | Purpose                         |
| ---------------- | ------------------------------- |
| hasNext()        | Checks if another token exists  |
| hasNextInt()     | Checks if next input is int     |
| hasNextDouble()  | Checks if next input is double  |
| hasNextBoolean() | Checks if next input is boolean |
| hasNextLine()    | Checks if another line exists   |

### Example

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Number: ");

if(sc.hasNextInt()) {
    int num = sc.nextInt();
    System.out.println(num);
} else {
    System.out.println("Invalid Input");
}
```

---

# Scanner Class Common Methods

| Method         | Purpose                   |
| -------------- | ------------------------- |
| close()        | Closes scanner            |
| reset()        | Resets scanner settings   |
| skip()         | Skips matching input      |
| useDelimiter() | Changes delimiter         |
| delimiter()    | Returns current delimiter |

---

# Interview Questions

### Which package contains Scanner class?

```java
import java.util.Scanner;
```

Package:

```text
java.util
```

---

### How do you create a Scanner object?

```java
Scanner sc = new Scanner(System.in);
```

---

### Difference between next() and nextLine()?

| next()         | nextLine()          |
| -------------- | ------------------- |
| Reads one word | Reads complete line |
| Stops at space | Reads spaces        |

---

### Which method reads an integer?

```java
sc.nextInt();
```

---

### Which method reads a double value?

```java
sc.nextDouble();
```

---

### How do you read a character?

```java
char ch = sc.next().charAt(0);
```

---

### Why should Scanner be closed?

To release system resources and avoid resource leaks.

```java
sc.close();
```


# User Input in Java

## What is User Input?

User Input allows a program to receive data from the keyboard while the program is running.

In Java, user input is commonly taken using the `Scanner` class.

---

# Import Scanner Class

```java
import java.util.Scanner;
```

---

# Create Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

* `Scanner` = Class
* `sc` = Object
* `System.in` = Standard Input Stream (Keyboard)

---

# Taking String Input

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);
    }
}
```

### Output

```text
Enter Name: Yash
Hello Yash
```

---

# Taking Integer Input

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Age: " + age);
    }
}
```

### Output

```text
Enter Age: 21
Age: 21
```

---

# Taking Double Input

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Salary: " + salary);
    }
}
```

---

# Taking Character Input

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("Grade: " + grade);
    }
}
```

### Output

```text
Enter Grade: A
Grade: A
```

---

# Scanner Methods Table

| Method           | Description         | Example               |
| ---------------- | ------------------- | --------------------- |
| next()           | Reads a single word | `sc.next()`           |
| nextLine()       | Reads a full line   | `sc.nextLine()`       |
| nextInt()        | Reads integer       | `sc.nextInt()`        |
| nextDouble()     | Reads double        | `sc.nextDouble()`     |
| nextFloat()      | Reads float         | `sc.nextFloat()`      |
| nextLong()       | Reads long          | `sc.nextLong()`       |
| nextBoolean()    | Reads boolean       | `sc.nextBoolean()`    |
| next().charAt(0) | Reads character     | `sc.next().charAt(0)` |

---

# Multiple Inputs Example

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
```

---

# Important Difference

## next()

Reads only one word.

```java
String name = sc.next();
```

Input:

```text
Yash Patel
```

Output:

```text
Yash
```

---

## nextLine()

Reads the complete line.

```java
String name = sc.nextLine();
```

Input:

```text
Yash Patel
```

Output:

```text
Yash Patel
```

---

# Closing Scanner

```java
sc.close();
```

Example:

```java
Scanner sc = new Scanner(System.in);

// Code

sc.close();
```

---

# Interview Questions

## 1. Which class is used for user input in Java?

`Scanner` class.

```java
import java.util.Scanner;
```

---

## 2. Which package contains Scanner?

```java
java.util
```

---

## 3. How do you create a Scanner object?

```java
Scanner sc = new Scanner(System.in);
```

---

## 4. Difference between next() and nextLine()?

| next()         | nextLine()          |
| -------------- | ------------------- |
| Reads one word | Reads complete line |
| Stops at space | Reads spaces too    |

---

## 5. How do you take integer input?

```java
int age = sc.nextInt();
```

---

## 6. How do you take double input?

```java
double salary = sc.nextDouble();
```

---

## 7. How do you take character input?

```java
char grade = sc.next().charAt(0);
```

---

## 8. Why should Scanner be closed?

To release system resources.

```java
sc.close();
```

---

# Quick Revision

| Input Type    | Method             |
| ------------- | ------------------ |
| String (Word) | `next()`           |
| String (Line) | `nextLine()`       |
| int           | `nextInt()`        |
| double        | `nextDouble()`     |
| float         | `nextFloat()`      |
| long          | `nextLong()`       |
| boolean       | `nextBoolean()`    |
| char          | `next().charAt(0)` |

## Memory Trick

```text
Word      → next()
Sentence  → nextLine()
Number    → nextInt(), nextDouble()
Character → next().charAt(0)
```
