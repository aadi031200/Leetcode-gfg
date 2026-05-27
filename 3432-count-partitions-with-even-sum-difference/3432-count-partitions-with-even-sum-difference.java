class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){

            int[] left= new int[i+1];
            int[] right=new int[n-1-i];

            for(int l=0;l<left.length;l++){
                left[l]=nums[l];
            }
            int z=i+1;
            for(int r=0;r<right.length;r++){
                right[r]=nums[z];
                z++;
            }

            int l_sum=0;
            int r_sum=0;
             for(int j=0;j<left.length;j++){
                l_sum+=left[j];
            }
            for(int k=0;k<right.length;k++){
                r_sum+=right[k];
            }

            if(Math.abs(r_sum-l_sum)%2==0) count++;
        }
        return count;
    }
}