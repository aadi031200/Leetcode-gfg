class Solution {

    private void findcomb(int idx,int k,int target,List<List<Integer>> ans,List<Integer>ds){

        if(target==0 && ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(ds.size()>=k) return;
        for(int i=idx;i<=9;i++){

             if(i>target) break;

            ds.add(i);
            findcomb(i+1,k,target-i,ans,ds);
            ds.remove(ds.size()-1);

        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        findcomb(1,k,n,ans,new ArrayList<>());
        return ans;
    }
}