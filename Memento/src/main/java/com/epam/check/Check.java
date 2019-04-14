package com.epam.check;

public class Check {
    public static boolean checkDiagonal(char[][] board, char symb, int fieldSize) {
        boolean flag = true;
        for (int i = 0; i < fieldSize; i++) {
            if (board[i][i] != symb) {
                flag = false;
            }
        }
        if (flag) {
            return true;
        }
        flag = true;
        for (int i = 0; i < fieldSize; i++) {
            if (board[i][fieldSize - i - 1] != symb) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkLine(char[][] board, char symb, int fieldSize) {
        boolean horizontalFlag;
        boolean verticalFlag;
        for (int i = 0; i < fieldSize; i++) {
            horizontalFlag = true;
            verticalFlag = true;
            for (int j = 0; j < fieldSize; j++) {
                horizontalFlag &= board[i][j] == symb;
                verticalFlag &= board[j][i] == symb;
            }
            if (horizontalFlag || verticalFlag) return true;
        }
        return false;
    }

    public static boolean checkDraw(char[][] board, int fieldSize) {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean isWin(char[][] field, int fieldSize) {
        if (checkLine(field, 'X', fieldSize) || checkDiagonal(field, 'X', fieldSize)) {
            System.out.println("X wins");
            return true;
        } else if (checkLine(field, 'O', fieldSize) || checkDiagonal(field, 'O', fieldSize)) {
            System.out.println("O wins");
            return true;
        } else if (checkDraw(field, fieldSize)) {
            System.out.println("Draw");
            return true;
        }
        System.out.println();
        return false;
    }

    public static boolean checkField(char[][] field, int x, int y, int fieldSize) {
        if (x < 0 || x >= fieldSize || y < 0 || y >= fieldSize) {
            System.out.println("Coordinates should be from 1 to " + fieldSize + "!");
            return false;
        } else if (field[x][y] != ' ') {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
        return true;
    }

    public static boolean checkMenuInput(String str) {
        switch (str) {
            case "user":
                return true;
            case "easy":
                return true;
            case "medium":
                return true;
            case "hard":
                return true;
            default:
                return false;
        }
    }
}
