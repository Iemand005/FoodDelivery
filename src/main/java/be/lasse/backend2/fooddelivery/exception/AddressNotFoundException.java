package be.lasse.backend2.fooddelivery.exception;

public class AddressNotFoundException extends Exception {
    public AddressNotFoundException(long id) {
        super("Address not found for id: " + id);
    }
}
