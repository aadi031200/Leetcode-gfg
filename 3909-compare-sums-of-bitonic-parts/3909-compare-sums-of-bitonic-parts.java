class Solution {
    public int compareBitonicSums(int[] nums) {
        int peak = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                peak = i;
                break;
            }
        }
        long asum = 0;
        for (int i = 0; i <=peak; i++) {
            asum += nums[i];
        }
        long dsum = 0;
        for (int i = peak; i < nums.length; i++) {
            dsum += nums[i];
        }
        if (asum > dsum) {
            return 0;
        } else if (dsum > asum)
            return 1;

        return -1;
    }
}