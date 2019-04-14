package com.epam.players;

import com.epam.check.Check;

import java.util.Scanner;

public class HumanPlayer {
    private String name;
    private static Scanner scanner = new Scanner(System.in);

    public static void humanMove(char[][]field, int fieldSize, char symb) {
        int x;
        int y;
        do {
            System.out.print("Enter the coordinates: ");
            if (!scanner.hasNextInt() || !scanner.hasNextInt()) {
                scanner.next();
                scanner.next();
                System.out.println("You should enter numbers!");
            } else {

                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
                if (Check.checkField(field, x, y, fieldSize)) {
                    field[x][y] = symb;
                    break;
                }
            }

        } while (true);
    }
}
