package com.post;

public class Subscriber implements Observer{
    private String name;
    private String surname;

    public Subscriber(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void update(String bookName) {
        System.out.println("Dear " + name + " " + surname + " we have sent you book: " + bookName);
    }
}
