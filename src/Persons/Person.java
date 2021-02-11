package Persons;

import Book.Book;

import java.util.ArrayList;

public abstract class Person {

    public String name;
    private String username;
    private String password;

    public int credit;
    public boolean banned = false;

    public ArrayList<Book> loanedBooksHistory;

    public ArrayList<Book> loanedBooksList = new ArrayList<Book>();
    public int loanedBooks = loanedBooksList.size();

    public ArrayList<Book> booksUnderReservation = new ArrayList<Book>();

    public Person(String name) {
        this.name = name;
    }

    public void sendRequest(Person sender, Person receiver) {
        ;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
