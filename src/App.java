import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import Persons.Person;

public class App {
    public static ArrayList<Person> allAccounts = new ArrayList<Person>();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        System.out.println("Welcome to the University of Porn Central Library!\n");

        while (run) {
            System.out.println("Press 1 to log in.");
            System.out.println("Press 2 to create a new account.");
            System.out.println("Press 3 if you forgot your credentials and you need help.");
            System.out.println("Press 4 to exit.");

            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2: {
                    System.out.println("Not programmed yet!");
                    break;
                }
                case 3: {
                    System.out.println("Not programmed yet!");
                    break;
                }
                case 4:
                    run = false;
                    break;
                default: {
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
            }
        }

        in.close();
    }

    public static Person login() {
        System.out.println("Please enter your credentials to log in.");
        System.out.print("Username: ");
        String username = in.nextLine();

        Person selectedAccount = accessAccount(username);
        if (selectedAccount == null) {
            System.out.println("User not found.");
            return null;
        }
        while (true) {
            System.out.print("Password: ");
            String password = in.nextLine();
            if (selectedAccount.getPassword().equals(password)) {
                System.out.println("Welcome " + selectedAccount.name + "!");
                return selectedAccount;
            } else {
                System.out.println("Wrong password. Please try again.");
                continue;
            }
        }
    }

    public static Person accessAccount(String username) {
        int numberOfAccounts = allAccounts.size();
        for (int i = 0; i < numberOfAccounts; i++) {
            Person currentPerson = allAccounts.get(i);
            if (currentPerson.getUsername().equals(username))
                return currentPerson;
        }
        return null;
    }
}
