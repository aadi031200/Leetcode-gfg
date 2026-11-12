class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1) return 1;
        int length_i=1;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                length_i++;
            }else length_i=1;
            ans=Math.max(ans,length_i);
        }
        int length_d=1;
         for(int i=1;i<nums.length;i++){
            if(nums[i]< nums[i-1]){
                length_d++;
            }else length_d=1;
            ans=Math.max(ans,length_d);
        }
        return ans;
    }
}