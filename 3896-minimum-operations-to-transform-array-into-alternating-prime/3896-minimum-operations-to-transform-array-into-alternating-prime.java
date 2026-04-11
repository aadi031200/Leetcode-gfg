class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                while(!isprime(nums[i])){
                    nums[i]=nums[i]+1;
                    ans++;
                }
            }else{ //odd
                while(isprime(nums[i])){
                    nums[i]=nums[i]+1;
                    ans++;
                }
            }
        }
        return ans;
    }

    public boolean isprime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i) count++;
            }
        }
        if(count==2) return true;
        return false;
    }
}