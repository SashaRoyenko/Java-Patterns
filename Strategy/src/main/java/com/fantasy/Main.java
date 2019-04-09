package com.fantasy;

import com.fantasy.model.Fly;
import com.fantasy.model.Run;
import com.fantasy.strategy.Hero;

public class Main {
    public static void main(String[] args) {
        Hero firstHero = new Hero(new Run(), "Ork", false);
        Hero secondHero = new Hero(new Fly(),"Pegas", false);
        Hero thirdHero = new Hero(new Run(), "Elf", false);
        System.out.println(firstHero);
        System.out.println(secondHero);
        System.out.println(thirdHero);
        thirdHero.setMagic(true);
        System.out.println(thirdHero);
    }
}
