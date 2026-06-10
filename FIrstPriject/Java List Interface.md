# Java List Interface

## Introduction

The `List` interface is a part of the Java Collections Framework. It represents an ordered collection of elements.

### Features

* Maintains insertion order
* Allows duplicate elements
* Supports index-based access
* Dynamic in size

```java
import java.util.List;
import java.util.ArrayList;

List<String> list = new ArrayList<>();
```

---

# List Implementations

## 1. ArrayList

### Characteristics

* Uses a dynamic array internally
* Fast random access
* Slow insertion/deletion in the middle

### Example

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits);
    }
}
```

---

## 2. LinkedList

### Characteristics

* Uses a doubly linked list internally
* Fast insertion and deletion
* Slower random access

### Example

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Yash");
        names.add("Raj");

        System.out.println(names);
    }
}
```

---

## 3. Vector

### Characteristics

* Legacy class
* Thread-safe
* Slower than ArrayList

### Example

```java
import java.util.Vector;

Vector<Integer> vector = new Vector<>();

vector.add(10);
vector.add(20);

System.out.println(vector);
```

---

## 4. Stack

### Characteristics

* Follows LIFO (Last In First Out)
* Extends Vector

### Example

```java
import java.util.Stack;

Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);

System.out.println(stack.pop());
```

Output:

```text
20
```

---

# Common List Methods

## Adding Elements

```java
list.add("Java");
list.add("Python");
```

### Add at Specific Index

```java
list.add(1, "C++");
```

---

## Access Elements

```java
System.out.println(list.get(0));
```

---

## Update Elements

```java
list.set(0, "JavaScript");
```

---

## Remove Elements

### By Index

```java
list.remove(0);
```

### By Value

```java
list.remove("Python");
```

---

## Check Element Exists

```java
list.contains("Java");
```

---

## Find Index

```java
list.indexOf("Java");
```

---

## List Size

```java
list.size();
```

---

## Clear List

```java
list.clear();
```

---

# Traversing a List

## Using For Loop

```java
for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

---

## Using Enhanced For Loop

```java
for(String item : list) {
    System.out.println(item);
}
```

---

## Using Iterator

```java
Iterator<String> itr = list.iterator();

while(itr.hasNext()) {
    System.out.println(itr.next());
}
```

---

## Using ListIterator

```java
ListIterator<String> itr = list.listIterator();

while(itr.hasNext()) {
    System.out.println(itr.next());
}
```

---

# Sorting a List

## Ascending Order

```java
Collections.sort(list);
```

---

## Descending Order

```java
Collections.sort(list, Collections.reverseOrder());
```

---

# Convert Array to List

```java
String[] arr = {"Java", "Python", "C++"};

List<String> list = Arrays.asList(arr);
```

---

# Convert List to Array

```java
String[] arr = list.toArray(new String[0]);
```

---

# List of Custom Objects

## Example

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
List<Student> students = new ArrayList<>();

students.add(new Student(1, "Yash"));
students.add(new Student(2, "Raj"));
```

---

# Collections Utility Methods

```java
Collections.sort(list);
Collections.reverse(list);
Collections.shuffle(list);
Collections.max(list);
Collections.min(list);
Collections.frequency(list, "Java");
```

---

# ArrayList vs LinkedList

| Feature   | ArrayList     | LinkedList         |
| --------- | ------------- | ------------------ |
| Structure | Dynamic Array | Doubly Linked List |
| Access    | Fast          | Slow               |
| Insert    | Slow          | Fast               |
| Delete    | Slow          | Fast               |
| Memory    | Less          | More               |

---

# List vs Set

| List              | Set              |
| ----------------- | ---------------- |
| Allows Duplicates | No Duplicates    |
| Ordered           | Mostly Unordered |
| Index Based       | Not Index Based  |

---

# Iterator vs ListIterator

| Iterator                | ListIterator         |
| ----------------------- | -------------------- |
| Forward Only            | Forward & Backward   |
| Works with List and Set | Works with List Only |
| Less Powerful           | More Powerful        |

---

# Time Complexity

| Operation | ArrayList | LinkedList |
| --------- | --------- | ---------- |
| Add       | O(1)      | O(1)       |
| Get       | O(1)      | O(n)       |
| Remove    | O(n)      | O(1)*      |
| Search    | O(n)      | O(n)       |

* O(1) when node reference is known.

---

# Interview Questions

### 1. What is the List Interface?

A collection that maintains insertion order and allows duplicate elements.

---

### 2. Difference between ArrayList and LinkedList?

ArrayList uses a dynamic array while LinkedList uses a doubly linked list.

---

### 3. Does List Allow Duplicate Elements?

Yes.

```java
list.add("Java");
list.add("Java");
```

---

### 4. Which List Implementation is Thread-Safe?

Vector.

---

### 5. Difference Between Iterator and ListIterator?

Iterator can move only forward, whereas ListIterator can move both forward and backward.

---

### 6. Which is Better for Frequent Insertions?

LinkedList.

---

### 7. Which is Better for Fast Retrieval?

ArrayList.

---

# Quick Revision

```text
List Interface
│
├── ArrayList
├── LinkedList
├── Vector
└── Stack

Common Operations
├── add()
├── get()
├── set()
├── remove()
├── contains()
├── size()
└── clear()

Traversal
├── For Loop
├── Enhanced For Loop
├── Iterator
└── ListIterator

Utilities
├── sort()
├── reverse()
├── shuffle()
├── max()
└── min()
```
