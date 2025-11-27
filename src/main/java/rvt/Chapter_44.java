package rvt;

import java.util.Scanner;

public class Chapter_44 {

    public static void main(String[] args) {
        Exercise4();
    }
    public static void Exercise1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fullName = scanner.nextLine().trim(); // remove leading trailing spaces

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
    public static void Exercise2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String fullName = scanner.nextLine().trim(); 
        int i = 0;
        int n = fullName.length();
        int k = n;
        while(k > 0){
            if (k == 0){
                break;
            }
            System.out.println(fullName.charAt(i));
            i += 1;
            k -= 1;
        }
    }
    public static void Exercise3(){

    }
    public static void Exercise4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a time (< 1 Hour): ");
        int time = Integer.valueOf(scanner.nextLine()); 
        if (time < 600){
            String N = String.valueOf(time);
            System.out.println(N.substring(0, 1) + ":" + N.substring(1, 3));
        } else if (time < 6000){
            String N = String.valueOf(time);
            System.out.println(N.substring(0, 2) + ":" + N.substring(2, 4));
        } else {
            System.out.println("Time is more than 1 Hour, try again!");
        }
    }
    public static void Exercise5(){
    
    }
    public static void Exercise7(){
    
    }
    public static void Exercise8(){
    
    }
}