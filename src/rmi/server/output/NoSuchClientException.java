package rmi.server.output;

public class NoSuchClientException extends Exception {
    private static final long serialVersionUID = 1L;

    public NoSuchClientException(String message) {
        super(message);
    }
}
