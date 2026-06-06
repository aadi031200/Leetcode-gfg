class Solution {
    public int[] leftRightDifference(int[] nums) {
        // int n=nums.length;
        // int[] ans= new int[n];
        // int[] left=new int[n];
        // int[] right= new int[n];

        // //right
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         right[i]+=nums[j];
        //     }
        // }

        // //left
        // for(int i=n-1;i>=0;i--){
        //     for(int j=i-1;j>=0;j--){
        //         left[i]+=nums[j];
        //     }
        // }

        // for(int i=0;i<ans.length;i++){
        //     ans[i]=Math.abs(left[i]-right[i]);
        // }
        // return ans;

        int leftsum=0;
        int rightsum=0;

        //sum of all elements of the array
        for(int ele:nums){
            rightsum+=ele;
        }

        int[] ans= new int[nums.length];

         // Compute differences on the fly
        for(int i=0;i<nums.length;i++){
             // Exclude the current element from the right side sum
            rightsum-=nums[i];

            // Calculate absolute difference
            ans[i]=Math.abs(leftsum-rightsum);

             // Include the current element into the left side sum for the next index
            leftsum+=nums[i];
        }
        return ans;

    }
}