package rvt;

import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;
    private double average;
    Scanner reader = new Scanner(System.in);

    public Statistics() {
        this.count = 0;
    }

    public void AddNumber(int number) {
        this.sum += number;
        this.count++;
        this.average = sum / count;
    }

    public int GetCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.average;
    }
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.AddNumber(4);
        statistics.AddNumber(5);
        statistics.AddNumber(1);
        statistics.AddNumber(2);
        System.out.println("Count: " + statistics.GetCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}

// Part 4-1