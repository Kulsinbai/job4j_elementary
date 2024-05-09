package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char firstChar = board[row][0];
        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != firstChar) {
                result = false;
                break;
            }
        }
        return result;
    }
}