package com.epam;

public class Article implements Copyable{
    private static int ID;
    private int id;
    String title;
    String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
        ID++;
        id = ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public Object copy() {
        Article copy = new Article(title, text);
        copy.setId(id);
        return copy;
    }
}
