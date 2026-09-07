class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int half=n/2;

        long firsthalf=0;
        for(int i=0;i<half;i++){
            firsthalf+=nums[i];
        }

        long total=0;
        for(long ele:nums) total+=ele;

        int count=0;
        for(int k=0;k<n;k++){
            long secondhalf=total-firsthalf;
            if(firsthalf>secondhalf) count++;

            firsthalf-=nums[k];
            firsthalf+=nums[(k+half)%n];
        }
        return count;
    }
}