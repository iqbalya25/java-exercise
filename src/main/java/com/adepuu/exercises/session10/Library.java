package com.adepuu.exercises.session10;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void addMember(Member member) {
        members.add(member);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public List<Book> getBooks() {
        return books;
    }
    public List<Member> getMembers() {
        return members;
    }

    public void displayInfo() {
        System.out.println("This is Main Library");
        for (Book book : getBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Stock: " + book.getStock());
        }

        for (Member member : getMembers()) {
            System.out.println("Member Name: " + member.getName());
        }
    }

    public void borrowBook(Member member, Book book){
        if (members.contains(member) && books.contains(book)) {
            if (book.getStock() > 0) {
                book.reduceStock();
                System.out.println(member.getName() + " has borrowed " + book.getTitle());
            } else {
                System.out.println("Book Out of stock");}
        } else {
            System.out.println("Member not found");
        }

    }

    public void returnBook(Member member, Book book) {
        if (members.contains(member) && books.contains(book)) {
            if (book.getStock() < 10) {
                book.returnStock();
                System.out.println(member.getName() + " has returned " + book.getTitle());
            } else {
                System.out.println("Library Full");
            }
        } else {
            System.out.println("Member not found");
        }
    }


    public Member getMemberByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
