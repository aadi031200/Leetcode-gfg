class Solution {
    public int largestAltitude(int[] gain) {
        int[] pref= new int[gain.length+1];
        pref[0]=0;
        for(int i=1;i<pref.length;i++){
            pref[i]=pref[i-1]+gain[i-1];
        }
        int max=Integer.MIN_VALUE;
        for(int ele:pref){
            max=Math.max(max,ele);
        }
        return max;
    }
}