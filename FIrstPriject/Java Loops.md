# Java Loops

Java provides 4 main loops:

1. for Loop
2. while Loop
3. do-while Loop
4. Enhanced for-each Loop

---

# 1. for Loop

Used when the number of iterations is known.

## Syntax

```java
for(initialization; condition; increment/decrement){
    // code
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }
}
```

## Output

```
1
2
3
4
5
```

---

# 2. while Loop

Checks the condition first and then executes the code.

## Syntax

```java
while(condition){
    // code
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int i = 1;

        while(i <= 5){
            System.out.println(i);
            i++;
        }

    }
}
```

## Output

```
1
2
3
4
5
```

---

# 3. do-while Loop

Executes the code first and then checks the condition.

## Syntax

```java
do{
    // code
}while(condition);
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int i = 1;

        do{
            System.out.println(i);
            i++;
        }while(i <= 5);

    }
}
```

## Output

```
1
2
3
4
5
```

---

# Difference Between while and do-while

## while Example

```java
int i = 10;

while(i < 5){
    System.out.println(i);
}
```

### Output

```
No Output
```

---

## do-while Example

```java
int i = 10;

do{
    System.out.println(i);
}while(i < 5);
```

### Output

```
10
```

**Note:** do-while executes at least one time.

---

# 4. Enhanced for-each Loop

Used to iterate through arrays and collections.

## Syntax

```java
for(dataType variable : array){
    // code
}
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for(int num : numbers){
            System.out.println(num);
        }

    }
}
```

## Output

```
10
20
30
40
50
```

---

# Nested Loop

A loop inside another loop.

## Example

```java
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++) {

            for(int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}
```

## Output

```
1 2 3
1 2 3
1 2 3
```

---

# break Statement

Stops the loop immediately.

## Example

```java
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {

            if(i == 5) {
                break;
            }

            System.out.println(i);
        }

    }
}
```

## Output

```
1
2
3
4
```

---

# continue Statement

Skips the current iteration.

## Example

```java
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            if(i == 3) {
                continue;
            }

            System.out.println(i);
        }

    }
}
```

## Output

```
1
2
4
5
```

---

# Infinite Loop

## Example

```java
while(true){
    System.out.println("Infinite Loop");
}
```

---

# Interview Questions

## 1. What are the types of loops in Java?

- for loop
- while loop
- do-while loop
- enhanced for-each loop

---

## 2. Which loop executes at least once?

**Answer:** do-while loop

---

## 3. Difference between break and continue?

| break | continue |
|---------|---------|
| Terminates loop | Skips current iteration |
| Exits loop completely | Continues next iteration |

---

## 4. When should you use a for loop?

When the number of iterations is known.

---

## 5. When should you use a while loop?

When the number of iterations depends on a condition.

---

## 6. Can we create an infinite loop?

Yes.

```java
while(true){
    // code
}
```

---

## 7. What is a nested loop?

A loop inside another loop.

---

## 8. What is the purpose of the for-each loop?

To traverse arrays and collections easily.

---

# Quick Revision Table

| Loop | Condition Check | Executes At Least Once |
|--------|---------------|----------------------|
| for | Before execution | No |
| while | Before execution | No |
| do-while | After execution | Yes |
| for-each | Array/Collection traversal | Depends on elements |

---

# Practice Programs

1. Print 1 to 100
2. Print even numbers from 1 to 100
3. Print odd numbers from 1 to 100
4. Multiplication table
5. Sum of N numbers
6. Factorial of a number
7. Reverse a number
8. Palindrome number
9. Star pattern
10. Pyramid pattern