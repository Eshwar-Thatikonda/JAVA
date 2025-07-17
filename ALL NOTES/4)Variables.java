======================================
              JAVA VARIABLE GUIDE
======================================

This guide will help you understand variables in Java, including how to declare and use them,
naming conventions, default values, and types of variables.

--------------------------------------
WHAT IS A VARIABLE?
--------------------------------------

In Java, a variable is a name for a memory location that holds a value of a particular data type.
It allows you to store and manipulate data during the execution of a program.

Variables can hold various types of data including integers, floating-point numbers, characters, 
and booleans, among others. You can also store complex data types such as arrays, objects, and strings.

EXAMPLE:
------------------------------------------------------
int i = 10;  // 'i' is a variable of type int with value 10
------------------------------------------------------

Here, int is the data type, and i is the name of the variable that holds the value 10.

--------------------------------------
JAVA VARIABLE DECLARATION: SYNTAX AND BEST PRACTICES
--------------------------------------

The basic syntax for declaring a variable is:

------------------------------------------------------
data_type variable_name = value;
------------------------------------------------------

- data_type: The type of data the variable will hold (int, double, String, etc.)
- variable_name: The name you give to the variable.
- value: The value assigned to the variable (optional at declaration).

For example:

------------------------------------------------------
int num;     // Declaration
num = 100;   // Initialization
------------------------------------------------------

Alternatively, you can declare and initialize in one step:

------------------------------------------------------
int num = 100;
------------------------------------------------------

EXAMPLES OF VARIABLE DECLARATION:

------------------------------------------------------
char ch = 'A';
int number = 100;
------------------------------------------------------

NOTE:
- By default, variables are initialized to 0 for numeric types, false for booleans, and null for objects 
if not explicitly assigned a value.

------------------------------------------------------
int num;
System.out.println(num);  // prints 0
------------------------------------------------------

--------------------------------------
TYPES OF VARIABLES IN JAVA
--------------------------------------

There are three types of variables in Java:

1. STATIC (OR CLASS) VARIABLES
2. INSTANCE (OR GLOBAL) VARIABLES
3. LOCAL VARIABLES

--------------------------------------
1. STATIC (OR CLASS) VARIABLES
--------------------------------------

Static variables are associated with the class, not individual objects. They are shared across all instances of the class.

TO DECLARE A STATIC VARIABLE:
------------------------------------------------------
public class MyClass {
    static int myStaticVariable = 100;
}
------------------------------------------------------

To access static variables:

------------------------------------------------------
int num = MyClass.myStaticVariable;
------------------------------------------------------

EXAMPLE OF STATIC VARIABLE:
------------------------------------------------------
public class StaticVarExample {
   public static String myClassVar = "class or static variable";

   public static void main(String args[]) {
      StaticVarExample obj = new StaticVarExample();
      StaticVarExample obj2 = new StaticVarExample();
      StaticVarExample obj3 = new StaticVarExample();

      System.out.println(obj.myClassVar);
      System.out.println(obj2.myClassVar);
      System.out.println(obj3.myClassVar);

      obj2.myClassVar = "Changed Text";

      System.out.println(obj.myClassVar);
      System.out.println(obj2.myClassVar);
      System.out.println(obj3.myClassVar);
   }
}
------------------------------------------------------

OUTPUT:
------------------------------------------------------
class or static variable
class or static variable
class or static variable
Changed Text
Changed Text
Changed Text
------------------------------------------------------

--------------------------------------
2. INSTANCE (OR GLOBAL) VARIABLES
--------------------------------------

Instance variables belong to a specific instance (object) of a class. They are declared at the class level but outside any method or block.

Each object has its own copy of the instance variable.

EXAMPLE OF INSTANCE VARIABLE:
------------------------------------------------------
public class InstanceVarExample {
   String myInstanceVar = "instance variable";

   public static void main(String args[]) {
      InstanceVarExample obj = new InstanceVarExample();
      InstanceVarExample obj2 = new InstanceVarExample();
      InstanceVarExample obj3 = new InstanceVarExample();

      System.out.println(obj.myInstanceVar);
      System.out.println(obj2.myInstanceVar);
      System.out.println(obj3.myInstanceVar);

      obj2.myInstanceVar = "Changed Text";

      System.out.println(obj.myInstanceVar);
      System.out.println(obj2.myInstanceVar);
      System.out.println(obj3.myInstanceVar);
   }
}
------------------------------------------------------

OUTPUT:
------------------------------------------------------
instance variable
instance variable
instance variable
instance variable
Changed Text
instance variable
------------------------------------------------------

--------------------------------------
3. LOCAL VARIABLES
--------------------------------------

Local variables are declared inside methods or blocks and are only accessible within that method or block.
Their scope is limited to the block in which they are declared.

EXAMPLE OF LOCAL VARIABLE:
------------------------------------------------------
public class VariableExample {
   public String myVar = "instance variable";

   public void myMethod() {
     String myVar = "Inside Method"; // local variable
     System.out.println(myVar);
   }

   public static void main(String args[]) {
      VariableExample obj = new VariableExample();
      obj.myMethod();
      System.out.println(obj.myVar);
   }
}
------------------------------------------------------

OUTPUT:
------------------------------------------------------
Inside Method
instance variable
------------------------------------------------------

--------------------------------------
DIFFERENCE BETWEEN GLOBAL AND LOCAL VARIABLES
--------------------------------------

| **Aspect**           | **Global Variable**                              | **Local Variable**                       |
|----------------------|--------------------------------------------------|------------------------------------------|
| **Scope**            | Accessible throughout the class.                 | Accessible only within the method/block |
| **Lifetime**         | Exists as long as the object exists.             | Created when method/block is called, destroyed when it finishes |
| **Access**           | Can be accessed by all methods in the class.     | Can only be accessed within the method/block |
| **Initialization**   | Initialized with default values (0 for numeric types, false for booleans, and null for objects). | Must be initialized before use.        |

--------------------------------------
JAVA VARIABLE NAMING CONVENTIONS
--------------------------------------

1. **Avoid spaces**: Variable names cannot contain spaces. 
   - Invalid: int num ber = 100;
   - Valid: int number = 100;
   
2. **No special characters**: Variables should not include special characters like `@`, `#`, `&`, etc.
   - Valid: int myNumber;
   - Invalid: int my@Number;

3. **CamelCase for multi-word variables**: Use lowerCamelCase for variable names.
   - Example: int myAge;

4. **Constants**: Constants should be written in uppercase with underscores separating words.
   - Example: MAX_VALUE, PI.

5. **Case sensitivity**: Java is case-sensitive, so myNum and mynum are considered different variables.

6. **Avoid reserved keywords**: Don't use Java keywords like int, class, public, etc., as variable names.

--------------------------------------
DEFAULT VALUES FOR JAVA VARIABLES
--------------------------------------

Variables are automatically assigned default values depending on their data type. Here's a table for reference:

------------------------------------------------------
| **Data Type**  | **Default Value** |
|----------------|-------------------|
| byte           | 0                 |
| short          | 0                 |
| int            | 0                 |
| long           | 0L                |
| float          | 0.0f              |
| double         | 0.0d              |
| char           | 'u0000'           |
| boolean        | false             |
| object         | null              |
------------------------------------------------------

EXAMPLE OF DEFAULT VALUES:
------------------------------------------------------
int num;
System.out.println(num);  // prints 0
------------------------------------------------------

--------------------------------------
CONCLUSION
--------------------------------------

Java variables are essential building blocks of any program. By understanding their declaration, types, and rules, you can write clean and efficient code. Make sure to follow best practices in naming and initializing variables to avoid errors and ensure maintainable code.
