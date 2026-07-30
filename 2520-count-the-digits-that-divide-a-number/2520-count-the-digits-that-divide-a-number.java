class Solution {
    public int countDigits(int num) {
        int ans=0;
        int n1=num;
        while(num!=0){
            int rmn=num%10;
            if(n1%rmn == 0) ans++;

            num=num/10;
        }
        return ans;
    }
}