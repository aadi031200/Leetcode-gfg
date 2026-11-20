class Solution {
    public int countConsistent(int[] nums) {
        int count=0;
       
        for(int i=0;i<nums.length;i++){
             int min=Integer.MAX_VALUE;
             int ans=-1;
            for(int j=i;j>=0;j--){
                min=Math.min(min,nums[j]);

                  ans&=nums[j];
                   if(min==ans) count++;
            }
           
        }
        return count;
    }
}