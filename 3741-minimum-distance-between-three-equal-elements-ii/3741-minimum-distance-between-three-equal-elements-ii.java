class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;

        HashMap<Integer,List<Integer>> map=  new HashMap<>();
        int result=Integer.MAX_VALUE;

        for(int k=0;k<n;k++){
            map.putIfAbsent(nums[k],new ArrayList<>());
            map.get(nums[k]).add(k);

            if(map.get(nums[k]).size()>=3){
                List<Integer> ans= map.get(nums[k]);
                int len=ans.size();
                int i=ans.get(len-3);

                result=Math.min(result,(k-i));
            }
        }
        return result==Integer.MAX_VALUE?-1:2*result;
    }
}