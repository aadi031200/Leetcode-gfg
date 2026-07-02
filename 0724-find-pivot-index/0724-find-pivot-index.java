class Solution {
    public int pivotIndex(int[] nums) {
        int[] arr= new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int leftsum=0;
            if(i>0) leftsum=arr[i-1];

            int rightsum=arr[arr.length-1]-arr[i];

            if(leftsum==rightsum) return i;
            
        }
        return -1;
    }
}