class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int du=nums[nums.length-1];
        for(int j=1;j<nums.length;j++){
            if(nums[j-1]!=nums[j]){
                nums[i]=nums[j-1];
                i++;
            }
        }
         nums[i]=du;
        return i+1;
    }
}