package ni.com.fmedina.slidingWindow;

import java.util.Arrays;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 * <p>
 * Example 1
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * <p>
 * Example 2
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */
public class PermutationInString {

    public boolean checkInclusionUsingSort(String s1, String s2) {
        char[] c = s2.toCharArray();
        Arrays.sort(c);
        s2 = new String(c);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (s1.equals(s2.substring(i, i + s1.length())))
                return true;
        }
        return false;
    }

}
