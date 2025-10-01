package rvt;

import java.util.Scanner;

public class Example_2_Part {
    public static void main(String[] main) {
        //======================================
        // Creating the Scanner
        Scanner reader = new Scanner(System.in);
        // Declaring the variables and assigning user input to them
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());
        // Identifying the operation and declaring a variable for the result
        int product = first * second;
        // Printing the result of the operation
        System.out.println("The product of " + first + " and " + second + " is " + product); // Output: Final Value
        //======================================
        int number = 12;
        if (number > 10) { // If number is not larger than 10
            System.out.print("Hello "); // Output: Final Value
        } else if (number < 20) { // If number is not larger than 20 and not larger than 10
            System.out.print("world"); // Output: Final Value
        } else { // If number is not larger than 20
            System.out.print("!"); // Output: Final Value
        }
        //======================================
        int numbersRead = 0;
        int sum = 0;
        while (true) { // While equation:
            if (numbersRead == 5) { // If Number equal to 5:
                break; // Break (End) while cycle
            }
            System.out.println("Input number"); // User inputed number
            sum = sum + Integer.valueOf(reader.nextLine()); // Adds inputed by user number every cycle, stops when cycle while ends
            numbersRead = numbersRead + 1; // Adds +1 to number, if its equal to 5, cycle while stops
        }
        System.out.println("The sum of the numbers is " + sum); // Output: After while ends; Final Value
        //======================================
    }
}
