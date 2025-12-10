package rvt;

import javax.swing.Box;

public class Chapter_50_Box {
    public static void main(String[] args) {
        // Exercise 1, 2, 3
        Chapter_50 box = new Chapter_50(2.5, 5.0, 6.0);
        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        System.out.println("Width: " + box.width() + ", Height: " + box.height() + ", Length: " + box.length());
        // Exercise 4 — Bigger / Smaller Boxes
        Chapter_50 bigger = Chapter_50.Box.biggerBox(box);
        Chapter_50 smaller = Chapter_50.Box.smallerBox(box);
        System.out.println("Bigger box dimensions: " + bigger.width() + " x " + bigger.height() + " x " + bigger.length());
        System.out.println("Smaller box dimensions: " + smaller.width() + " x " + smaller.height() + " x " + smaller.length());
        // Exercise 5 — Nesting
        System.out.println("Box fits in bigger box: " + box.nests(bigger)); 
        System.out.println("Bigger box fits in box: " + bigger.nests(box)); 
    }
}
