public class AddressFactory implements AbstractFactory {
    @Override
    public Phone getPhone(String region) {
        return null;
    }
    @Override
    public Address getAddress(String region) {
        if (region.equalsIgnoreCase("BR")) {
            return new AddressBR();
        } else if (region.equalsIgnoreCase("ES")) {
            return new AddressES();
        }
        return null;
    }
}
