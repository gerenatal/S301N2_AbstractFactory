import Address.AddressFactory;
import Phone.PhoneFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("PHONE")) {
            return new PhoneFactory();
        } else if (choice.equalsIgnoreCase("ADDRESS")) {
            return new AddressFactory();
        }
        return null;
    }
}