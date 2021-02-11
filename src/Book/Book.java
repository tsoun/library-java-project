package Book;

import java.lang.String;
import java.util.Date;
import java.util.ArrayList;
import Persons.Person;

public class Book {
    public String name;
    long ISBN;
    Date dateBought;
    String sourceBought;
    double priceBought;

    public boolean canBeBorrowed;
    Date outOfOrderSince;
    String outOfOrderCause;

    public boolean isBorrowed;
    int borrowDaysLimit;
    public int creditsPerDay;
    double pricePerOverdueDay;

    ArrayList<Person> haveReserved = new ArrayList<Person>();
    int maxSimultaneousReservations;

    public Book(String name, long ISBN, Date dateBought, String sourceBought, double priceBought) {
        this.name = name;
        this.ISBN = ISBN;
        this.dateBought = dateBought;
        this.sourceBought = sourceBought;
        this.priceBought = priceBought;
    }

    public void setAttributes(int borrowDaysLimit, int creditsPerDay, double pricePerOverdueDay,
            int maxSimultaneousReservations) {
        this.borrowDaysLimit = borrowDaysLimit;
        this.creditsPerDay = creditsPerDay;
        this.pricePerOverdueDay = pricePerOverdueDay;
        this.maxSimultaneousReservations = maxSimultaneousReservations;
    }

    public void setAvailable() {
        this.canBeBorrowed = true;
        this.outOfOrderSince = null;
        this.outOfOrderCause = null;
        this.isBorrowed = false;
    }

    public void setOutOfOrder(Date outOfOrderSince, String outOfOrderCause) {
        this.canBeBorrowed = false;
        this.outOfOrderSince = outOfOrderSince;
        this.outOfOrderCause = outOfOrderCause;
    }

    public void reserveBook(Person person) throws ArrayIndexOutOfBoundsException {
        if (this.haveReserved.size() == this.maxSimultaneousReservations)
            throw new ArrayIndexOutOfBoundsException();
        this.haveReserved.add(person);
    }
}