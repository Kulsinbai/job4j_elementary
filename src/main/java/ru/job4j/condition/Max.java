package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int center) {
        return max(max(left, right), center);
    }

    public static int max(int left, int right, int center, int fourth) {
        return max(max(left, right, center), fourth);
    }
}