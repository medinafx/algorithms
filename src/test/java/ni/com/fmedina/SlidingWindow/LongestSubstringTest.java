package ni.com.fmedina.slidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {

    private static final LongestSubstring longestSubstring = new LongestSubstring();

    @Test
    void withoutRepeatingCharacters() {
        int expected = 3, actual = longestSubstring.withoutRepeatingCharacters("abcabcbb");

        assertEquals(expected, actual, "Expetect " + expected + " but was " + actual);
    }
}