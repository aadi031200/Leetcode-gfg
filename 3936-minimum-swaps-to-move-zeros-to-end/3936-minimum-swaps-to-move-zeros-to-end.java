class Solution {
    public int minimumSwaps(int[] nums) {
         int zeros = 0;

        // Count total zeros
        for (int num : nums) {
            if (num == 0) {
                zeros++;
            }
        }

        int swaps = 0;
        int n = nums.length;

        // Check last 'zeros' positions
        for (int i = n - zeros; i < n; i++) {
            if (nums[i] != 0) {
                swaps++;
            }
        }

        return swaps;
    }
}