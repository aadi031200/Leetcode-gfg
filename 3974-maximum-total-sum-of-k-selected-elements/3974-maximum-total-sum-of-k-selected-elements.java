class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long[] arr= new long[k];
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            if(k!=0){
                 arr[j]=nums[i];
                j++;
                k--;
            }
        }
        long totalsum=0;
        for(int l=0;l<arr.length;l++){
            if(mul>0){
                totalsum+=arr[l]*mul;
            }else{
                totalsum+=arr[l];
            }
            mul--;
        }
        return totalsum;
    }
}