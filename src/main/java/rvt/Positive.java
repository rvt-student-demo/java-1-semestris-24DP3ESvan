package rvt;

import java.util.Scanner;

public class Positive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Number: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        }
    }
}