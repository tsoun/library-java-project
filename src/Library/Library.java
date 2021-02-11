package Library;

import java.util.ArrayList;

import Book.*;
import Persons.*;

public class Library {
    public static ArrayList<Book> books = new ArrayList<Book>();

    public void sendWarningEmail(Person person) {
        System.out.println("Warning. You've got to return da book.");
    }
}
