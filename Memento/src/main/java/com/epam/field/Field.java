package com.epam.field;

public class Field {
    private final int fieldSize = 3;

    private char[][] field;

    public Field() {
        field = new char[fieldSize][fieldSize];
    }

    public void setField(char[][] field) {
        this.field = field;
    }

    public char[][] getField() {
        return field;
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void showField() {
        System.out.println("---------");
        for (int i = 0; i < fieldSize; i++) {
            System.out.print("| ");
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public SaveField save() {
        char[][] saveField = new char[fieldSize][fieldSize];
        for(int i = 0; i < fieldSize; i++){
            for(int j = 0; j < fieldSize; j++){
                saveField[i][j] = field[i][j];
            }
        }
        return new SaveField(saveField);

    }

    public void clearField() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = ' ';
            }
        }
    }

    public void cancelLastMove(SaveField saveField){

        field = saveField.getSavedField();
    }
}
