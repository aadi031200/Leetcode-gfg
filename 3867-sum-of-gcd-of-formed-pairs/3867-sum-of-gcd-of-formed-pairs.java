class Solution {
    public long gcdSum(int[] nums) {
        int[] pred= new int[nums.length];
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            pred[i]=gcd(nums[i],mx);
        }

        Arrays.sort(pred);

        int i=0;
        int j=pred.length-1;
        long ans=0;
        while(i<j){
            ans+=gcd(pred[i],pred[j]);
            i++;
            j--;
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            return b;

        return a;
    }
}