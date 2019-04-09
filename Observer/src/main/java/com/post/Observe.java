package com.post;

public interface Observe {
    void addBook(String bookName);
    void removeBook(String bookName);
    void addSubscriber(Observer subscriber);
    void removeSubscriber(Observer subscriber);
    void notifyObservers();
}
