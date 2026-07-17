class Solution {
    public int minimumDeletions(int[] nums) {
        int minn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;

        int minidx=0;
        int maxidx=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<minn){
                minn=Math.min(minn,nums[i]);
                minidx=i;
            }
               if(nums[i]>maxx){
                maxx=Math.max(maxx,nums[i]);
                maxidx=i;
            }
        }

        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);

        int front=right+1;
        int back=nums.length-left;
        int both=(left+1)+(nums.length-right);

        return Math.min(front,Math.min(back,both)) ;
    }
}