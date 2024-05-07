import java.util.ArrayList;
import java.util.List;

class Notebook {
    private final List<Contact> contactList;

    public Notebook() {
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void printContacts() {
        for (Contact contact : contactList) {
            System.out.println(contact.getName() + ", " + contact.getAddress() + ", " + contact.getPhoneNumber());
        }
    }
}