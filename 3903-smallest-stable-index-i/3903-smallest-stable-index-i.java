class Solution {
    public int firstStableIndex(int[] nums, int tar) {
        int ans=Integer.MAX_VALUE;
        
       
        for(int i=0;i<nums.length;i++){
            int maxx=0;
            for(int j=0;j<=i;j++){
                 maxx=Math.max(maxx,nums[j]);
            }
            int min=Integer.MAX_VALUE;
            for(int k=i;k<=nums.length-1;k++){
                 min=Math.min(min,nums[k]);
            }

            if((maxx-min)<=tar){
                ans=Math.min(ans,i);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}