class Solution {
    public boolean validDigit(int n, int x) {
        int ans=0;
        int rev=0;
       boolean isdigit=false;
        while(n!=0){
            ans=n%10;
            rev=(rev*10)+ans;
            if(ans==x) isdigit=true;
            n=n/10;
        }
        if(rev%10 != x && isdigit==true) return true;

        return false;
    }
}