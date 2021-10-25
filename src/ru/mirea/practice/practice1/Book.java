package ru.mirea.practice.practice1;
import java.lang.*;
public class Book {
    private String author;
    private String name;
    private int page;

    public Book(String a, String n, int p) {
        this.author = a;
        this.name = n;
        this.page = p;
    }

    public void setBook(String a, String n, int p) {
        this.author = a;
        this.name = n;
        this.page = p;
    }

    public String toString() {
        return author + " " + name + " has " + page + " pages";
    }
}
