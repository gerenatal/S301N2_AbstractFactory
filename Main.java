import Address.Address;
import Phone.Phone;

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

        String uncheckedAddress = lineInput("Enter address: ");
        AbstractFactory addressFactory = FactoryProducer.getFactory("Address");
        Address address = addressFactory.getAddress(region);
        String checkedAddress = address.checkAddress(uncheckedAddress) ? uncheckedAddress : null;


        String uncheckedPhoneNumber = lineInput("Enter phone number: ");
        AbstractFactory phoneFactory = FactoryProducer.getFactory("Phone");
        Phone phone = phoneFactory.getPhone(region);
        String checkedPhoneNumber = phone.checkPhone(uncheckedPhoneNumber) ? uncheckedPhoneNumber : null;

        if(checkedAddress != null && checkedPhoneNumber != null){
            Contact contact = new Contact(name, checkedAddress, checkedPhoneNumber);
            notebook.addContact(contact);
            System.out.println("Contact added successfully.");
        }else{
            System.out.println("Some incorrect input, contact not saved!");
        }
    }

    static String lineInput(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}