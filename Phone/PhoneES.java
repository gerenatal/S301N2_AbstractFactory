package Phone;
import Phone.Phone;
public class PhoneES implements Phone {
    @Override
    public boolean checkPhone(String phoneNumber) {
        return (phoneNumber.startsWith("6") && phoneNumber.length() == 9);
    }
    @Override
    public String prefix(){
        return "+34";
    }
}
