package rvt;

import java.util.Scanner;

public class TextSumNumAverageOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double number_count = 0;
        double number_start = 0;
        int number_odds = 0;
        while (true) {
            System.out.println("Insert number: ");
            int number = Integer.valueOf(reader.nextLine());
            if (number % 2 == 0){
                number_odds = number_odds + 1;
            }
            if (number != -1) {
                number_count = number_count + 1;
                number_start = number_start + number;
            } else if (number == -1) {
                break;
            }
        }
        double number_average = number_start / number_count;
        System.out.println("Thanks, bye!");
        System.out.println("Total Sum: " + number_start);
        System.out.println("Count of numbers: " + number_count);
        System.out.println("Average: " + number_average);
        System.out.println("Count of odds numbers: " + number_odds);
    }
}
