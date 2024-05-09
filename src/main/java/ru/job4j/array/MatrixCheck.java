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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char firstChar = board[0][column];
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != firstChar) {
                result = false;
                break;
            }
        }
        return result;
    }
}