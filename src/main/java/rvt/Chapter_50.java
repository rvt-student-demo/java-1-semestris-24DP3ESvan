package rvt;

public class Chapter_50 {
    private final double width;
    private final double height;
    private final double length;

    public Chapter_50(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Chapter_50(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Chapter_50(Chapter_50 oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double width() { return width; }
    public double height() { return height; }
    public double length() { return length; }

    // Volume and area
    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public Chapter_50 biggerBox(Chapter_50 oldBox) {
        return new Chapter_50(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
    }

    public Chapter_50 smallerBox(Chapter_50 oldBox) {
        return new Chapter_50(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.length());
    }

    public boolean nests(Chapter_50 outsideBox) {
        return this.width <= outsideBox.width()
                && this.height <= outsideBox.height()
                && this.length <= outsideBox.length();
    }

    private double faceArea() { return width * height; }
    private double topArea() { return width * length; }
    private double sideArea() { return height * length; }
}
