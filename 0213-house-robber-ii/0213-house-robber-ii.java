class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1) return nums[0];

        int ans1=chor(nums,0,n-2);
        int ans2=chor(nums,1,n-1);

        return Math.max(ans1,ans2);
    }

    private int chor(int[] nums,int start,int end){
        int prev2=0;
        int prev=0;

        for(int i=start;i<=end;i++){
            int take=nums[i];
            if(i>1) take+=prev2;

            int nottake=0+prev;

            int curri=Math.max(take,nottake);

            prev2=prev;
            prev=curri;
        }
        return prev;
    }
}