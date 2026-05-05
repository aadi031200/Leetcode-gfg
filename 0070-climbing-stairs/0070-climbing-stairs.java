class Solution {

    //USING MEMOIZATION

    // public int climbStairs(int n) {

    //     int[] dp= new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return climb(n,dp);
    // }

    // private int climb(int n,int[] dp){
    //     if(n==0 || n==1) return 1;

    //     if(dp[n]!=-1) return dp[n];

    //     return dp[n]=climb(n-1,dp)+climb(n-2,dp);
    // }
    //--------------------------------------------------------------------------------------------------------------
    // USING TABULATION

    public int climbStairs(int n) {
        return climb(n);
    }

    private int climb(int n) {
        if(n<=1) return 1;

        int prev = 1;
        int prev2 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }

}