package ni.com.fmedina.binarySearch;

/**
 * We are playing the Guess Game. The game is as follows:
 *
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 *
 * You call a pre-defined API int guess(int num), which returns three possible results:
 *
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 * 
 */
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
