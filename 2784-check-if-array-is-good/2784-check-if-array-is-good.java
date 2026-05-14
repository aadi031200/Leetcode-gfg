class Solution {
    public boolean isGood(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // if(nums[n-1]!= n-1 || nums[n-2]!=n-1) return false;

        // for(int i=0;i<=n-2;i++){
        //     if(nums[i]!=i+1) return false;
        // }
        // return true;

        int n=nums.length-1;
        int[] freq= new int[nums.length-1];
        
        for(int number:nums){
            if(number>n) return false;

            freq[number-1]++;
        }

        for(int i=0;i<n-1;i++){
            if(freq[i]!=1) return false;

            if(freq[n-1]!=2) return false;
        }
    return true;

    }
}