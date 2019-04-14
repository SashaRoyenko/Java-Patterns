package com.epam.field;

public class SaveField {
    private char[][] savedField;

    public char[][] getSavedField() {
        return savedField;
    }

    public SaveField(char[][] savedField) {
        this.savedField = savedField;
    }

    public SaveField() {
    }

    public void saveField(char[][] field) {

        this.savedField = field;
    }
}
