package simple;

import meter.PasswordLevel;
import meter.PasswordMeter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicTest {

    @Test
    void weak() {
        PasswordMeter meter = new PasswordMeter();
        Assertions.assertEquals(PasswordLevel.WEAK, meter.meter("1234"));
    }
}
