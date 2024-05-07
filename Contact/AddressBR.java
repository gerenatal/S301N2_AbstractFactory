package Contact;
public class AddressBR implements Address {
    @Override
    public boolean checkZipCode(String zip){
        return zip.length() == 8;
    }
}
