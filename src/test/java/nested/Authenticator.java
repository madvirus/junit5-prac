package nested;

public class Authenticator {
    private UserRepository userRepository;

    public void authenticate(String id, String pw) {
        throw new IllegalArgumentException();
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
