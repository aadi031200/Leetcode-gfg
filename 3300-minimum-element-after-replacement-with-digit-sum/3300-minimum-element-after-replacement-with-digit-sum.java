class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            int n=nums[i];
            int m=0;
            while(n!=0){
            m=n%10;
            sum+=m;
            n=n/10;
            }
            min=Math.min(sum,min);
        }
        return min;
    }
}