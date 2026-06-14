class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int sqr=0;
        while(n!=0){
            int m=n%10;
            digitsum+=m;
            sqr+=m*m;
            n=n/10;
        }
        return sqr-digitsum>=50;
    }
}