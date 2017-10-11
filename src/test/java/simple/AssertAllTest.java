package simple;

import game.Game;
import game.Score;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {

    @Test
    void assertEach() {
        Game game = new Game(123);
        Score score = game.guess(134);
        assertEquals(1, score.getStrikes());
        assertEquals(1, score.getBalls());
    }

    @Test
    void assertAllSample() {
        Game game = new Game(123);
        Score score = game.guess(145);
        assertAll(
                () -> assertEquals(1, score.getStrikes()),
                () -> assertEquals(1, score.getBalls())
        );
    }
}
