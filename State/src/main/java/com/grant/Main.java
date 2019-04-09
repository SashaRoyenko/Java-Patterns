package com.grant;

import com.grant.states.Created;

public class Main {
    public static void main(String[] args) {
        Grant grant = new Grant("KPI stone grunt", new Created());
        for(int i = 0; i < 4; i++) {
            System.out.println(grant.getGruntState());
            grant.nextState();
        }
    }
}
