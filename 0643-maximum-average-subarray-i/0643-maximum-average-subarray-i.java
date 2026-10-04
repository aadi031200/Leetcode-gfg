class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int i=0;
        int j=k-1;
        double sum=0;
        double ans=Integer.MIN_VALUE;
          for(int a=i;a<=j;a++){
                sum+=nums[a];
            }
            ans=sum/k;
            i++;
            j++;
         while(j<nums.length){
            sum=sum-nums[i-1]+nums[j];
            ans=Math.max(ans,sum/k);
            i++;
            j++;
        }
        return ans;
    }
}