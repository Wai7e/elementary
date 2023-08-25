package ru.converter;

public class Converter {
    public static float rubToEur(float value) {
        return value / 100;
    }

    public static float rubToDlr(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        int i = 140;
        float r1 = rubToEur(i);
        float r2 = rubToDlr(i);
        System.out.println(i + " rub is " + r1 + " eur and " + r2 + " dlr");
    }
}
