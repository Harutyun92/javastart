package program.users;

public class UserExistsException extends RuntimeException {
    public UserExistsException(String message) {
        super(message);
    }
}