package ni.com.fmedina.BFSAndDFS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrisionerTest {

    private Prisoner prisioner = new Prisoner();

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
    void canEscape_IfGuardVisibleFromRight_ReturnsFalse() {
        String[] prision = {
                "|||||||S<|",
                "|P ||   |",
                "||  | | |",
                "|v| | < |",
                "| |   | |",
                "|   |   |",
                "|||||||||"
        };

        assertFalse(prisioner.canEscape(prision));
    }

    @Test
    void canEscape_IfGuardVisibleFromLeft_ReturnsFalse() {
        String[] prision = {
                "||||||>S||",
                "|P ||   |",
                "||  | | |",
                "|v| | < |",
                "| |   | |",
                "|   |   |",
                "|||||||||"
        };

        assertFalse(prisioner.canEscape(prision));
    }

    @Test
    void canEscape_IfGuardVisibleFromBelow_ReturnsFalse() {
        String[] prision = {
                "|||||||S||",
                "|P ||   |",
                "||  | | |",
                "|v| | < |",
                "| |   | |",
                "|   |   |",
                "|||||||^|"
        };

        assertFalse(prisioner.canEscape(prision));
    }
}