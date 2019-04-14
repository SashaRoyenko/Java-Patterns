package com.epam;

public class ConvertMoney extends Operation{
    private final double COEFFICIENT = 26.9;
    void makeOperation(Payment payment) {
        double dollars = payment.getTotal() / 26.9;
        System.out.println(payment.getTotal() + " in dollars: " + dollars);
        if(next != null) {
            next.makeOperation(new Payment(dollars));
        }
    }
}
