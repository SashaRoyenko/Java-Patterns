package com.epam.players.bot;

import com.epam.field.Field;

import java.util.Random;

public class EasyLevel {
    public static void start(Field field, char symb) {
        field.showField();
        System.out.println("Making move level \"easy\"");
        Random random = new Random();
        int indexI;
        int indexJ;
        while (true) {
            indexI = random.nextInt(3);
            indexJ = random.nextInt(3);
            if (field.getField()[indexI][indexJ] == ' ') {
                field.getField()[indexI][indexJ] = symb;
                break;
            }
        }
        field.showField();
    }
}
