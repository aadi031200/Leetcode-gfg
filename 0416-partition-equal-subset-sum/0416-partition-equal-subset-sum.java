class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int totalS=0;
        for(int ele:nums){
            totalS+=ele;
        }
        if(totalS%2==1) return false;
        int k=totalS/2;
        int[][] dp=new int[n][k+1];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return subsetsum(n-1,k,dp,nums);
    }

    public boolean subsetsum(int idx,int target,int[][] dp,int[] nums){
        if(target==0) return true;

        if(idx==0) return nums[0]==target;

        if(dp[idx][target]!=-1) return dp[idx][target]==1;

        boolean notake=subsetsum(idx-1,target,dp,nums);
        boolean take=false;
        if(nums[idx]<=target){
            take=subsetsum(idx-1,target-nums[idx],dp,nums);
        }
        dp[idx][target]= (take|| notake)?1:0;

        return take||notake;
    }
}