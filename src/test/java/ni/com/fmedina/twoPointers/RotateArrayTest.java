package ni.com.fmedina.twoPointers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RotateArrayTest {

    private final RotateArray rotateArray = new RotateArray();

    @Test
    void givenAnArray_Rotate3StepsToTheRight() {
        int[] nums = {1,2,3,4,5,6,7}, expected = {5,6,7,1,2,3,4};
        int rotate = 3;

        rotateArray.rotate(nums, rotate);
        assertThat(nums, is(expected));
    }
}