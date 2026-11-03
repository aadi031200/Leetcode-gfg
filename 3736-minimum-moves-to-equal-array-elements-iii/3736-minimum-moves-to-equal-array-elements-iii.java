class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int ele:nums){
            max=Math.max(ele,max);
        }
        for(int ele:nums){
            ans+=Math.abs(max-ele);
        }
        return ans;
    }
}