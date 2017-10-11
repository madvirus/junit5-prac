package simple;

import meter.PasswordLevel;
import meter.PasswordMeter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
public class UsingRunwithTest {

    @Test
    void weak() {
        PasswordMeter meter = new PasswordMeter();
        Assertions.assertEquals(PasswordLevel.WEAK, meter.meter("1234"));
    }
}
