class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>(map.keySet());
        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            int x=list.get(i);

            for(int j=i+1;j<list.size();j++){
                int y=list.get(j);

                if(!map.get(x).equals(map.get(y))){
                    return new int[]{x,y};
                }
            }
        }
         

         return new int[] {-1,-1};
    }
}