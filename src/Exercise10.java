/*
Handling Exceptions in Java: Advanced Exercise: Try-Catch, Throw, and Throws in Action
Write a Java program that validates a user's age for access and throws a custom exception if the age is invalid.

Create a custom exception class named InvalidAgeException that:

Extends Exception

Has a constructor that accepts a message and passes it to super(message)

Create a method named checkAge(int age) that:

Throws InvalidAgeException if the age is less than 18

Otherwise, prints "Access granted"

In the main() method:

Call checkAge(16) and checkAge(21)

Use separate try-catch blocks for each call

If an exception is caught, print:

Exception caught: <message>

Instructions:

Use throw to raise an exception when the age is invalid.

Use throws in the method signature to declare the exception.

Catch the exception in main() and print the error message using e.getMessage().

Print "Access granted" only if no exception is thrown.

Expected Output:

  Exception caught:  Age must be 18 or older

  Access granted
 */

public class Exercise10 {
    public static void main(String[] args) {

        Exercise10 obj = new Exercise10();
        try {
            obj.checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            obj.checkAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }

    public static void checkAge(int age) throws InvalidAgeException {
        // TODO: Throw custom exception if age < 18, else print "Access granted"
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }else {
            System.out.println("Access granted");
        }

    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
