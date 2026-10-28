# Workshop 3 — Programming Structures 2

**Student:** Gabriel  
**Repository:** workshop3  
**Pages URL:** https://gabriel-116.github.io/workshop3/

---

## Part 1 — StringBuffer

### 1. WelcomeMessage

```java
public class WelcomeMessage {
    public static void main(String[] args) {
        String name = "Alice";
        String city = "Melbourne";

        StringBuffer message = new StringBuffer("Welcome, ");
        message.append(name);
        message.append("! We hope you're enjoying your time in ").append(city).append(".");

        System.out.println(message);
    }
}
```

**Output:**
```
Welcome, Alice! We hope you're enjoying your time in Melbourne.
```

---

### 2. Palindrome

```java
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        StringBuffer reversed = new StringBuffer(word);
        reversed.reverse();
        if (word.equalsIgnoreCase(reversed.toString())) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
        scanner.close();
    }
}
```

**Test input:** `level`  
**Output:**
```
level is a palindrome.
```

---

## Part 2 — Casting

### 1. Widening / Narrowing (short answer)

| | Type conversion | Direction |
|---|---|---|
| a) | int → long | Widening (implicit) |
| b) | double → float | Narrowing (explicit cast) |
| c) | long → int | Narrowing (explicit cast) |
| d) | float → double | Widening (implicit) |

---

### 2. NationalDebt

```java
public class NationalDebt {
    public static void main(String[] args) {
        long nationalDebt = 3100000000000L;
        int debtInt = (int) nationalDebt;
        System.out.println("National debt as long: " + nationalDebt);
        System.out.println("National debt as int:  " + debtInt);
    }
}
```

**Output:**
```
National debt as long: 3100000000000
National debt as int:  -147483648
```

---

### 3. PrecisionDemo

```java
public class PrecisionDemo {
    public static void main(String[] args) {
        double pi = 3.1415926535;
        float piFloat = (float) pi;
        System.out.println("Double PI: " + pi);
        System.out.println("Float PI: " + piFloat);

        double money1 = 23.99;
        System.out.println("23.99 as double: " + money1);

        double money2 = 23.00;
        System.out.println("23.00 as double: " + money2);
    }
}
```

**Output:**
```
Double PI: 3.1415926535
Float PI: 3.1415927
23.99 as double: 23.99
23.00 as double: 23.0
```

---

### 4. AgeToInt

```java
public class AgeToInt {
    public static void main(String[] args) {
        String ageStr = "20";
        int age = Integer.parseInt(ageStr);
        System.out.println("Age as integer: " + age);
        System.out.println("Age next year: " + (age + 1));
    }
}
```

**Output:**
```
Age as integer: 20
Age next year: 21
```

---

### 5. StatusToString

```java
public class StatusToString {
    public static void main(String[] args) {
        boolean status = true;
        String statusStr = String.valueOf(status);
        System.out.println("Status stored as String: " + statusStr);
    }
}
```

**Output:**
```
Status stored as String: true
```

---

## Part 3 — Conditional Logic & Loops

### Exercise 1 — Hour Greeting / Multiples / Sum (while loop)

```java
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // (a) Input hour 1-24, print greeting
        System.out.print("Enter an hour (1-24): ");
        int hour = scanner.nextInt();
        if (hour < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        // (b) While loop: print multiples of 5 from 10 to 95
        int n = 10;
        while (n <= 95) {
            if (n % 5 == 0) {
                System.out.println(n);
            }
            n++;
        }

        // (c) While loop: sum 1 to 10
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of 1 to 10 is: " + sum);

        scanner.close();
    }
}
```

**Test input:** `3`  
**Output:**
```
Good day
10
15
20
25
30
35
40
45
50
55
60
65
70
75
80
85
90
95
Sum of 1 to 10 is: 55
```

---

### Exercise 2 — SmallestNumber

```java
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        double smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("The smallest number is: " + smallest);
        scanner.close();
    }
}
```

**Test input:**
```
5
2
9
```
**Output:**
```
The smallest number is: 2.0
```

---

### Exercise 3 — NumberToLetter

```java
import java.util.Scanner;
public class NumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 35: ");
        int num = scanner.nextInt();
        if (num <= 9) {
            System.out.println(num);
        } else {
            char letter = (char) ('A' + (num - 10));
            System.out.println(letter);
        }
        scanner.close();
    }
}
```

**Test input:** `11`  
**Output:** `B`

---

### Exercise 4A — SumOfSquares

```java
public class SumOfSquares {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i * i;
        }
        System.out.println("Sum of squares of the first 100 integers: " + sum);
    }
}
```

**Output:**
```
Sum of squares of the first 100 integers: 338350
```

---

### Exercise 4B — PerfectSquares

```java
public class PerfectSquares {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            double root = Math.sqrt(i);
            if (root == (int) root) {
                System.out.println(i);
            }
        }
    }
}
```

**Output:**
```
1
4
9
16
25
36
49
64
81
100
```

---

### Exercise 6 — FramingCost

```java
import java.util.Scanner;
public class FramingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the picture (inches): ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the picture (inches): ");
        double width = scanner.nextDouble();
        System.out.print("Enter frame type (regular or fancy): ");
        String type = scanner.next();
        System.out.print("Enter the colour for the frame: ");
        String colour = scanner.next();
        System.out.print("Enter number of crowns (0 if none): ");
        int crowns = scanner.nextInt();

        double perimeter = 2 * (length + width);
        double framePerInch = type.equalsIgnoreCase("fancy") ? 0.25 : 0.15;
        double colourPerInch = 0.10;
        double crownCost = crowns * 0.35;
        double total = perimeter * (framePerInch + colourPerInch) + crownCost;

        System.out.println("Frame colour: " + colour);
        System.out.printf("Total cost of framing: $%.2f%n", total);
        scanner.close();
    }
}
```

**Test input:**
```
10
5
regular
red
0
```
**Output:**
```
Frame colour: red
Total cost of framing: $9.00
```

---

*End of Workshop 3.*
