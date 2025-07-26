# Java Data Types and Literals

## Introduction

Data type defines the values that a variable can take.  
For example, if a variable has `int` data type, it can only take integer values.

In Java, there are two categories of data types:
1. **Primitive Data Types**
2. **Non-Primitive Data Types** – Arrays and Strings are non-primitive data types.

We will focus on **primitive data types and literals** in this section.

---

## Java is a Statically Typed Language

A language is statically typed if the data type of a variable is known at compile time.  
This means you **must declare** the variable before using it.

```java
int num;
It is good practice to declare all variables at the beginning of the program.

1. Primitive Data Types
Java provides eight primitive data types:

byte

short

int

long

float

double

char

boolean


These have fixed sizes across platforms to maintain portability.

Whole Numbers
byte, short, int, and long

Fractional Numbers
float, double

Characters
char

True/False
boolean

byte
Range: -128 to 127

Size: 1 byte

Default: 0

java
Copy
Edit
class JavaExample {
    public static void main(String[] args) {
        byte num;
        num = 113;
        System.out.println(num);
    }
}
Output:

Copy
Edit
113
If you assign 150 to byte, it will cause a type mismatch error.

short
Range: -32,768 to 32,767

Size: 2 bytes

java
Copy
Edit
short num = 4567;
int
Range: -2,147,483,648 to 2,147,483,647

Size: 4 bytes

Default: 0

java
Copy
Edit
class JavaExample {
    public static void main(String[] args) {
        short num;
        num = 150;
        System.out.println(num);
    }
}
Output:

Copy
Edit
150
long
Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

Size: 8 bytes

java
Copy
Edit
class JavaExample {
    public static void main(String[] args) {
        long num = -12332252626L;
        System.out.println(num);
    }
}
Output:

diff
Copy
Edit
-12332252626
double
Precision: ~15 decimal digits

Size: 8 bytes

java
Copy
Edit
class JavaExample {
    public static void main(String[] args) {
        double num = -42937737.9d;
        System.out.println(num);
    }
}
Output:

diff
Copy
Edit
-4.29377379E7
float
Precision: ~6–7 decimal digits

Size: 4 bytes

java
Copy
Edit
class JavaExample {
    public static void main(String[] args) {
        float num = 19.98f;
        System.out.println(num);
    }
}
Output:

Copy
Edit
19.98
boolean
Values: true or false

java
Copy
Edit
class JavaExample {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println(b);
    }
}
Output:

arduino
Copy
Edit
false
char
Stores a single character

Size: 2 bytes

java
Copy
Edit
class JavaExample {
    public static void main(String[] args) {
        char ch = 'Z';
        System.out.println(ch);
    }
}
Output:

nginx
Copy
Edit
Z
2. Literals in Java
A literal is a fixed value assigned to a variable.

java
Copy
Edit
int num = 10;      // 10 is an integer literal
char ch = 'A';     // 'A' is a character literal
Integer Literals
java
Copy
Edit
byte b = 100;
short s = 200;
int num = 13313131;
long l = 928389283L;
Floating-Point Literals
java
Copy
Edit
double num1 = 22.4;
float num2 = 22.4f;   // Must use 'f' suffix for float
Character and String Literals
java
Copy
Edit
char ch = 'Z';
String str = "BeginnersBook";
3. Non-Primitive Data Types
Also known as Reference Data Types.
They store memory addresses that point to actual data (objects).

Types:
Class

Interface

Array

String

Enum

Collections (List, Set, Map, etc.)

Class
A class defines properties (fields) and behaviors (methods).

java
Copy
Edit
class Main {
    // code
}
Interface
Used to achieve abstraction and multiple inheritance.

java
Copy
Edit
interface Shape {
    public void draw();
    public void color();
}
Arrays
Stores multiple values of the same type.

java
Copy
Edit
int[] arr = { 1, 2, 3, 4, 5 };
String
A sequence of characters.

java
Copy
Edit
// Without using new
String s = "tpointtech";

// Using new
String str = new String("Austria");
Enum
Used to define a fixed set of constants.

java
Copy
Edit
enum Grade {
    FIRST,
    SECOND,
    THIRD
}
Java Non-Primitive Data Type Example
java
Copy
Edit
enum Color {
    RED,
    GREEN,
    BLUE;
}

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        int[] arr = { 1, 2, 3, 4, 5 };
        Color clr = Color.BLUE;

        System.out.println(clr);
        System.out.println(str);
        for (int member : arr) {
            System.out.print(member + ", ");
        }
    }
}
Output:

nginx
Copy
Edit
BLUE
Hello
1, 2, 3, 4, 5
