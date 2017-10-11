package simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowTest {
    @Test
    void simple() {
        assertThrows(ArithmeticException.class, () -> divide(100, 0));
    }

    private int divide(int op1, int op2) {
        return op1 / op2;
    }
}
