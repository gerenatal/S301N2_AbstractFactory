package Address;
public class AddressES implements Address {
    @Override
    public boolean checkZipCode(String zip){
        return zip.length() == 5;
    }
}
