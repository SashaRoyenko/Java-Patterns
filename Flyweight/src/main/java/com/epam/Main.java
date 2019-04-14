package com.epam;

import com.epam.bacterias.Bacteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BacteriaFactory bacteriaFactory = new BacteriaFactory();
        List<Bacteria> bacteriaList = new ArrayList<Bacteria>();

        bacteriaList.add(bacteriaFactory.getBacteria(BacteriaType.Acidobacteria));
        bacteriaList.add(bacteriaFactory.getBacteria(BacteriaType.Aquificae));
        bacteriaList.add(bacteriaFactory.getBacteria(BacteriaType.Chlorobi));
        bacteriaList.add(bacteriaFactory.getBacteria(BacteriaType.Aquificae));
        bacteriaList.add(bacteriaFactory.getBacteria(BacteriaType.Acidobacteria));
        Random random = new Random();
        for(Bacteria bacteria : bacteriaList){
            bacteria.timeOfLive(random.nextInt(30));
        }

    }
}
