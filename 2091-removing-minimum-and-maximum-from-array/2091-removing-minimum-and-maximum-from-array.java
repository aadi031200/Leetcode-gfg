class Solution {
    public int minimumDeletions(int[] nums) {
         int n=nums.length;
         int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
       
        int left=0;
        int right=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            if(mini>nums[i]){
                mini=nums[i];
                left=i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(maxi<nums[i]){
                maxi=nums[i];
                right=i;
            }
        }
        int left1=Math.min(left,right);
        int right1=Math.max(left,right);

       int front=right1+1;
       int back=n-left1;
       int mid=(left1+1)+(n-right1);
        ans=Math.min(front,Math.min(back,mid));
        return ans;
    }
}