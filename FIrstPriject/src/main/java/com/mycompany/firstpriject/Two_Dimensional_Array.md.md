# Two Dimensional Array in Java

## Matrix Basics

A 2D array is an array of arrays.

Used to represent matrices, tables, and grids.

---

## Declaration

### Syntax

```java
dataType[][] arrayName;
```

### Example

```java
int[][] matrix;
```

---

## Initialization

```java
int[][] matrix = {
    {1,2,3},
    {4,5,6}
};
```

---

## User Input Using Scanner

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][3];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}
```

---

## Traversal

```java
int[][] matrix = {
    {1,2,3},
    {4,5,6}
};

for(int i = 0; i < matrix.length; i++) {
    for(int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## Matrix Addition

```java
int[][] a = {
    {1,2},
    {3,4}
};

int[][] b = {
    {5,6},
    {7,8}
};

int[][] sum = new int[2][2];

for(int i = 0; i < 2; i++) {
    for(int j = 0; j < 2; j++) {
        sum[i][j] = a[i][j] + b[i][j];
    }
}
```

---

## Matrix Multiplication

```java
int[][] a = {
    {1,2},
    {3,4}
};

int[][] b = {
    {5,6},
    {7,8}
};

int[][] result = new int[2][2];

for(int i = 0; i < 2; i++) {
    for(int j = 0; j < 2; j++) {
        for(int k = 0; k < 2; k++) {
            result[i][j] += a[i][k] * b[k][j];
        }
    }
}
```

---

# Interview Questions

### 1. What is a 2D array?

Array of arrays.

### 2. How many dimensions can arrays have?

Multiple dimensions.

### 3. How do you access an element?

```java
matrix[row][column]
```

### 4. What is matrix traversal?

Visiting every element of the matrix.

### 5. Time complexity of matrix traversal?

O(rows × columns)

---

# Quick Revision

| Operation | Complexity |
|------------|------------|
| Access | O(1) |
| Traversal | O(rows × cols) |
| Addition | O(rows × cols) |
| Multiplication | O(n³) |