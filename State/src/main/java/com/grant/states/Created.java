package com.grant.states;

import com.grant.Grant;

public class Created implements State {
    public String order(Grant grant) {
        return grant.getGruntName() + " is created";
    }
}
