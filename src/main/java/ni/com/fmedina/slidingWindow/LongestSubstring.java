package ni.com.fmedina.slidingWindow;

import java.util.Arrays;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 */
public class LongestSubstring {
    public int withoutRepeatingCharacters(String s) {
        int[] lastIndexOf = new int[256];
        Arrays.fill(lastIndexOf, -1);

        int start = 0, result = 0;
        for (int end = 0; end < s.length(); end++) {
            start = lastIndexOf[s.charAt(end)] + 1;
            result = Math.max(result, end - start + 1);
            lastIndexOf[s.charAt(end)] = end;
        }

        return result;
    }
}
