class Solution {
    public int maxDistance(int[] c) {
        int ans = 0;
        int n=c.length;
        //Brute force
        // for (int i = 0; i < c.length - 1; i++) {
        //     for (int j = i + 1; j < c.length; j++) {
        //         if (c[i] != c[j]) {
        //             ans = Math.max(ans, Math.abs(i - j));
        //         }
        //     }
        // }

        //Optimal Greedy

        //COmpare with first element 
        for(int i=n-1;i>=0;i--){
            if(c[i]!=c[0]){
                ans=Math.max(ans,i);
                break;
            }
        }

        //COmpare with last element
        for(int i=0;i<n;i++){
            if(c[i]!=c[n-1]){
                ans=Math.max(ans,n-1-i);
                break;
            }
        }
        return ans;
    }
}