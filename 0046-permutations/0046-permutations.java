class Solution {

    //APPROACH 1 USING EXTRA ARRAY

    // public List<List<Integer>> permute(int[] nums) {
    //     List<List<Integer>> ans= new ArrayList<>();
    //     boolean [] freq= new boolean[nums.length];

    //     recp(nums,ans,freq,new ArrayList<>());

    //     return ans;
    // }

    // private void recp(int[] nums,List<List<Integer>> ans, boolean[] freq,List<Integer> ds){
    //     if(ds.size()==nums.length){
    //         ans.add(new ArrayList<>(ds));
    //         return;
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         if(!freq[i]){
    //             freq[i]=true;
    //             ds.add(nums[i]);
    //             recp(nums,ans,freq,ds);
    //             ds.remove(ds.size()-1);
    //             freq[i]=false;
    //         }
    //     }
    // }

    //APPROACH 2 WITHOUT USING EXTRA ARRAY , BY SWAPPING THE ELEMENTS 
        public List<List<Integer>> permute(int[] nums){
            List<List<Integer>> ans= new ArrayList<>();

            recp(0,nums,ans);
            return ans;
        }

        private void recp(int idx,int [] nums,List<List<Integer>> ans){
            if(idx==nums.length){
                List<Integer> ds= new ArrayList<>();
                for(int i=0;i<nums.length;i++){
                    ds.add(nums[i]);
                }
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i=idx;i<nums.length;i++){
                swap(i,idx,nums);
                recp(idx+1,nums,ans);
                swap(i,idx,nums);
            }
        }

        private void swap(int i,int j,int[] nums){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}