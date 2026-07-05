class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        int count=0;
        for(int i=0;i<nums.length;i++){
           if(nums[mid]==nums[i]){
            count++;
           }
        }

        return count==1;
    }
}