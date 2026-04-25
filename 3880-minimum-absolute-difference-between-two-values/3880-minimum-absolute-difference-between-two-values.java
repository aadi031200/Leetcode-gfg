class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int ii=-1;
        int jj=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ii=i;
            }else if(nums[i]==2){
                jj=i;
            }
           if(ii !=-1 && jj!=-1){
             ans=Math.min(ans,Math.abs(jj-ii));
           }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}