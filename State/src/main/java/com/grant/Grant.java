package com.grant;

import com.grant.states.*;
import com.sun.org.apache.regexp.internal.RE;

import java.util.Random;

public class Grant {
    private String gruntName;
    private State gruntState;

    public Grant(String gruntName, State gruntState) {
        this.gruntName = gruntName;
        this.gruntState = gruntState;
    }

    public void setGruntState(State gruntState) {
        this.gruntState = gruntState;
    }

    public void nextState(){
        if(gruntState instanceof Confirmed || gruntState instanceof  Recalled){
            return;
        }
        if(gruntState instanceof Created){
            this.setGruntState(new Considered());
        }
        else if(gruntState instanceof Considered){
            this.setGruntState(new Delay());
        }
        else {
            if (new Random().nextInt(5) == 3) {
                this.setGruntState(new Confirmed());
            } else {
                this.setGruntState(new Recalled());
            }
        }
    }

    public String getGruntName() {
        return gruntName;
    }

    public String getGruntState() {
        return gruntState.order(this);
    }
}
