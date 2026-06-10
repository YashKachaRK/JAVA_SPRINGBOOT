# 15. Exception Handling.md

# Java Exception Handling

## What is an Exception?

An Exception is an event that occurs during program execution and disrupts the normal flow of the program.

### Example

```java
int a = 10;
int b = 0;

System.out.println(a / b);
```

Output:

```text
Exception in thread "main" java.lang.ArithmeticException: / by zero
```

---

# Why Exception Handling?

Without exception handling:

```java
System.out.println("Start");

int result = 10 / 0;

System.out.println("End");
```

Output:

```text
Start
Exception...
```

Program terminates immediately.

Exception handling allows the program to continue gracefully.

---

# Exception Hierarchy

```text
Object
   |
Throwable
   |
-------------------------
|                       |
Error               Exception
                        |
                 RuntimeException
```

### Error

Serious problems.

Examples:

- OutOfMemoryError
- StackOverflowError

Usually not handled.

---

### Exception

Problems that can be handled.

Examples:

- ArithmeticException
- IOException
- NullPointerException

---

# Types of Exceptions

## 1. Checked Exception

Checked at compile time.

Examples:

- IOException
- FileNotFoundException
- SQLException

```java
FileReader file = new FileReader("data.txt");
```

Compiler forces handling.

---

## 2. Unchecked Exception

Checked at runtime.

Examples:

- ArithmeticException
- NullPointerException
- ArrayIndexOutOfBoundsException

```java
int x = 10 / 0;
```

---

# try-catch Block

Used to handle exceptions.

### Syntax

```java
try {
    // risky code
}
catch(Exception e) {
    // handling code
}
```

---

# Example

```java
public class Main {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program Continues");
    }
}
```

### Output

```text
Cannot divide by zero
Program Continues
```

---

# Multiple Catch Blocks

```java
try {

    int arr[] = {1, 2, 3};

    System.out.println(arr[5]);
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic Error");
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array Index Error");
}
```

### Output

```text
Array Index Error
```

---

# Exception Object

```java
try {
    int result = 10 / 0;
}
catch (ArithmeticException e) {

    System.out.println(e);
}
```

Output:

```text
java.lang.ArithmeticException: / by zero
```

---

# Common Methods

### getMessage()

```java
System.out.println(e.getMessage());
```

Output:

```text
/ by zero
```

---

### printStackTrace()

```java
e.printStackTrace();
```

Displays detailed exception information.

---

# finally Block

Executes whether exception occurs or not.

### Syntax

```java
try {
}
catch(Exception e) {
}
finally {
}
```

---

# Example

```java
try {

    int result = 10 / 0;
}
catch (Exception e) {

    System.out.println("Exception Handled");
}
finally {

    System.out.println("Finally Executed");
}
```

### Output

```text
Exception Handled
Finally Executed
```

---

# finally Without Exception

```java
try {

    System.out.println("No Error");
}
finally {

    System.out.println("Always Runs");
}
```

### Output

```text
No Error
Always Runs
```

---

# throw Keyword

Used to manually create an exception.

### Example

```java
public class Main {

    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not Eligible");
        }

        System.out.println("Eligible");
    }
}
```

Output:

```text
Exception in thread "main"
java.lang.ArithmeticException: Not Eligible
```

---

# throws Keyword

Declares exceptions that a method may throw.

### Example

```java
import java.io.IOException;

class Test {

    void readFile() throws IOException {

        throw new IOException("File Error");
    }
}
```

---

# Difference Between throw and throws

| throw | throws |
|---------|---------|
| Used inside method | Used in method declaration |
| Throws one exception | Declares exceptions |
| Creates exception object | Does not create object |

---

# Custom Exception

Creating your own exception class.

### Example

```java
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
```

Usage:

```java
class Test {

    static void checkAge(int age)
            throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                    "Age must be 18+");
        }
    }
}
```

---

# try-with-resources

Automatically closes resources.

### Example

```java
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader("test.txt"))) {

            System.out.println(br.readLine());
        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
```

---

# Common Exceptions

## ArithmeticException

```java
int result = 10 / 0;
```

---

## NullPointerException

```java
String str = null;

System.out.println(str.length());
```

---

## ArrayIndexOutOfBoundsException

```java
int arr[] = {1, 2};

System.out.println(arr[5]);
```

---

## NumberFormatException

```java
int num = Integer.parseInt("ABC");
```

---

## ClassCastException

```java
Object obj = "Hello";

Integer num = (Integer) obj;
```

---

# Exception Propagation

```java
class Test {

    void method1() {

        method2();
    }

    void method2() {

        int result = 10 / 0;
    }
}
```

Exception travels up the call stack until handled.

---

# Interview Questions

## Q1. What is an Exception?

An event that disrupts normal program execution.

---

## Q2. Difference Between Checked and Unchecked Exceptions?

| Checked | Unchecked |
|----------|-----------|
| Compile Time | Runtime |
| Must Handle | Optional |
| IOException | ArithmeticException |

---

## Q3. What is the Purpose of finally?

Used for cleanup code.

Always executes.

---

## Q4. Difference Between Error and Exception?

| Error | Exception |
|---------|-----------|
| Serious Problem | Recoverable Problem |
| JVM Issues | Application Issues |

---

## Q5. Difference Between throw and throws?

| throw | throws |
|---------|---------|
| Throw Exception | Declare Exception |

---

## Q6. Can We Have Multiple Catch Blocks?

Yes.

---

## Q7. Can We Use try Without catch?

Yes.

Using:

```java
try {
}
finally {
}
```

---

## Q8. What is Exception Propagation?

Passing exceptions up the method call stack.

---

## Q9. What is a Custom Exception?

User-defined exception class.

---

## Q10. Which Class is the Parent of All Exceptions?

```java
Throwable
```

---

# Summary

- Exceptions are runtime events that disrupt normal execution.
- Handled using:
  - try
  - catch
  - finally
  - throw
  - throws
- Types:
  - Checked Exceptions
  - Unchecked Exceptions
- finally always executes.
- throw creates exceptions.
- throws declares exceptions.
- Custom exceptions can be created.
- Exception handling makes applications more reliable.