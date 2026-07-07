class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        while(n>0){
            int rmn=n%10;
            if(rmn!=0){
                x=(x*10)+rmn;
            }
            sum+=rmn;
            n=n/10;
        }
        long y=0;
        while(x>0){
            long rmn=x%10;
            y=(y*10)+rmn;
            x=x/10;
        }
        return y*sum;
    }
}