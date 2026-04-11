class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==digit) count++;
            else{
                while(nums[i]!=0){
                   int lst=nums[i]%10;
                    if(lst==digit) count++;
                    nums[i]=nums[i]/10;
                }
            }
        }
        return count;
    }
}