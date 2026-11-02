class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med=nums[nums.length/2];
        int ans=0;
        for(int ele:nums){
            ans+=Math.abs(ele-med);
        }
        return ans;
    }
}