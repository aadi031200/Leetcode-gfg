class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long ans=0;
        long max=Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;

        for(long ele:nums){
            max=Math.max(max,ele);
            min=Math.min(min,ele);
        }

        ans=max-min;

        return ans*k;
    }
}