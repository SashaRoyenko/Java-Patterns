package com.grant;

import com.grant.states.Created;
import com.grant.states.State;

public class Main {
    public static void main(String[] args) {
        Grant grant = new Grant("KPI stone grunt", new Created());
        System.out.println(grant.getGruntState());
        System.out.println(grant.getGruntState());
        System.out.println(grant.getGruntState());
        System.out.println(grant.getGruntState());
    }
}
