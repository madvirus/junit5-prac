package nested;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

@Tag("slow")
@DisplayName("중첩 구조 테스트")
public class AuthenticatorTest {
    private Authenticator authenticator = new Authenticator();
    private MemoryUserRepository mockRepository = new MemoryUserRepository();

    @BeforeEach
    void setUp() {
        authenticator.setUserRepository(mockRepository);
    }

    @Test
    void when_Use_BadParam_Then_IAE_Thrown() {
        assertThrows(IllegalArgumentException.class,
                () -> authenticator.authenticate(null, null));
    }

    @Nested
    public class GivenNoUser {
        @BeforeEach
        void givenNoUser() {
            mockRepository.clear();
        }

        @Test
        void when_Auth_Then_Fail() {
        }
    }

    @Nested
    public class GivenUser {
        private String userId = "user";

        @BeforeEach
        void givenUser() {
            mockRepository.save(new User(userId, "pw"));
        }

        @Test
        void when_Use_NoMatchPw_then_Fail() {

        }
    }
}
