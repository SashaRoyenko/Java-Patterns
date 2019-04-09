package com.grant.states;

import com.grant.Grant;

public class Delay implements State {
    public String order(Grant grant) {
        return grant.getGruntName() + " is delayed";
    }
}
