public class AddressES implements Address{
    @Override
    public boolean checkAddress(String address){
        return address.endsWith("\\d{5}$");
    }
}
