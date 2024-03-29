package ru.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double pp = (a + b + c) / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double result1 = TrgArea.area(a, b, c);
        System.out.println("Area = " + result1);
    }
}
