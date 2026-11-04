class Solution {
    public int minMergedInteger(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i+=2){
            int temp=0;
            if(nums[i+1]>999){
             temp=nums[i]*10000+nums[i+1];
            }
           else if(nums[i+1]>99){
               temp=nums[i]*1000+nums[i+1];
           }else if(nums[i+1]>9){
              temp=nums[i]*100+nums[i+1];
           }else {
              temp=nums[i]*10+nums[i+1];
           }
            ans=Math.min(ans,temp);
        }
        return ans;
    }
}