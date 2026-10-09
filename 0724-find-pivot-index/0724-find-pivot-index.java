class Solution {
    public int pivotIndex(int[] nums) {
        int[] pref= new int[nums.length+1];
        int[] suff= new int[nums.length+1];

        pref[0]=0;
        for(int i=1;i<pref.length;i++){
            pref[i]=pref[i-1]+nums[i-1];
        }
        suff[suff.length-1]=0;
        for(int i=suff.length-2;i>=0;i--){
            suff[i]=suff[i+1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(pref[i]==suff[i+1]) return i;
        }
        return -1;
    }
}