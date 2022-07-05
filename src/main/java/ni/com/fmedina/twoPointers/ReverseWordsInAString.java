package ni.com.fmedina.twoPointers;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsInAString {

    public String reverseWordsWithArray(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int idx = 0; idx < words.length; idx++) {
            result.append(new StringBuilder(words[idx]).reverse());
            if (idx < words.length -1)
                result.append(" ");
        }
        return result.toString();
    }

    public String reverseWordWithLambda(String s) {
        return Arrays.stream(s.split(" "))
                .map(word  -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
}
