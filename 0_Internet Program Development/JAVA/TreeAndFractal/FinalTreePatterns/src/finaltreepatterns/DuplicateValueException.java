package finaltreepatterns;
public class DuplicateValueException extends Exception {
    public DuplicateValueException() {
    }
    
    public DuplicateValueException(String message) {
        super(message);
    }

    public DuplicateValueException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
