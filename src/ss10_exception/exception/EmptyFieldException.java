package ss10_exception.exception;

public class EmptyFieldException extends RuntimeException {
  public EmptyFieldException(String message) {
    super(message);
  }
}
