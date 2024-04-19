package Factory;
import Phone.PhoneFactory;
import Address.AddressFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("PHONE")) {
            return new Phone.PhoneFactory();
        } else if (choice.equalsIgnoreCase("ADDRESS")) {
            return new Address.AddressFactory();
        }
        return null;
    }
}