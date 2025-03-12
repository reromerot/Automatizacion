package reromerot.demos.exceptions;

public class NotTextFound extends AssertionError {

    private static final long serialVersionUID = 1L;

    public NotTextFound(String message, Throwable cause) {
        super(message, cause);
    }
}
