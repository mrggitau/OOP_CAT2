# ENCAPSULATION
Encapsulation restricts direct access to an object's data thus ensuring data integrity and security.

## code structure

1. Student Class

it has two Private attributes: name and grade.

### methods 

getName(): Returns the student's name.

getGrade(): Returns the student's grade.

setGrade(int grade): Validates and sets the grade thuse insuring it is within 0 to 100 or not. If it is not within the threshold it returns zero

2. MAIN Method 
i used this to create objects and put the getters to use by retrieving information


# METHOD OVERLOADING
Method Overloading allows multiple methods in the same class to have the same name but different parameters

## Code Structure

1. MathOperations Class

First multiply method: Takes two integers and returns their product.
Second multiply method: Takes three integers and returns their product.

main Method (Inside MathOperations Class)
MathOperations Class then gets instantiated ( MathOperations mathOperations = new MathOperations();)

Both methods are then called to demonstrate overloading


# METHOD OVERRIDING 
This is when a subclass provides its own method implementation that is already defined in its superclass.

### Polymorphism 
this allows objects of different classes to be treated as objects of a common superclass.

## code structure 
1. The Animal class
 method : makeSound() that outputs a respective generic message.

2. The Dog and Cat subclasses
these override the makeSound() method to print specific messages instead of the generic message stated above.

In the main() method, we create instances of Dog and Cat,thus showcasing polymorphism.


# ABSTRACTION
Abstraction is the concept of hiding the implementation details and exposing only the necessary parts of an object. It also only works on abstract classes with abstract methods

## code structure
1. abstract class Appliance
this provides an abstract method turnOn().
since the in main() method, objects of type Fan and TV are created using Appliance, and their turnOn() methods are called.
The subclasses Fan and TV which extend Appliance implement the turnOn() method, thus demonstrating abstraction.

### Method Implementation note
Subclasses Fan and TV provide specific implementations of the abstract turnOn() method. Each has its own message to output


# EXCEPTION HANDLING
This is the process of responding to runtime errors, known as exceptions, in a controlled way.

## code structure
1. CrazyCalculator class
The user inputs two numbers and the operation is to divide the first by the second.
in an event where the second number is zero the program detects the ArithmeticException and displays the error message. A finally block is then used to ensure the scanner resource is closed. If the secind number is not zero the operation proceeds normally 

### ArithmeticException
This exception occurs when an illegal arithmetic operation is performed, in this case, dividing by zero.

### Scanner Resource Management
The program ensures that the Scanner object is closed in the finally block to release resources after use.


