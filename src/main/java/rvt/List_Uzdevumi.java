package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Uzdevumi {

    public static void main(String[] args) {
        OnlyTheseNumbers();
        ListSize();
        OnTheList();
        RemoveLast();
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
        ArrayList<Integer> Uzd2 = new ArrayList<>();
        int Input = 0;
        while (true) {
            if (Input == -1) {
                break;
            }
            System.out.println("Input number");
            Input = Integer.valueOf(reader.nextLine());
            Uzd2.add(Input);
        }
        System.out.println("");
        for (int i = 0; i < Uzd2.size(); i++) {
            int Out2 = Uzd2.get(i);
            System.out.println(Out2);
        }
        System.out.println("In total: " + Uzd2.size());
        System.out.println("");
    }
    //======================================
    public static void OnTheList() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> Uzd3 = new ArrayList<>();
        int Search = 0;
        Uzd3.add(1);
        Uzd3.add(2);
        Uzd3.add(3);
        for (int i = 0; i < Uzd3.size(); i++) {
            int Out3 = Uzd3.get(i);
            System.out.println(Out3);
        }
        System.out.println("Search for number?");
        Search = Integer.valueOf(reader.nextLine());
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
