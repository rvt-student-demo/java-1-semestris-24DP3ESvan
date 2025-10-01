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
        System.out.println("The product of " + first + " and " + second + " is " + product);
        //======================================
        int number = 12;
        if (number > 10) { // When its larger than 10
            System.out.print("Hello "); // Output: Final Value
        }  else if (number < 20) { // When number is lower than 20 and not larger than 10
            System.out.print("world"); // Output: Final Value
        } else { // When its larger than 20
            System.out.print("!"); // Output: Final Value
        }
        //======================================
        int numbersRead = 0;
        int sum = 0;
        while (true) { // While number is not equal to 5:
            if (numbersRead == 5) { // If number is equal than 5:
                break; // End cycle if number equal of 5 (Hits 5)
            }
            System.out.println("Input number");
            sum = sum + Integer.valueOf(reader.nextLine()); // Addimg user inputed number every cycle, until cycle ends
            numbersRead = numbersRead + 1; // Addimg every cycle +1 to number until it reaches 5
        }
        System.out.println("The sum of the numbers is " + sum); // Output: After while ends; Final Value
        //======================================
    }
}
