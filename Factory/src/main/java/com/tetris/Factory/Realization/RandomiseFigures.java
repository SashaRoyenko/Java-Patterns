package com.tetris.Factory.Realization;

import com.tetris.Factory.ComplicatedFigures.*;
import com.tetris.Factory.Figure;
import com.tetris.Factory.SimpleFigures.*;

import java.util.Random;

public class RandomiseFigures {
    private static Figure getRandomFigure() {
        Random random = new Random();
        int chance = random.nextInt(10);
        if(chance == 0){
            chance = 1 + random.nextInt(7);
            return getComplicatedFigure(chance);
        }
        else{
            chance = 1 + random.nextInt(7);
            return getSimpleFigure(chance);
        }
    }

    private static Figure getSimpleFigure(int i) {
        switch (i) {
            case 1:
                return new FigureI();
            case 2:
                return new FigureJ();
            case 3:
                return new FigureL();
            case 4:
                return new FigureO();
            case 5:
                return new FigureS();
            case 6:
                return new FigureT();
            case 7:
                return new FigureZ();
            default:
                throw new IllegalArgumentException();
        }
    }

    private static Figure getComplicatedFigure(int i) {
        switch (i) {
            case 1:
                return new ComplicatedFigureI();
            case 2:
                return new ComplicatedFigureJ();
            case 3:
                return new ComplicatedFigureL();
            case 4:
                return new ComplicatedFigureO();
            case 5:
                return new ComplicatedFigureS();
            case 6:
                return new ComplicatedFigureT();
            case 7:
                return new ComplicatedFigureZ();
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void startRandomise(int quantity) {
        Figure figure;
        for (int i = 0; i < quantity; i++) {
            figure = getRandomFigure();
            figure.show();
            System.out.println();
        }
    }
}
