class Solution {

    private void findsub(int idx,int[] arr,List<List<Integer>> ans,ArrayList<Integer> ds){
        
        ans.add(new ArrayList<>(ds));

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
        ds.add(arr[i]);
        findsub(i+1,arr,ans,ds);
        ds.remove(ds.size()-1);
         }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        findsub(0,nums,ans,new ArrayList<>());
        return ans;
    }
}