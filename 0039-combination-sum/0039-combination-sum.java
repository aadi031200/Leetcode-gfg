class Solution {

    public void findComb(int idx,int[] cand,int targ,List<List<Integer>> ans,List<Integer> ds){
        if(idx==cand.length){
            if(targ==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(cand[idx]<=targ){
            ds.add(cand[idx]);
            findComb(idx,cand,targ-cand[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        findComb(idx+1,cand,targ,ans,ds);
    }

    public List<List<Integer>> combinationSum(int[] cand, int targ) {
        List<List<Integer>> ans= new ArrayList<>();
        findComb(0,cand,targ,ans,new ArrayList<>());

        return ans;
    }
}