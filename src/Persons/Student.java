package Persons;

public class Student extends Person {

    int studentPass;
    int credit = 3;

    String name;

    public Student(String name, int studentPass) {
        super(name);
        this.studentPass = studentPass;

    }

}