package simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumptionTest {
    @Test
    void runTest_IfWindonw() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"));
        assertEquals(1, 2);
    }

    @Test
    void runTest_IfLinux() {
        assumeTrue(() -> System.getProperty("os.name").startsWith("Linux"));
        assertEquals(1, 2);
    }

    @Tag("very-slow")
    @Test
    void runTest() {
        assumingThat(System.getProperty("os.name").startsWith("Linux"),
                () -> assertEquals(1, 2));
        assertEquals(1, 1);
    }
}
