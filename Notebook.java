import java.util.ArrayList;
import java.util.List;
public class Notebook {
    private static List<Contact> contactList;
    public Notebook(){
        contactList = new ArrayList<>();
    }
    public void addContact(Contact contact){
        contactList.add(contact);
    }
    public void printContacts(){
        //implement later to save in a txt file
    }
}
