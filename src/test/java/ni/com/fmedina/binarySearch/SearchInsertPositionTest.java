package ni.com.fmedina.binarySearch;

import static org.junit.jupiter.api.Assertions.*;

public class SearchInsertPositionTest {
    private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    public void whenTargetExist_thenReturnIndex() {
        int[] nums = {0, 1, 2, 3, 4, 5};
        int target = 2, expected = 2;

        int actual = searchInsertPosition.search(nums, target);
        assertEquals(expected, actual, "Expected " + expected + " but got " + actual);
    }

    public void whenTargetDontExists_thenReturnThenInsertPosition() {
        int[] nums = {0, 1, 3, 4, 5};
        int target = 2, expected = 2;

        int actual = searchInsertPosition.search(nums, target);
        assertEquals(expected, actual, "Expected " + expected + " but got " + actual);
    }
}