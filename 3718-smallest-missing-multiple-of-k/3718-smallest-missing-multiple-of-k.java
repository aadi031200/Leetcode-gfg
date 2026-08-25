class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<>();

        for(int ele:nums){
            set.add(ele);
        }
        int multiple=k;

        while(set.contains(multiple)){
            multiple+=k;
        }

        return multiple;
    }
}