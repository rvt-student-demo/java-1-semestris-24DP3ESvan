package rvt;

public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void increaseValue(int number) {
        this.value = this.value + number;
    }

    public void decreaseValue(int number) {
        this.value = this.value - number;
    }

    public int value() {
        return value;
    }

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.increase();
        counter.increaseValue(3);
        counter.decreaseValue(2);
        counter.decrease();
        System.out.println("Value now: " + counter.value());
    }
}
// Part 5-2