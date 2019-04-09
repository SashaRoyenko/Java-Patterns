package com.post;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Observe {

    List<String> books = new ArrayList<String>();
    List<Observer> subscribers = new ArrayList<Observer>();

    public void addBook(String bookName) {
        books.add(bookName);
        notifyObservers();
    }

    public void removeBook(String bookName) {
        books.remove(bookName);
    }

    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyObservers() {
        for(Observer o : subscribers) {
            o.update(books.get(books.size() - 1));
        }
    }


}
