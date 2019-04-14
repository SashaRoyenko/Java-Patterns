package com.epam;

import com.epam.bacterias.Acidobacteria;
import com.epam.bacterias.Aquificae;
import com.epam.bacterias.Bacteria;
import com.epam.bacterias.Chlorobi;

import java.util.HashMap;

public class BacteriaFactory {
    private final HashMap<BacteriaType, Bacteria> bacteriasMap = new HashMap<BacteriaType, Bacteria>();
    public Bacteria getBacteria(BacteriaType type){
            Bacteria bacteria = bacteriasMap.get(type);
            if(bacteria == null){
                switch (type){
                    case Acidobacteria:
                        bacteria =  new Acidobacteria();
                        break;
                    case Aquificae:
                        bacteria = new Aquificae();
                        break;
                    case Chlorobi:
                        bacteria = new Chlorobi();
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                bacteriasMap.put(type, bacteria);
            }
            return bacteria;
    }
}
