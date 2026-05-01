class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sum=0;
        int f0=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            f0+=(long)i*nums[i];
        }

        int ans=f0;
        int curr=f0;

        for(int k=1;k<nums.length;k++){
            curr+=sum-(long)n*nums[n-k];
            ans=Math.max(ans,curr);
        }

        return ans;
    }
}