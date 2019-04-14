package com.epam.gameMods;

import com.epam.check.Check;
import com.epam.field.Field;
import com.epam.field.SaveField;
import com.epam.players.HumanPlayer;
import com.epam.players.bot.EasyLevel;

import java.util.Scanner;

public class BotVsHuman {
    public static void start(Field field, String mode) {
        Scanner scanner = new Scanner(System.in);
        SaveField save = new SaveField();
        if ("easy".equals(mode)) {
            do {
                field.showField();
                EasyLevel.start(field, 'X');
                save.saveField(field.getField());
                if (Check.isWin(field.getField(), field.getFieldSize())) {
                    break;
                }
                field.showField();
                HumanPlayer.humanMove(field.getField(), field.getFieldSize(), 'O');
                System.out.println("Cancel move?");
                if(scanner.nextBoolean()){
                    field.setField(save.getSavedField());
                    continue;
                }
                save.saveField(field.getField());
            } while (!Check.isWin(field.getField(), field.getFieldSize()));
        }

    }
}
