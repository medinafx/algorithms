package ni.com.fmedina.twoPointers;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class SquaresOfASortedArrayTest {

    SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

    @Test
    void givenArrayNums_ThenReturnSquaresOfEachNumberInIncreasingOrder() {
        int[] nums = {-4,-1,0,3,10};
        int[] expected = {0,1,9,16,100};

        int[] actual = squaresOfASortedArray.sorterdSquares(nums);

        assertThat(actual, is(expected));
    }

}