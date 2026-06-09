# 14. Wrapper Class.md

# Java Wrapper Class

## What is a Wrapper Class?

A Wrapper Class is a class that converts a primitive data type into an object.

Java provides wrapper classes for all primitive data types.

### Why?

Collections (ArrayList, HashMap, etc.) store objects, not primitive values.

Wrapper classes allow primitive values to be treated as objects.

---

# Primitive Types and Wrapper Classes

| Primitive Type | Wrapper Class |
|---------------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

# Example

```java
int num = 10;

Integer obj = Integer.valueOf(num);

System.out.println(obj);
```

### Output

```text
10
```

---

# Why Use Wrapper Classes?

- Required for Collections
- Utility Methods Available
- Supports Generics
- Converts Data Types
- Can Store Null Values

---

# Boxing

Converting a primitive value into a wrapper object.

### Example

```java
int num = 100;

Integer obj = Integer.valueOf(num);

System.out.println(obj);
```

### Output

```text
100
```

---

# Unboxing

Converting a wrapper object into a primitive value.

### Example

```java
Integer obj = Integer.valueOf(100);

int num = obj.intValue();

System.out.println(num);
```

### Output

```text
100
```

---

# Autoboxing

Java automatically converts primitive data into wrapper objects.

### Example

```java
int num = 50;

Integer obj = num;
```

Java converts:

```java
Integer obj = Integer.valueOf(num);
```

Automatically.

---

# Auto-Unboxing

Java automatically converts wrapper objects into primitive values.

### Example

```java
Integer obj = 100;

int num = obj;
```

Java converts:

```java
int num = obj.intValue();
```

Automatically.

---

# Example: Autoboxing and Unboxing

```java
public class Main {

    public static void main(String[] args) {

        Integer number = 100; // Autoboxing

        int value = number; // Auto-Unboxing

        System.out.println(number);
        System.out.println(value);
    }
}
```

### Output

```text
100
100
```

---

# Wrapper Class Methods

## Integer Class

### parseInt()

Converts String to int.

```java
String str = "123";

int num = Integer.parseInt(str);

System.out.println(num);
```

### Output

```text
123
```

---

## valueOf()

Returns Wrapper Object.

```java
Integer num = Integer.valueOf("100");

System.out.println(num);
```

### Output

```text
100
```

---

## toString()

Converts number into String.

```java
Integer num = 500;

String str = num.toString();

System.out.println(str);
```

### Output

```text
500
```

---

# Double Wrapper Class

```java
Double d = Double.valueOf("12.5");

System.out.println(d);
```

### Output

```text
12.5
```

---

# Character Wrapper Class

```java
Character ch = 'A';

System.out.println(ch);
```

### Output

```text
A
```

---

# Boolean Wrapper Class

```java
Boolean status = true;

System.out.println(status);
```

### Output

```text
true
```

---

# Wrapper Class with ArrayList

Primitive values cannot be used directly.

❌ Invalid

```java
ArrayList<int> list = new ArrayList<>();
```

✔ Valid

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);

System.out.println(list);
```

### Output

```text
[10, 20]
```

---

# String to Primitive Conversion

## String → int

```java
String str = "200";

int num = Integer.parseInt(str);
```

---

## String → double

```java
String str = "10.5";

double d = Double.parseDouble(str);
```

---

## String → long

```java
String str = "1000";

long value = Long.parseLong(str);
```

---

# Primitive to String Conversion

## Using String.valueOf()

```java
int num = 100;

String str = String.valueOf(num);

System.out.println(str);
```

### Output

```text
100
```

---

# Null Values

Primitive types cannot store null.

❌ Invalid

```java
int num = null;
```

✔ Valid

```java
Integer num = null;
```

---

# Wrapper Class Example

```java
public class Main {

    public static void main(String[] args) {

        Integer age = 22;

        Double salary = 50000.50;

        Boolean active = true;

        System.out.println(age);
        System.out.println(salary);
        System.out.println(active);
    }
}
```

### Output

```text
22
50000.5
true
```

---

# Wrapper Class vs Primitive Type

| Primitive | Wrapper Class |
|------------|-------------|
| Faster | Slightly Slower |
| Stores Value Only | Stores Object |
| Cannot Store null | Can Store null |
| Less Memory | More Memory |
| No Utility Methods | Utility Methods Available |

---

# Advantages of Wrapper Classes

- Works with Collections
- Supports Generics
- Utility Methods Available
- Object-Oriented Features
- Can Store Null

---

# Disadvantages

- Uses More Memory
- Slightly Slower than Primitive Types
- Extra Object Creation

---

# Interview Questions

## Q1. What is a Wrapper Class?

A class that converts primitive data types into objects.

---

## Q2. Why are Wrapper Classes needed?

Collections and Generics work with objects, not primitive types.

---

## Q3. What is Boxing?

Converting primitive data into wrapper objects.

```java
Integer num = Integer.valueOf(10);
```

---

## Q4. What is Unboxing?

Converting wrapper objects into primitive values.

```java
int num = obj.intValue();
```

---

## Q5. What is Autoboxing?

Automatic conversion from primitive to wrapper.

```java
Integer num = 10;
```

---

## Q6. What is Auto-Unboxing?

Automatic conversion from wrapper to primitive.

```java
int num = integerObj;
```

---

## Q7. Which method converts String to int?

```java
Integer.parseInt()
```

---

## Q8. Which method converts String to double?

```java
Double.parseDouble()
```

---

## Q9. Can primitive types store null?

No.

```java
int num = null; // Error
```

---

## Q10. Which is faster: Primitive or Wrapper?

Primitive types are faster because they do not create objects.

---

# Summary

- Wrapper Classes convert primitive data types into objects.
- Java provides wrapper classes for all primitive types.
- Supports Boxing and Unboxing.
- Autoboxing and Auto-Unboxing are automatic conversions.
- Useful with Collections and Generics.
- Wrapper Classes provide utility methods like:
  - parseInt()
  - valueOf()
  - toString()
- Wrapper objects can store null values.