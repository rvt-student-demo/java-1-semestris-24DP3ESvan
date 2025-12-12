package rvt;
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like convert into seconds: ");
        int number = Integer.valueOf(scanner.nextLine());
        int Day = number * 60 * 60 * 24;
        System.out.println("You converted " + number + " days into " + Day + " seconds");
    }
}// Part 1-6
