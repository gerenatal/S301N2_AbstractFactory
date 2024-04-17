public class PhoneBR implements Phone{
    @Override
    public boolean checkPhone(String phoneNumber) {
        return phoneNumber.length() == 12 && phoneNumber.startsWith("+559");
    }
}
