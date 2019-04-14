package com.epam;

public class GiveMoney extends Operation{
    void makeOperation(Payment payment) {
        System.out.println("You receive: " + payment.getTotal());
    }
}
