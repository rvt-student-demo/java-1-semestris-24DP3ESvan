package rvt;

import java.util.Arrays;

public class Example_3_Part {

    public static void main(String[] main) {
        ex1(); // Function 1 for Slice
        ex2(); // Function 2 for Slice
        ex3(); // Function 3 for Slice
        ex4(); // Function 4 for Slice
        ex5(); // Function 5 for Slice
    }
    //======================================
    public static void ex1() { // Function 1
        int[] val = {0, 1, 2, 3}; // Slice
        int summ = Arrays.stream(val).sum(); // Function of sum
        System.out.println("Sum of all number = " + summ); // Output: Final Value
    }
    //======================================
    public static void ex2() { // Function 2
        int[] val = {13, -4, 82, 17}; // Slice
        int[] twice = new int[4];
        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]); // Output: Starting Value
        twice[0] = val[0] * 2; // Multiply 1 element of slice by 2
        twice[1] = val[1] * 2; // Multiply 2 element of slice by 2
        twice[2] = val[2] * 2; // Multiply 3 element of slice by 2
        twice[3] = val[3] * 2; // Multiply 4 element of slice by 2
        System.out.println("New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]); // Output: Final Value
    }
    //======================================
    public static void ex3() { // Function 3
        int[] valA = {13, -22, 82, 17}; // Slice 1
        int[] valB = {-12, 24, -79, -13}; // Slice 2
        int[] sum = {0, 0, 0, 0}; // Slice 0
        sum[0] = valA[0] + valB[0]; // Change Value of Slice 0 1st element to Slice 1 + Slice 2 of 1 Elements
        sum[1] = valA[1] + valB[1]; // Change Value of Slice 0 2nd element to Slice 1 + Slice 2 of 2 Elements
        sum[2] = valA[2] + valB[2]; // Change Value of Slice 0 3rd element to Slice 1 + Slice 2 of 3 Elements
        sum[3] = valA[3] + valB[3]; // Change Value of Slice 0 4th element to Slice 1 + Slice 2 of 4 Elements
        System.out.println("sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]); // Output: Final Value of Slice 0
    }
    //======================================
    public static void ex4() { // Function 4
        int[] valA = {13, -22, 82, 17}; // Slice
        int[] valB = {0, 0, 0, 0}; // Slice
        valB[0] = 12; // Changing value into Slice 2
        valB[1] = 47; // Changing value into Slice 2
        valB[2] = -57; // Changing value into Slice 2
        valB[3] = 8; // Changing value into Slice 2
        System.out.println("valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]); // Output: Final Value of Slice 1
        System.out.println("valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]); // Output: Final Value of Slice 2
        System.out.println("sum: " + (valA[0] + valB[0]) + " " + (valA[1] + valB[1]) + " " + (valA[2] + valB[2]) + " " + (valA[3] + valB[3])); // Output: Final Value of Both 
    }
    //======================================
    public static void ex5() { // Function 5
        int[] val = {0, 1, 2, 3}; // Slice
        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]); // Output: Starting Value
        for (int i = 0; i < val.length / 2; i++) { // Function that reverses slice
            int temp = val[i]; // Value change
            val[i] = val[val.length - i - 1]; // Last element
            val[val.length - i - 1] = temp; // Changing last eleent to first and so on
        }
        System.out.println("Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]); // Output: Final Value
    }
    //======================================
}
