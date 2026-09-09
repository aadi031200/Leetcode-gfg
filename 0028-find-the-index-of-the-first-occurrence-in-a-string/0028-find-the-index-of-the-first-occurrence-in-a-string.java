class Solution {
    public int strStr(String hay, String nee) {
        int n=hay.length();
        int m=nee.length(); 

        if(m>n) return -1;

        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && hay.charAt(i+j)==nee.charAt(j)){
                j++;
            }
            if(j==m) return i;
        }

        return -1;
    }
}