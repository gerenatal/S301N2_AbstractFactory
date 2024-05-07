import Contact.Address;
import Factory.AbstractFactory;
import Factory.FactoryProducer;
import Contact.Phone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        menu(notebook);
    }

    public static void menu(Notebook notebook) {
        boolean exit = false;
        while (!exit) {
            String choice = lineInput("""
                    1. Add contact
                    2. Display contacts
                    3. Exit
                    Enter your choice:""");
            switch (choice) {
                case "1":
                    addContact(notebook);
                    break;
                case "2":
                    notebook.printContacts();
                    break;
                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    static void addContact(Notebook notebook) {
        String region = lineInput("Enter region: ");
        String name = lineInput("Enter name: ");

        String addressWithoutZip = lineInput("Enter address: ");
        String uncheckedZipCode = lineInput("Enter zip code: ");
        AbstractFactory addressFactory = FactoryProducer.getFactory("Address");
        assert addressFactory != null;
        Address address = addressFactory.getAddress(region);
        String checkedAddress = address.checkZipCode(uncheckedZipCode) ? (addressWithoutZip + ", " + uncheckedZipCode) : null;

        String uncheckedPhoneNumber = lineInput("Enter phone number: ");
        AbstractFactory phoneFactory = FactoryProducer.getFactory("Phone");
        assert phoneFactory != null;
        Phone phone = phoneFactory.getPhone(region);
        String checkedPhoneNumber = phone.checkPhone(uncheckedPhoneNumber) ? (phone.prefix() + " " + uncheckedPhoneNumber) : null;

        if (checkedAddress != null && checkedPhoneNumber != null) {
            Contact contact = new Contact(name, checkedAddress, checkedPhoneNumber);
            notebook.addContact(contact);
            System.out.println("Contact added successfully.");
        } else {
            if (checkedAddress == null) {
                System.out.println("Invalid address format.");
            }
            if (checkedPhoneNumber == null) {
                System.out.println("Invalid phone number format.");
            }
            System.out.println("Contact not saved.");
        }
    }

    static String lineInput(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}