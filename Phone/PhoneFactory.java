package Phone;
import Factory.AbstractFactory;
import Address.Address;
import Phone.Phone;
public class PhoneFactory implements AbstractFactory {
    @Override
    public Phone getPhone(String region) {
        if (region.equalsIgnoreCase("BR")) {
            return new PhoneBR();
        } else if (region.equalsIgnoreCase("ES")) {
            return new PhoneES();
        }
        return null;
    }
    @Override
    public Address getAddress(String region) {
        return null;
    }
}