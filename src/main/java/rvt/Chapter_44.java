package rvt;

import java.util.Scanner;

public class Chapter_44 {

    public static void main(String[] args) {
        Exercise8();
    }

    public static void Exercise1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fullName = scanner.nextLine().trim(); 
        int spaceIndex = fullName.indexOf(" ");
        if (spaceIndex <= 0) {
            System.out.println(fullName);
        } else {
            String firstName = fullName.substring(0, spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1);
            lastName = lastName.toUpperCase();
            System.out.println(firstName + " " + lastName);
        }
    }

    public static void Exercise2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String fullName = scanner.nextLine().trim();
        int i = 0;
        int n = fullName.length();
        int k = n;
        while (k > 0) {
            if (k == 0) {
                break;
            }
            System.out.println(fullName.charAt(i));
            i += 1;
            k -= 1;
        }
    }

    public static void Exercise3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cook time -> ");
        String input = scanner.nextLine().trim();
        String minutes;
        String seconds;
        if (input.length() <= 2) {
            minutes = "0";
            seconds = input;
        } else {
            seconds = input.substring(input.length() - 2);
            minutes = input.substring(0, input.length() - 2);
        }
        if (seconds.length() == 1) {
            seconds = "0" + seconds;
        }
        System.out.println("Your time -> " + minutes + ":" + seconds);
        scanner.close();
    }

    public static void Exercise4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a time (< 1 Hour): ");
        int time = Integer.valueOf(scanner.nextLine());
        if (time < 600) {
            String N = String.valueOf(time);
            System.out.println(N.substring(0, 1) + ":" + N.substring(1, 3));
        } else if (time < 6000) {
            String N = String.valueOf(time);
            System.out.println(N.substring(0, 2) + ":" + N.substring(2, 4));
        } else {
            System.out.println("Time is more than 1 Hour, try again!");
        }
    }

    public static void Exercise5() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.trim().startsWith("//")) {
                System.out.println(line);
            }
        }

        scanner.close();
    }

    public static void Exercise6() {
        Scanner scanner = new Scanner(System.in);

        boolean inBlockComment = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            if (inBlockComment) {
                System.out.println(line);

                if (line.startsWith("*/")) {
                    inBlockComment = false;
                }

            } else {
                if (line.startsWith("//")) {
                    System.out.println(line);
                } else if (line.startsWith("/*")) {
                    System.out.println(line);
                    inBlockComment = true;
                } else if (line.startsWith("*/")) {
                    System.out.println(line);
                }
            }
        }

        scanner.close();
    }

    public static void Exercise7() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if (password.length() >= 7) {

                if (!password.equals(password.toLowerCase())) {

                    if (!password.equals(password.toUpperCase())) {

                        boolean hasDigit = false;
                        for (int i = 0; i < password.length(); i++) {
                            if (Character.isDigit(password.charAt(i))) {
                                hasDigit = true;
                                break;
                            }
                        }

                        if (hasDigit) {
                            System.out.println("Acceptable password.");
                            break;
                        }
                    }
                }
            }

            System.out.println("That password is not acceptable.\n");
        }

        scanner.close();
    }

    public static void Exercise8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int spaces = 0;
        int length = word.length();

        while (length > 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            System.out.println(word.substring(0, length));

            spaces++;
            length -= 2;
        }

        scanner.close();
    }
}
