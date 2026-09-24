class Solution {
    public int smallestIndex(int[] nums) {
        int ans=Integer.MAX_VALUE;
         for(int i=0;i<nums.length;i++){
            int du=nums[i];
            int sm=0;
            while(nums[i]>0){
                sm+=nums[i]%10;
                nums[i]=nums[i]/10;
            }

            if(i==sm){
                ans=Math.min(ans,i);
            }
        }
     return ans==Integer.MAX_VALUE?-1:ans;

    }
}