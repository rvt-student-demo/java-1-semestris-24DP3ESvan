package rvt;

public class BoxTester {
    public static void main(String[] args) {
        // Exercise 1, 2, 3
        Box box = new Box(2.5, 5.0, 6.0);
        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        System.out.println("Width: " + box.width() + ", Height: " + box.height() + ", Length: " + box.length());
        // Exercise 4 — Bigger / Smaller Boxes
        Box bigger = Box.Box.biggerBox(box);
        Box smaller = Box.Box.smallerBox(box);
        System.out.println("Bigger box dimensions: " + bigger.width() + " x " + bigger.height() + " x " + bigger.length());
        System.out.println("Smaller box dimensions: " + smaller.width() + " x " + smaller.height() + " x " + smaller.length());
        // Exercise 5 — Nesting
        System.out.println("Box fits in bigger box: " + box.nests(bigger)); 
        System.out.println("Bigger box fits in box: " + bigger.nests(box)); 
    }
}
