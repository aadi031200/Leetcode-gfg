class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        boolean [] freq= new boolean[nums.length];

        recp(nums,ans,freq,new ArrayList<>());

        return ans;
    }

    private void recp(int[] nums,List<List<Integer>> ans, boolean[] freq,List<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                recp(nums,ans,freq,ds);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}