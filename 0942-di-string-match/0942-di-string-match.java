class Solution {
    public int[] diStringMatch(String s) {
        int[] ans= new int[s.length()+1];

        int n=s.length();
        int j=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                ans[i]=j;
                j++;
            }
            else{
                ans[i]=n;
                n--;
            }
            
        }
        ans[s.length()]=j;

        return ans;
    }
}