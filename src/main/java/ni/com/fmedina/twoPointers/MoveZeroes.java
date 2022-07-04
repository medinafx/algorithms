package ni.com.fmedina.twoPointers;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIdx++] = nums[i];
            }
        }

        for (int i = lastNonZeroIdx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
