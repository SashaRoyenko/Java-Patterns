package com.fantasy.strategy;

import com.fantasy.model.Fly;
import com.fantasy.model.RunAndFly;

public class Hero {
    private Move move;
    private String name;
    private boolean magic;

    public Hero(Move move, String name, boolean magic) {
        this.move = move;
        this.name = name;
        this.magic = magic;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "move=" + move +
                ", name='" + name + '\'' +
                ", magic=" + magic +
                '}';
    }

    public boolean isMagic() {
        return magic;
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
        if(magic){
            move = new Fly();
        }
    }

}
