class Solution {
    
    private void findcomb(int idx,int target,int[] arr, List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            ds.add(arr[i]);
            findcomb(i+1,target-arr[i],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(cand);
        findcomb(0,target,cand,ans,new ArrayList<>());

        return ans;
    }
}