package Address;

import Address.Address;

public class AddressBR implements Address {
    @Override
    public boolean checkAddress(String address){
        return address.startsWith("Rua");
    }
}
