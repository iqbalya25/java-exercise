package com.adepuu.exercises.session10;

public class Book {
    private String title;
    private String author;
    private int stock;

    public Book(String title, String author, int stock){
        this.title = title;
        this.author = author;
        this.stock = stock;
    }
    public void reduceStock() {
        if (stock > 0) {
            stock--;
        } else {
            System.out.println("Error: No stock available for " + title);
        }
    }

    public void returnStock() {
        if (stock < 10) {
            stock++;
        } else {
            System.out.println("Library Full " + title);
        }
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getStock(){
        return stock;
    }
}
