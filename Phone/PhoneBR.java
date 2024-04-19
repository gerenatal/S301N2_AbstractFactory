package Phone;
import Phone.Phone;
public class PhoneBR implements Phone {
    @Override
    public boolean checkPhone(String phoneNumber) {
        return (phoneNumber.startsWith("9") && phoneNumber.length() == 9);
    }
    @Override
    public String prefix(){
        return "+55";
    }
}
