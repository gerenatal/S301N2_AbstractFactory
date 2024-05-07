package Factory;
import Contact.Address;
import Contact.Phone;
public interface AbstractFactory {
    Phone getPhone(String region);
    Address getAddress(String region);
}
