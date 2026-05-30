class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set= new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int count=0;
        for(int x:set){
            if(set.contains(x+diff) && set.contains(x+2*diff)) count++;
        }

        return count;
    }
}