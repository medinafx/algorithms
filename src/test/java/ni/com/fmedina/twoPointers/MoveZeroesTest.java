package ni.com.fmedina.twoPointers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative
 * order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 */
class MoveZeroesTest {

    private static final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void moveZeroes() {
        int[] nums = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};

        moveZeroes.moveZeroes(nums);

        assertThat(nums, is(expected));
    }
}