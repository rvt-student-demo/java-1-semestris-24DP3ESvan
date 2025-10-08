package rvt;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number_count = 0;
        int number_start = 0;
        while (true) {
            System.out.println("Insert number: ");
            int number = Integer.valueOf(reader.nextLine());
            if (number != 0) {
                number_count = number_count + 1;
                number_start = number_start + number;
            } else if (number == 0) {
                break;
            }

        }
        System.out.println("Count of numbers: " + number_count);
        System.out.println("Total Sum: " + number_start);
    }
}
