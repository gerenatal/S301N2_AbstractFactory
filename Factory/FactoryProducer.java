package Factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("PHONE") || choice.equalsIgnoreCase("ADDRESS")) {
            return new Contact.ContactFactory();
        }
        return null;
    }
}
