package com.adepuu.exercises.session10;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook (new Book("Book1","AB",2));
        library.addBook (new Book("Book2","CD",1));
        library.addBook (new Book("Book3","EF",5));

        library.addMember (new Member("Jerry"));
        library.addMember (new Member("Sisca"));

        library.displayInfo();

        Member member = library.getMemberByName("Sisca");
        Book book1 = library.getBookByTitle("Book1");
        Book book2 = library.getBookByTitle("Book2");

        library.returnBook(member, book2);

        library.borrowBook(member, book1);

        library.returnBook(member, book1);
        library.returnBook(member, book1);

        library.displayInfo();



    }


}
