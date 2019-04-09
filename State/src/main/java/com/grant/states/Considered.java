package com.grant.states;

import com.grant.Grant;

public class Considered implements State{

    public String order(Grant grant) {
        grant.setGruntState(new Delay());
        return grant.getGruntName() + " is being considered";
    }
}
