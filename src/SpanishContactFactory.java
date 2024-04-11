class SpanishContactFactory implements ContactFactory {
    @Override
    public Address createAddress() {
        return new SpanishAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new SpanishPhoneNumber();
    }
}