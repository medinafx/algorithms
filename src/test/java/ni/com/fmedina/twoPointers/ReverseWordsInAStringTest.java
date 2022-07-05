package ni.com.fmedina.twoPointers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class ReverseWordsInAStringTest {

    private static final ReverseWordsInAString reverseWords = new ReverseWordsInAString();

    @Test
    void reverseWordsWithArray() {
        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";

        String actual = reverseWords.reverseWordsWithArray(s);

        assertThat(expected, equalTo(actual));
    }

    @Test
    void reverseWordWithLambda() {
        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";

        String actual = reverseWords.reverseWordWithLambda(s);

        assertThat(expected, equalTo(actual));
    }
}