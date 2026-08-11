class Solution {
    public int arraySign(int[] nums) {
        int zero=0;
        int minu=0;
        int plus=0;

        for(int p:nums){
            if(p==0) return 0;
            else if(p>0) plus++;
            else if(p<0) minu++;
        }

        if(minu%2==0) return 1;

        return -1;
    }
}