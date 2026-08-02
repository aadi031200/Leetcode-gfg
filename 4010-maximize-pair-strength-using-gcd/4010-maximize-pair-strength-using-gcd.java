class Solution {
    public long maxPairStrength(int[] nums) {
        //Arrays.sort(nums);
                int n=nums.length;
                long ans=0;
 
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    long gc=gcd(nums[i],nums[j]);
                    ans=Math.max(ans,1L*nums[i]*nums[j]/(gc*gc));
                }
            }
            
        return ans;
        
    }

    public long gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;

        return a;
    }
}