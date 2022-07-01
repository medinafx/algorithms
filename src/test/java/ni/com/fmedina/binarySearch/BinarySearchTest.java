package ni.com.fmedina.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    public void whenTargetExists_thenReturnIndex() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 9, expected = 8;

        int actual = binarySearch.search(nums, target);
        assertEquals(expected, actual, "Expected " + expected + " but got " + actual);
    }

    @Test
    public void whenTargetNotExists_thenReturnNegativeIndex() {
        int[] nums = {1,2,3,5,6};
        int target = 7, expected = -1;

        int actual = binarySearch.search(nums, target);
        assertEquals(expected, actual, "Expected " + expected + " but got " + actual);
    }
}