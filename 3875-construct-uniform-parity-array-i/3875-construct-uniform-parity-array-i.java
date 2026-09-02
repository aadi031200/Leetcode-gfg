class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;

        for(int ele:nums1){
            if(ele%2==0) even++;
            else odd++;
        }

        if(odd==0 || even==0){
            return true;
        }
        return true;
    }
}