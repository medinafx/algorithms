package ni.com.fmedina.twoPointers;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class RotateArrayTest {
    private final RotateArray rotateArray = new RotateArray();

    @Test
    void GivenAnArray_Rotate3StepsToTheRight() {
        int[] nums = {1,2,3,4,5,6,7}, expected = {5,6,7,1,2,3,4};
        int rotate = 3;

        rotateArray.rotate(nums, rotate);
        MatcherAssert.assertThat(nums, Matchers.is(expected));
    }
}