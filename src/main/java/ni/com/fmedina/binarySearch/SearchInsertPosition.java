package ni.com.fmedina.binarySearch;

public class SearchInsertPosition {

    /*
    Given a sorted array of distinct integers and a target value
    , return the index if the target is found. If not, return
    the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.
     */
    public int search(int[] nums, int target) {
        int idx = 0;
        while (nums[idx] < target || nums[idx] != target) {
            idx++;
        }
        return idx;
    }
}
