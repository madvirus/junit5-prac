package simple;

import common.Slow;
import org.junit.jupiter.api.*;

@DisplayName("라이프사이클 테스트")
public class LifecycleTest {

    @BeforeAll
    static void initAll() {
        System.out.println("initAll");
    }

    @BeforeEach
    void init() {
        System.out.println("init");
    }

    @Tag("pay")
    @Slow
    @DisplayName("어떤 테스트")
    @Test
    void someTest() {
        System.out.println("someTest");
    }

    @Disabled("테스트 환경 구성 필요")
    @Test
    void anyTest() {
        System.out.println("anyTest");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll");
    }

}
