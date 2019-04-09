package com.grant.states;

import com.grant.Grant;

import java.util.Random;

public class Delay implements State {
    public String order(Grant grant) {
        if (new Random().nextInt(5) == 3) {
            grant.setGruntState(new Confirmed());
        } else {
            grant.setGruntState(new Recalled());
        }
        return grant.getGruntName() + " is delayed";
    }
}
