package ni.com.fmedina;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which
 * is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not
 * IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction
 * is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger {
    public static Map<Character, Integer> roman = new HashMap<>();

    static {
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }

    public int romanToInt(String s) {
        int sum = roman.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (roman.get(s.charAt(i)) >= roman.get(s.charAt(i + 1))) {
                sum += roman.get(s.charAt(i));
            } else {
                sum -= roman.get(s.charAt(i));
            }
        }
        return sum;
    }
}
