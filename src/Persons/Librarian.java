package Persons;

import Book.Book;
import Library.*;

import java.sql.Date;
import java.util.ArrayList;

public class Librarian {

    public void checkAvailability() {
        for (Book book : Library.books) {
            System.out.println("Name:\t" + book.name + "\t-\t" + (book.canBeBorrowed && !(book.isBorrowed)));
        }
    }

    public void checkLendedBooks() {
        for (Book book : Library.books) {
            System.out.println("Name:\t" + book.name + "\t-\t" + book.isBorrowed);
        }
    }

    public void listOfPrices() {
        for (Book book : Library.books) {
            System.out.println("Name:\t" + book.name + "\t-\t" + book.creditsPerDay));
        }
    }

    public void addBook(String name, long ISBN, Date dateBought, String sourceBought, double priceBought) {
        Library.books.add(new Book(name, ISBN, dateBought, sourceBought, priceBought));
    }

    public void changeStatusofBook(Book book) {
        book.canBeBorrowed = false;

    }

    public void reservedBooks() {
        for (Book bookName : Library.books) {
            System.out.println(bookName);
        }
    }

    public void historyMember(Person person) {
        // prints the history of a member
        System.out.println(person.name + "'s history: \n");
        for (Book book : person.loanedBooksHistory) {
            System.out.println(book.name);
        }
    }

    public void banMember(Person person) {
        person.banned = true;
    }
}
