package rvt;

import java.util.Scanner;

public class FromFirstToLast {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First Number: ");
        int number_first = Integer.valueOf(reader.nextLine());
        System.out.println("Last Number: ");
        int number_last = Integer.valueOf(reader.nextLine());
        int number = 0 + number_first;
        while (true) {
            if (number_last > number_first) {
                number = number + number_last;
                number_last = number_last - 1;
            } else {
                break;
            }
        }
        System.out.println("Total Sum: " + number);
    }
}
