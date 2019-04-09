package com.post;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        Observer first = new Subscriber("Sasha", "Royenko");
        Observer second = new Subscriber("Orest", "Shemeluk");

        postOffice.addBook("Piknik na Obochine");
        postOffice.addBook("Metro 2035");
        postOffice.addSubscriber(first);
        postOffice.addSubscriber(second);
        postOffice.addBook("Philosophy of Java");
    }
}
