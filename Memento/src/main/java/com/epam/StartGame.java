package com.epam;

import com.epam.check.Check;
import com.epam.field.Field;
import com.epam.gameMods.BotVsHuman;
import com.epam.gameMods.HumanVsBot;
import com.epam.gameMods.HumanVsHuman;

import java.util.Scanner;

public class StartGame {
    private static Field field = new Field();
    private static Scanner scanner = new Scanner(System.in);

    private static void showRules() {
        System.out.println("To start game enter start and two game modes, to quit enter exit");
        System.out.println("Game modes : user easy \n");
    }

    private static void startMenu() {
        String command;
        String firstPlayer;
        String secondPlayer;
        do {
            System.out.print("Input command: ");
            command = scanner.next();
            if (command.equals("start")) {
                firstPlayer = scanner.next();
                secondPlayer = scanner.next();
                if (Check.checkMenuInput(firstPlayer) && Check.checkMenuInput(secondPlayer)) {
                    startGame(firstPlayer, secondPlayer);
                } else {
                    System.out.println("Bad parameters");
                }
            } else if (!command.equals("exit")) {
                System.out.println("Bad parameters");
                scanner.nextLine();
            }
        } while (!command.equals("exit"));
    }

    private static void startGame(String firstMode, String secondMode) {
        field.clearField();
        if (firstMode.equals("user") && secondMode.equals("user")) {
            HumanVsHuman.start(field);
        } else if (firstMode.equals("user")) {
        HumanVsBot.start(field, secondMode);
        } else if (secondMode.equals("user")) {
        BotVsHuman.start(field, firstMode);
        }
    }

    public static void start(){
        showRules();
        startMenu();
    }
}
