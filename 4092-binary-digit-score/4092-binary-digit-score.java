class Solution {
    public int calculateScore(int a, int b) {
        int s1=setbit(a);
        int s2=setbit(b);
        return s1>=s2? s1*s2:s2/s1;
    }
    public int setbit(int n){
        int count=0;
        while(n>1){
            count+=n&1;
            n=n>>1;
        }
        if(n==1) count+=1;
    return count;
    }
}