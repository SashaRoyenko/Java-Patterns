package com.grant.states;

import com.grant.Grant;

public class Recalled implements State{
    public String order(Grant grant) {
        return grant.getGruntName() + " is recalled";
    }
}
