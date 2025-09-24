package rvt;
import java.util.Scanner;

public class ThreeAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Number 1: ");
        int number_1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Write Number 2: ");
        int number_2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Write Number 3: ");
        int number_3 = Integer.valueOf(scanner.nextLine());
        double result = (number_1 + number_2 + number_3) * 1.0 / 3;
        System.out.println("Average is: " + result);
    }
}
