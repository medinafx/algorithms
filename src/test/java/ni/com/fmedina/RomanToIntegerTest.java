package ni.com.fmedina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void addRomanNumeralWhitTheOneOnTheRight() {
        String roman = "LVIII";
        int expected = 58;

        int acutal = romanToInteger.romanToInt(roman);

        assertEquals(expected, acutal);
    }

    @Test
    void subtractRomanNumeralWhitTheOneOnTheRight() {
        String roman = "MCMXCIV";
        int expected = 1994;

        int acutal = romanToInteger.romanToInt(roman);

        assertEquals(expected, acutal);
    }

}