class Solution {
    public int maximumWealth(int[][] nums) {
         int ans=0;
        for(int i=0;i<nums.length;i++){
            int rich=0;
            for(int j=0;j<nums[0].length;j++){
                rich+=nums[i][j];
            }
            ans=Math.max(ans,rich);
        }
        return ans;
    }
}