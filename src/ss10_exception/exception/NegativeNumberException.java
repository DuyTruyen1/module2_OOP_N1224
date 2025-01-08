package ss10_exception.exception;

public class NegativeNumberException extends RuntimeException   {
    public NegativeNumberException(String message) {
        super(message);
    }
}
