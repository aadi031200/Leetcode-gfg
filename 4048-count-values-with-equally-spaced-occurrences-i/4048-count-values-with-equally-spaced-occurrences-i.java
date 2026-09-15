class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i],k-> new ArrayList<>()).add(i);
        }

        int count=0;
        for(ArrayList<Integer> ans:map.values()){
            if(ans.size()==3){
                int i1=ans.get(0);
                int i2=ans.get(1);
                int i3=ans.get(2);

                if(i2-i1==i3-i2) count++;
            }
        }
        return count;
    }
}