class Solution {
    public int findGCD(int[] nums) {
        int a =Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;

        for(int ele:nums){
            if(ele>a){
                a=Math.max(a,ele);
            }
            if(ele<b){
                b=Math.min(b,ele);
            }
        }
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }

        if(a==0) return b;
        return a;
    }
}