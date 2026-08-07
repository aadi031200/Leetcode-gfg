class Solution {
    public int[] sortedSquares(int[] nums) {
         int n=nums.length;
        int[] ans= new int[n];
       
        int left=0;
        int right=n-1;
        int idx=n-1;

        while(left<=right){

            int l=Math.abs(nums[left]);
            int r=Math.abs(nums[right]);

            if(l<=r){
                ans[idx]=r*r;
                right--;
            }else{
                ans[idx]=l*l;
                left++;
            }
            idx--;
        }
        return ans;
    }
}