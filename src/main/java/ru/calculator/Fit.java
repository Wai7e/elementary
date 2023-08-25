package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) *  1.15;
    }

    public static double womanWeight(short height) {
        return (height - 100) *  1.15;
    }

    public static void main(String[] args) {
        short manHeight = 177;
        short womanHeight = 163;
        double weight1 = manWeight(manHeight);
        double weight2 = womanWeight(womanHeight);
        System.out.println("Perfect" + manHeight + " man weight is " + weight1);
        System.out.println("Perfect" + womanHeight + " woman weight is " + weight2);

    }
}
