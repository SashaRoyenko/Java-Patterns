package com.epam;

public class BankTaxes extends Operation {
    private static final double COMMISSION = 0.05;
    void makeOperation(Payment payment) {
        double necessary = payment.getTotal() * COMMISSION;
        System.out.println("Bank took: " + necessary);
        if(next != null){
            next.makeOperation(new Payment(payment.getTotal() - necessary));
        }
    }
}
