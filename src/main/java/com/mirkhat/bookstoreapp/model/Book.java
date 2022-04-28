package com.mirkhat.bookstoreapp.model;

public class Book {
    private String bookName;
    private String description;
    private int status;

    public Book() {}

    public Book(String bookName, String description, int status) {
        this.bookName = bookName;
        this.description = description;
        this.status = status;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
