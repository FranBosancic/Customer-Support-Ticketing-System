package hr.java.exception;

/**
 * The {@code InvalidUserInputException} class is a custom exception that extends {@link Exception}.
 * It is used to indicate that an invalid user input has been provided.
 */
public class InvalidUserInputException extends Exception {

    /**
     * Default constructor for the {@code InvalidUserInputException}.
     */
    public InvalidUserInputException() {
    }

    /**
     * Constructs a new {@code InvalidUserInputException} with the specified detail message.
     *
     * @param message the detail message
     */
    public InvalidUserInputException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code InvalidUserInputException} with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause   the cause of the exception
     */
    public InvalidUserInputException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new {@code InvalidUserInputException} with the specified cause.
     *
     * @param cause the cause of the exception
     */
    public InvalidUserInputException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new {@code InvalidUserInputException} with the specified detail message, cause, suppression
     * enabled or disabled, and writable stack trace enabled or disabled.
     *
     * @param message            the detail message
     * @param cause              the cause of the exception
     * @param enableSuppression  whether or not suppression is enabled
     * @param writableStackTrace whether or not the stack trace is writable
     */
    public InvalidUserInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
