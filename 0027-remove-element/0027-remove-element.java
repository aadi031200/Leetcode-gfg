class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ans++;
            }
            if(nums[i]==val){
                nums[i]=100;
            }
        }
        Arrays.sort(nums);
        return ans;
    }
}