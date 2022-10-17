package ni.com.fmedina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfPangramTest {
    private CheckIfPangram checkIfPangram = new CheckIfPangram();

    @Test
    void sentenceWithAllLetters() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean expected = true;

        boolean actual = checkIfPangram.checkIfPangram2(sentence);

        assertEquals(expected, actual);
    }
}