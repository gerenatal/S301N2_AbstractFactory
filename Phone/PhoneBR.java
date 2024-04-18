package Phone;

import Phone.Phone;

public class PhoneBR implements Phone {
    @Override
    public boolean checkPhone(String phoneNumber) {
        return phoneNumber.startsWith("+559");
    }
}
