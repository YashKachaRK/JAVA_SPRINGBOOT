# One Dimensional Array in Java

## What is an Array?

An array is a collection of elements of the same data type stored in contiguous memory locations.

### Benefits

- Stores multiple values in a single variable
- Easy data management
- Faster access using index

---

## Array Declaration

### Syntax

```java
dataType[] arrayName;
```

### Example

```java
int[] arr;
```

---

## Array Initialization

### Method 1

```java
int[] arr = new int[5];
```

### Method 2

```java
int[] arr = {10, 20, 30, 40, 50};
```

---

## User Input Using Scanner

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }
}
```

---

## Array Traversal

```java
int[] arr = {10,20,30,40,50};

for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

---

## Sum of Array Elements

```java
int[] arr = {10,20,30,40,50};

int sum = 0;

for(int num : arr) {
    sum += num;
}

System.out.println("Sum = " + sum);
```

### Output

```
Sum = 150
```

---

## Maximum Element

```java
int[] arr = {10,20,30,40,50};

int max = arr[0];

for(int i = 1; i < arr.length; i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
}

System.out.println(max);
```

### Output

```
50
```

---

## Minimum Element

```java
int[] arr = {10,20,30,40,50};

int min = arr[0];

for(int i = 1; i < arr.length; i++) {
    if(arr[i] < min) {
        min = arr[i];
    }
}

System.out.println(min);
```

### Output

```
10
```

---

## Linear Search

```java
int[] arr = {10,20,30,40,50};

int key = 30;
boolean found = false;

for(int i = 0; i < arr.length; i++) {
    if(arr[i] == key) {
        System.out.println("Found at index: " + i);
        found = true;
        break;
    }
}

if(!found) {
    System.out.println("Not Found");
}
```

---

# Interview Questions

### 1. What is an array?

Collection of similar data types stored in contiguous memory.

### 2. What is array indexing?

Accessing elements using index positions.

### 3. What is the default value of int array?

0

### 4. Can array size be changed after creation?

No.

### 5. Difference between array length and String length()?

- Array → length
- String → length()

### 6. What is Linear Search?

Searching elements one by one.

---

# Quick Revision

| Operation | Time Complexity |
|------------|----------------|
| Access | O(1) |
| Traversal | O(n) |
| Search | O(n) |
| Insert | O(n) |
| Delete | O(n) |