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
        float rubles = 140f;
        float euroInRubles = Converter.rubleToEuro(rubles);
        float dollarInRubles = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " rubles are " + euroInRubles  + " euro.");
        System.out.println(rubles + " rubles are " + dollarInRubles + " dollar.");
    }
}