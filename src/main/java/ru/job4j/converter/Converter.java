package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inputEuro = 140;
        float expectedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        float inputDollar = 120;
        float expectedDollar = 2;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
    }
}