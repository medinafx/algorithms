package ni.com.fmedina.binarySearch;

public class GuessGame {
    private int num;

    public GuessGame (int num) {
        this.num = num;
    }

    public int guessNumber(int n) {
        int left = 0, right = n, pick = 0;
        while (left <= right) {
            pick = left + (right - left) / 2;

            int res = guess(pick);
            if (res == 0) {
                return pick;
            } else if (res == 1) {
                left = pick + 1;
            } else {
                right = pick - 1;
            }
        }
        return -1;
    }

    /**
     * Forward declaration of guess API.
     *
     * @param pick your guess
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     */
    private int guess(int pick) {
        return new Integer(num).compareTo(new Integer(pick));
    }
}
