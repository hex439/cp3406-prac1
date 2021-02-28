package au.edu.jcu.cp3406.guessinggame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void run_game() {
        Game game = new Game();

        boolean guessCorrect = false;
        for (int i = 1; i < 11; ++i) {
            guessCorrect = game.check(i);
                if (guessCorrect) {
                    break;
                }
        }
        assertTrue(guessCorrect);
    }
}
