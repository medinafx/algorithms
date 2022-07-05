package ni.com.fmedina.twoPointers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ReverseStringTest {

    private static final ReverseString reverseString = new ReverseString();

    @Test
    void reverseString() {
        char[] s = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};

        reverseString.reverseString(s);

        assertThat(s, is(expected));
    }
}