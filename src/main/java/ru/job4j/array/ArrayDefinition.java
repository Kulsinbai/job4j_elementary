package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Benzema";
        names[1] = "Kimmich";
        names[2] = "Van Dijk";
        names[3] = "Neuer";
        System.out.println("Лучший нападающий: " + names[0]);
        System.out.println("Лучший полузащитник: " + names[1]);
        System.out.println("Лучший защитник: " + names[2]);
        System.out.println("Лучший вратарь: " + names[3]);
    }
}
