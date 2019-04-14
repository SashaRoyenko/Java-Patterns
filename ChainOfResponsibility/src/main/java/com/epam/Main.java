package com.epam;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment(10000);
        Operation convert = new ConvertMoney();
        Operation taxes = new BankTaxes();
        Operation give = new GiveMoney();
        convert.nextOperation(taxes);
        taxes.nextOperation(give);
        convert.makeOperation(payment);

    }
}
