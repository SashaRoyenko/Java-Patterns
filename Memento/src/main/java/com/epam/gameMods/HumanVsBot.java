package com.epam.gameMods;

import com.epam.check.Check;
import com.epam.field.Field;
import com.epam.field.SaveField;
import com.epam.players.HumanPlayer;
import com.epam.players.bot.EasyLevel;

import java.util.Scanner;

public class HumanVsBot {
   public static void start(Field field, String mode) {
       Scanner scanner = new Scanner(System.in);
       SaveField save = new SaveField();
        if ("easy".equals(mode)) {
            do {
                field.showField();
                save = field.save();
                HumanPlayer.humanMove(field.getField(), field.getFieldSize(), 'X');
                System.out.println("Cancel move?");
                if(scanner.nextBoolean()){
                    field.cancelLastMove(save);
                    continue;
                }
                if (Check.isWin(field.getField(), field.getFieldSize())) {
                    break;
                }
                field.showField();
                EasyLevel.start(field, 'O');
            } while (!Check.isWin(field.getField(), field.getFieldSize()));
        }

    }
}
