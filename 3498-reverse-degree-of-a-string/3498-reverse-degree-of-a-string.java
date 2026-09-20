class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int j=1;
        for(int i=0;i<s.length();i++){
            ans+=(123-s.charAt(i))*j;
            j++;
        }  
        return ans;
    }
}  