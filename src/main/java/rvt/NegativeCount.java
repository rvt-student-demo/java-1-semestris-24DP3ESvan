package rvt;

import java.util.Scanner;

public class NegativeCount {

    public static void main(String[] main) {
        Scanner reader = new Scanner(System.in);
        int negative = 0;
        while (true) { 
            System.out.println("Insert positive integers");
            int number = Integer.valueOf(reader.nextLine()); 
            if (number < 0){
                negative = negative + 1;
            } else if (number != 0) { 
                continue; 
            } else {
                break;
            }
        
        }
        System.out.println("Count of negative numbers " + negative); 
    }
}
