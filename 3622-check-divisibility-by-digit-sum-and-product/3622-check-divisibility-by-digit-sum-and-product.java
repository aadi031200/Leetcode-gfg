class Solution {
    public boolean checkDivisibility(int n) {
        int du=n;
        int sum=0;
        int prod=1;
        while(n!=0){
            int m=n%10;
            sum+=m;
            prod*=m;
            n=n/10;
        }

        if(du%(sum+prod)!=0) return false;
        return true;
    }
}