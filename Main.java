import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Notebook notebook = new Notebook();

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    1. Add contact
                    2. Print contact
                    3. Exit
                    Enter your choice:""");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    notebook.printContacts();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    public static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(name, address, phoneNumber);
        notebook.addContact(contact);
        System.out.println("Contact added successfully.");
    }
}