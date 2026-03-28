class Solution {
    public int minCost(String s, int[] time) {
        int ans=0;
        int prevMax=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)!=s.charAt(i-1)){
                prevMax=0;
            }

            int curr=time[i];

            ans+=Math.min(prevMax,curr);

            prevMax=Math.max(prevMax,curr);
        }
        return ans;
    }
}