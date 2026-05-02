class Solution {
    public int fib(int n) {
      return fabi(n);
     }

     public static int fabi(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        
        int ans =fabi(n-1)+fabi(n-2);
    return ans;
     }
}