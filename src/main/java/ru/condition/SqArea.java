package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
        return (p / (2 * (k + 1))) * ((p / (2 * (k + 1))) * k);
    }

    public static void main(String[] args) {
        double p = 4;
        double k = 1;
        double result1 = SqArea.square(p, k);
        System.out.println("Sqware with p = 4 and k = 1 = " + result1);
        double p1 = 6;
        double k1 = 2;
        double result2 = SqArea.square(p1, k1);
        System.out.println("Sqware with p = 6 and k = 2 = " + result2);
    }

}
