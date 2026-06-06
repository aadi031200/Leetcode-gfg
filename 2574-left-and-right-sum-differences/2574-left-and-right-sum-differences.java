class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        int[] left=new int[n];
        int[] right= new int[n];

        //right
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                right[i]+=nums[j];
            }
        }

        //left
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                left[i]+=nums[j];
            }
        }

        for(int i=0;i<ans.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}