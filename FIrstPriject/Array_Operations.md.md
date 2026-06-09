# Array Operations in Java

---

## Insert Element

### Example

```java
int[] arr = new int[6];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;

int position = 2;
int value = 25;

for(int i = 4; i >= position; i--) {
    arr[i + 1] = arr[i];
}

arr[position] = value;
```

---

## Delete Element

```java
int[] arr = {10,20,30,40,50};

int position = 2;

for(int i = position; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}
```

---

## Update Element

```java
int[] arr = {10,20,30,40,50};

arr[2] = 100;
```

### Output

```
10 20 100 40 50
```

---

## Search Element

```java
int[] arr = {10,20,30,40,50};

int key = 40;

for(int i = 0; i < arr.length; i++) {
    if(arr[i] == key) {
        System.out.println("Found");
        break;
    }
}
```

---

## Sort Array

```java
import java.util.Arrays;

int[] arr = {50,20,10,40,30};

Arrays.sort(arr);

System.out.println(Arrays.toString(arr));
```

### Output

```
[10, 20, 30, 40, 50]
```

---

## Reverse Array

```java
int[] arr = {10,20,30,40,50};

for(int i = arr.length - 1; i >= 0; i--) {
    System.out.print(arr[i] + " ");
}
```

### Output

```
50 40 30 20 10
```

---

## Copy Array

```java
import java.util.Arrays;

int[] arr = {10,20,30,40,50};

int[] copy = Arrays.copyOf(arr, arr.length);
```

---

## Merge Arrays

```java
int[] arr1 = {10,20,30};
int[] arr2 = {40,50,60};

int[] merged = new int[arr1.length + arr2.length];

System.arraycopy(arr1, 0, merged, 0, arr1.length);
System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
```

---

# Interview Questions

### 1. How do you insert an element in an array?

Shift elements right and place the new value.

### 2. How do you delete an element?

Shift elements left.

### 3. What is the complexity of insertion?

O(n)

### 4. What is the complexity of deletion?

O(n)

### 5. Which method is used to sort arrays?

```java
Arrays.sort()
```

### 6. How can you copy an array?

```java
Arrays.copyOf()
```

### 7. How can you merge arrays?

```java
System.arraycopy()
```

---

# Quick Revision

| Operation | Complexity |
|------------|------------|
| Access | O(1) |
| Search | O(n) |
| Insert | O(n) |
| Delete | O(n) |
| Sort | O(n log n) |
| Reverse | O(n) |
| Copy | O(n) |
| Merge | O(n + m) |