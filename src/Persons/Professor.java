package Persons;

public class Professor extends Person {
    int membercard;
    String name;
    int credit = 6;

    public Professor(String name, int membercard) {
        super(name);
        this.membercard = membercard;
    }

}
