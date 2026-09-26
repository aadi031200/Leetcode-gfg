class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ec) {
        List<Boolean> ans= new ArrayList<Boolean>();
        int max=0;
        for(int ele:candies){
            max=Math.max(ele,max);
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i]+ec>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}