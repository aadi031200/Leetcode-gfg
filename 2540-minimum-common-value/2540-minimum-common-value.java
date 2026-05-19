class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        int ans = Integer.MAX_VALUE;

        for (int num : nums2) {
            if (set.contains(num)) {
                ans = Math.min(ans, num);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}