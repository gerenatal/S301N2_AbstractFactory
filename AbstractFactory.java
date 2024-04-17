public interface AbstractFactory {
    Phone getPhone(String region);
    Address getAddress(String region);
}
