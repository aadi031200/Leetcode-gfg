class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans= new int[gain.length+1];

        int max=0;
        for(int i=0;i<=gain.length-1;i++){
            ans[i+1]=ans[i]+gain[i];
        }
        for(int i=0;i<ans.length;i++){
             max=Math.max(max,ans[i]);
        }
        return max;
    }
}