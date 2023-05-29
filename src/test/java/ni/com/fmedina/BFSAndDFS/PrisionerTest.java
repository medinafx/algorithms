package ni.com.fmedina.BFSAndDFS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrisionerTest {

    private Prisioner prisioner = new Prisioner();

    @Test
    void canEscape_ReturnsTrue() {
        String[] prision = {
                "|||||||S||",
                "|P ||   |",
                "||  | | |",
                "|v| | < |",
                "| |   | |",
                "|   |   |",
                "|||||||||"
        };

        assertTrue(prisioner.canEscape(prision));
    }

    @Test
    void canEscape_ReturnsFalse() {
        String[] prision = {
                "||||||>S||",
                "|P ||   |",
                "||  | | |",
                "|v| | < |",
                "| |   | |",
                "|   |   |",
                "|||||||||"
        };

        assertTrue(prisioner.canEscape(prision));
    }
}