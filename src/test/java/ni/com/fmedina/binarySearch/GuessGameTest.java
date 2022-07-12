package ni.com.fmedina.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessGameTest {

    @Test
    void guessNumber() {
        GuessGame guessGame = new GuessGame(1000);
        int expected = 1000, actual = guessGame.guessNumber(1000000);

        assertEquals(expected, actual, "Expected " + expected + " but got " + actual);
    }
}