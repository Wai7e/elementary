package ru.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double rs1 = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(rs1);
    }

    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 2;
        int y1 = 1;
        int y2 = 2;
        double result = distance(x1, x2, y1, y2);
        System.out.println("Distance is " + result);
    }
}
