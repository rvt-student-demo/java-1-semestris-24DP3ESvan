package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Uzdevumi {

    public static void main(String[] args) {
        OnTheList();
    }
    //======================================
    public static void OnlyTheseNumbers() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> Uzd1 = new ArrayList<>();
        int Num = 0;
        while (true) {
            if (Num == -1) {
                break;
            }
            System.out.println("Input number");
            Num = Integer.valueOf(reader.nextLine());
            Uzd1.add(Num);
        }
        System.out.println("");
        for (int i = 0; i < Uzd1.size(); i++) {
            int Out1 = Uzd1.get(i);
            System.out.println(Out1);
        }
        System.out.println("");
    }
    //======================================
    public static void ListSize() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> Uzd2 = new ArrayList<>();
        while (true) {
            String Input = reader.nextLine();
            if (Input.isEmpty()) {
                break;
            }
            Uzd2.add(Input);
        }
        for (int i = 0; i < Uzd2.size(); i++) {
            String Out2 = Uzd2.get(i);
            System.out.println(Out2);
        }
        System.out.println("");
        System.out.println("In total: " + Uzd2.size());
        System.out.println("");
    }
    //======================================
    public static void OnTheList() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> Uzd3 = new ArrayList<>();
        while (true) {
            String Input = reader.nextLine();
            if (Input.isEmpty()) {
                break;
            }
            Uzd3.add(Input);
        }
        for (int i = 0; i < Uzd3.size(); i++) {
            String Out3 = Uzd3.get(i);
            System.out.println(Out3);
        }
        System.out.println("Search for?");
        String Search = reader.nextLine();
        if (Uzd3.contains(Search)) {
            System.out.println(Search + " is found");
        } else {
            System.out.println(Search + " is not found");
        }
        System.out.println("");
    }
    //======================================
    public static void RemoveLast() {
        ArrayList<String> Uzd4 = new ArrayList<>();
        Uzd4.add("First");
        Uzd4.add("Second");
        Uzd4.add("Third");
        System.out.println(Uzd4);
        Uzd4.remove(0);
        System.out.println(Uzd4);
        System.out.println("");
    }
    //======================================
}
