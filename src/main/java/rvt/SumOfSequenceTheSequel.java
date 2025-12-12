package rvt;

import java.util.Scanner;

public class SumOfSequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int num_first = scanner.nextInt();
        System.out.println("Last number: ");
        int num_last = scanner.nextInt();

        int sum = 0;

        for (int i = num_first; i <= num_last; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
// Part 2-3