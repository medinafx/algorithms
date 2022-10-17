package ni.com.fmedina;

import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        char[] seen = new char[256];
        for (char letter : sentence.toCharArray()) {
            seen[letter - '0'] = letter;
        }

        int sum = 0;
        for (char letter : seen) {
            if (letter - '0' > 0) {
                sum += letter - '0';
            }
        }
        return sum == 1599;
    }

    public boolean checkIfPangram2(String sentence) {
        Set<Character> seen = new HashSet<>();
        for (char letter : sentence.toCharArray()) {
            seen.add(letter);
        }
        return seen.size() == 26;
    }
}
