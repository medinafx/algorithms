package ni.com.fmedina.binarySearch;

public class BinarySearch {

    /*
    * Given an array of integers nums which is sorted in ascending order
    * , and an integer target, write a function to search target in nums.
    * If target exists, then return its index. Otherwise, return -1. You
    * must write an algorithm with O(log n) runtime complexity.
    *
    * Example 1:
    * Input: nums = [5,7,7,8,8,10], target = 8
    * Output: 4
    *
    * Example 2:
    * Input: nums = [-1,0,3,5,9,12], target = 2
    * Output: -1
    * Explanation: target is not in nums.
    * */
    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;

        int left = 0, right = nums.length - 1, pivot = 0;
        while (left < right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target)
                return pivot;

            if (target > nums[pivot]) {
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }
}
