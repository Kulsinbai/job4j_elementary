package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {

        //Тест для метода Converter.rubleToEuro
        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        //Тест для метода Converter.rubleToDollar
        int inDollar = 140;
        int expectedDollar = 2;
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
    }
}