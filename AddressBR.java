public class AddressBR implements Address{
    @Override
    public boolean checkAddress(String address){
        return address.endsWith("\\d{8}$");
    }
}
