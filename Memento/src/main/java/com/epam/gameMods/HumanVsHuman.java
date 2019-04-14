package com.epam.gameMods;

import com.epam.check.Check;
import com.epam.field.Field;
import com.epam.field.SaveField;
import com.epam.players.HumanPlayer;

import java.util.Scanner;

public class HumanVsHuman {
    public static void start(Field field){
        Scanner scanner = new Scanner(System.in);
        SaveField save = new SaveField();
        do {
            field.showField();
            save = field.save();
            HumanPlayer.humanMove(field.getField(), field.getFieldSize(), 'X');
            field.showField();
            System.out.println("Cancel move?");
            if(scanner.nextBoolean()){
                field.cancelLastMove(save);
                continue;
            }
            if (Check.isWin(field.getField(), field.getFieldSize())) {
                break;
            }
            save = field.save();
            HumanPlayer.humanMove(field.getField(), field.getFieldSize(), 'O');
            field.showField();
            System.out.println("Cancel move?");
            if(scanner.nextBoolean()){
                field.cancelLastMove(save);
                field.showField();
                HumanPlayer.humanMove(field.getField(), field.getFieldSize(), 'O');
            }
        } while (!Check.isWin(field.getField(), field.getFieldSize()));
    }
}
