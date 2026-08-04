class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Integer> set= new HashSet<>();

        for(int ele:nums){
            set.add(ele);
        }

        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}