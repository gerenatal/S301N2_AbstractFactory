import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private Map<String, ContactFactory> factories = new HashMap<>();

    public ContactManager() {
        factories.put("Spain", new SpanishContactFactory());
        factories.put("USA", new USContactFactory());
    }

    public Address createAddress(String country) {
        return factories.get(country).createAddress();
    }

    public PhoneNumber createPhoneNumber(String country) {
        return factories.get(country).createPhoneNumber();
    }

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Address spanishAddress = contactManager.createAddress("Spain");
        System.out.println("Spanish Address: " + spanishAddress.getAddressDetails());

        PhoneNumber spanishPhoneNumber = contactManager.createPhoneNumber("Spain");
        System.out.println("Spanish Phone Number: " + spanishPhoneNumber.getPhoneNumberDetails());

        Address usAddress = contactManager.createAddress("USA");
        System.out.println("US Address: " + usAddress.getAddressDetails());

        PhoneNumber usPhoneNumber = contactManager.createPhoneNumber("USA");
        System.out.println("US Phone Number: " + usPhoneNumber.getPhoneNumberDetails());
    }
}
