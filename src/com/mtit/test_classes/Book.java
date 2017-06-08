package com.mtit.test_classes;

/**
 * Class representing a Book.
 */
public class Book {

    private String bookName = "Head First Design Patterns";
    public  int bookCount = 20;
    public String[] authors = {"Eric Freeman", "Elisabeth Freeman"};
    public double price;

    public Book() {
        this.bookName = "Head First Design Patterns";
        this.bookCount = 20;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public void DisplayBookDetails() {
        System.out.println("Book Name is "+ bookName);
    }
}
