package Contact;
import Factory.AbstractFactory;

public class ContactFactory implements AbstractFactory {
    @Override
    public Phone getPhone(String region) {
        Phone phone = null;
        if (region.equalsIgnoreCase("BR")) {
            phone = new PhoneBR();
        } else if (region.equalsIgnoreCase("ES")) {
            phone = new PhoneES();
        }
        return phone;
    }

    @Override
    public Address getAddress(String region) {
        Address address = null;
        if (region.equalsIgnoreCase("BR")) {
            address = new AddressBR();
        } else if (region.equalsIgnoreCase("ES")) {
            address = new AddressES();
        }
        return address;
    }
}