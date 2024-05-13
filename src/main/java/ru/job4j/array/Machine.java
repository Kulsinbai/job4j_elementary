package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int change = money - price;
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            while (change >= coin) {
                result[size++] = coin;
                change -= coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}