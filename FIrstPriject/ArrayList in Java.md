# ArrayList in Java

## Introduction

`ArrayList` is a class in the Java Collections Framework that implements the `List` interface.

### Features

* Dynamic size (can grow automatically)
* Maintains insertion order
* Allows duplicate elements
* Provides fast random access using indexes
* Stores objects (use wrapper classes for primitives)

### Package

```java
import java.util.ArrayList;
```

---

# Creating an ArrayList

## Syntax

```java
ArrayList<DataType> list = new ArrayList<>();
```

### Example

```java
ArrayList<String> names = new ArrayList<>();
```

---

# Adding Elements

## add()

```java
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");

System.out.println(fruits);
```

### Output

```text
[Apple, Banana, Mango]
```

---

# Adding Element at Specific Index

```java
fruits.add(1, "Orange");

System.out.println(fruits);
```

### Output

```text
[Apple, Orange, Banana, Mango]
```

---

# Accessing Elements

## get()

```java
System.out.println(fruits.get(0));
```

### Output

```text
Apple
```

---

# Updating Elements

## set()

```java
fruits.set(1, "Grapes");

System.out.println(fruits);
```

### Output

```text
[Apple, Grapes, Banana, Mango]
```

---

# Removing Elements

## Remove by Index

```java
fruits.remove(0);
```

---

## Remove by Value

```java
fruits.remove("Banana");
```

---

# Checking Element Exists

## contains()

```java
System.out.println(fruits.contains("Mango"));
```

### Output

```text
true
```

---

# Size of ArrayList

## size()

```java
System.out.println(fruits.size());
```

---

# Check Empty

## isEmpty()

```java
System.out.println(fruits.isEmpty());
```

---

# Clear ArrayList

## clear()

```java
fruits.clear();
```

---

# Traversing ArrayList

## Using For Loop

```java
for(int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}
```

---

## Using Enhanced For Loop

```java
for(String fruit : fruits) {
    System.out.println(fruit);
}
```

---

## Using Iterator

```java
Iterator<String> itr = fruits.iterator();

while(itr.hasNext()) {
    System.out.println(itr.next());
}
```

---

# Sorting ArrayList

## Ascending Order

```java
Collections.sort(fruits);
```

---

## Descending Order

```java
Collections.sort(fruits, Collections.reverseOrder());
```

---

# ArrayList with Integer

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);

System.out.println(numbers);
```

---

# ArrayList of Custom Objects

```java
class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```

```java
ArrayList<Student> students = new ArrayList<>();

students.add(new Student(1, "Yash"));
students.add(new Student(2, "Raj"));
```

---

# Important Methods

| Method              | Description           |
| ------------------- | --------------------- |
| add()               | Add element           |
| add(index, element) | Add at specific index |
| get()               | Retrieve element      |
| set()               | Update element        |
| remove()            | Delete element        |
| contains()          | Check existence       |
| size()              | Number of elements    |
| isEmpty()           | Check empty           |
| clear()             | Remove all elements   |

---

# Internal Working

ArrayList internally uses a dynamic array.

```text
Index:   0      1      2      3
       -------------------------
Data:  Apple  Mango Banana Orange
       -------------------------
```

When capacity becomes full:

```text
Old Capacity = 10
New Capacity = 15
```

Formula:

```java
newCapacity = oldCapacity + (oldCapacity / 2);
```

---

# Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| add()     | O(1)       |
| get()     | O(1)       |
| set()     | O(1)       |
| remove()  | O(n)       |
| search()  | O(n)       |

---

# Advantages

* Fast data retrieval
* Easy to use
* Dynamic size
* Maintains insertion order

---

# Disadvantages

* Slow insertion in the middle
* Slow deletion in the middle
* Uses more memory during resizing

---

# ArrayList vs Array

| Array                      | ArrayList       |
| -------------------------- | --------------- |
| Fixed Size                 | Dynamic Size    |
| Stores primitives directly | Stores objects  |
| Faster                     | Slightly slower |
| Length property            | size() method   |

---

# ArrayList vs LinkedList

| Feature   | ArrayList     | LinkedList         |
| --------- | ------------- | ------------------ |
| Structure | Dynamic Array | Doubly Linked List |
| Access    | Fast O(1)     | Slow O(n)          |
| Insert    | Slow          | Fast               |
| Delete    | Slow          | Fast               |
| Memory    | Less          | More               |

---

# Interview Questions

## Q1. What is ArrayList?

ArrayList is a resizable array implementation of the List interface.

---

## Q2. Does ArrayList Allow Duplicate Elements?

Yes.

```java
list.add("Java");
list.add("Java");
```

Output:

```text
[Java, Java]
```

---

## Q3. Does ArrayList Maintain Insertion Order?

Yes.

---

## Q4. Can ArrayList Store Primitive Data Types?

No directly.

Use Wrapper Classes:

```java
ArrayList<Integer> list = new ArrayList<>();
```

---

## Q5. Difference Between Array and ArrayList?

Array has fixed size while ArrayList has dynamic size.

---

## Q6. Is ArrayList Thread-Safe?

No.

For thread safety use:

```java
Vector<Integer> vector = new Vector<>();
```

or

```java
Collections.synchronizedList(list);
```

---

## Q7. What is Default Capacity of ArrayList?

Default capacity is **10** (when first element is added).

---

## Q8. Why is ArrayList Faster Than LinkedList for Retrieval?

Because ArrayList supports direct index-based access.

---

# Quick Revision

```text
ArrayList
│
├── Dynamic Array
├── Ordered
├── Allows Duplicates
├── Fast Retrieval
│
├── add()
├── get()
├── set()
├── remove()
├── contains()
├── size()
├── clear()
│
├── For Loop
├── For-Each Loop
├── Iterator
│
└── Collections.sort()
```
