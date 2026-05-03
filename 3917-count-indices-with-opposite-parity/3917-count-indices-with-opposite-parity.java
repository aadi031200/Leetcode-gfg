class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                 int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]%2==0){
                    count++;
                }
            }
            ans[i]=count;
            }
            else{
                 int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]%2!=0){
                    count++;
                }
            }
            ans[i]=count;
            }
        
        }
        return ans;
    }
}