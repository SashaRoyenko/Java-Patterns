package com.grant.states;

import com.grant.Grant;

public class Confirmed implements State {

    public String order(Grant grant) {
        return grant.getGruntName() + " is being confirmed";
    }
}
