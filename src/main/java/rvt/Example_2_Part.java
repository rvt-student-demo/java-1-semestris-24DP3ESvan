package rvt;
import java.util.Scanner;

public class Example_2_Part {
    public static void main(String[] args) {
        //======================================
        System.out.println("Hello, world! \n ...and the universe!"); // Print text
        //======================================
        Scanner scanner_new = new Scanner(System.in); // Creating a Scanner
        System.out.println("Write your name: "); // Input
        String name = scanner_new.nextLine();  // Scanner for Input
        System.out.println("Your name: " + name); // Output: Text + Input
        //======================================
        String hello = "Hello, Eric, "; // String 1
        String universe = "and the universe!"; // String 2
        System.out.println(hello + universe); // Output: String 1 + String 2
        //======================================
        int number = 12;  // Whole Number
        double number_float = 3.14; // Floating Number
        boolean truth = true; // True / False
        System.out.println("Number: " + number); // Output: Text + Whole Number
        System.out.println("Number of Pi: " + number_float); // Output: Text + Floating Number
        System.out.println("Is it true?: " + truth); // Output: Text + Boolean (True / False)
        //======================================
        int value_string = 123;
        System.out.println("The value of the variable is " + value_string); // Value is 123
        value_string = 42; // Changing "value_string" value to 42
        System.out.println("The value of the variable is " + value_string); // Value is 42
        //======================================
        double pi = 3.14; // Number 1
        double radius = 22.0; // Number 2
        double surface = pi * radius * radius; // Value = Number 1 * (Number 2 * 2)
        System.out.println(surface); // Output: Final Value
        //======================================
        int calculation = (1 + 1) + 3 * (2 + 5); // Value of 1 + 1 + 3 * (2 + 5)
        System.out.println(calculation); // Output: Final Value
        //======================================
        System.out.println("Write a value "); // Input String
        int value_int = Integer.valueOf(scanner_new.nextLine()); // Convert String into Whole Number (Int) using Scanner
        System.out.println("You wrote " + value_int); // Output: Final Value 
        //======================================
        System.out.println("Write a boolean "); // Input String
        boolean value_boolean = Boolean.valueOf(scanner_new.nextLine()); // Convert String into Boolean (True / False) using Scanner
        System.out.println("You wrote " + value_boolean); // Output: Final Value 
        //======================================
        int number_if = 11; // Whole Number
        if (number_if > 10) { // If Whole Number larger than 10, then output = text below
            System.out.println("The number was greater than 10"); // Output: Result
        } // End of If
        //======================================
        int number_if_if = 55; // Whole Number
        if (number_if_if != 0) { // If Whole Number wasn't equal to 0, then output = text below
            System.out.println("The number is not equal to 0"); // Output: Final Value 
        }
        if (number_if_if >= 1000) { // If Whole Number larger or equal than 1000, then output = text below
            System.out.println("The number is at least 1000"); // Output: Final Value 
        } // End of If
        //======================================
        int number_else = 4; // Whole Number
        if (number_else > 5) { // If Whole Number larger than 5, then output = text below
            System.out.println("Your number is greater than five!"); // Output: Text
        } else { // Else, output = text below
            System.out.println("Your number is five or less!"); // Output: Text
        } // End of If
        //======================================
    }
}
