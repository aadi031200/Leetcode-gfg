class Solution {
    public int[] rearrangeArray(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] ans= new int[nums.length];
        int index=0;
        while(!map.isEmpty()){
            for(int key:new ArrayList<>(map.keySet())){
                ans[index++]=key;
                map.put(key,map.get(key)-1);
                if(map.get(key)==0){
                    map.remove(key);
                }
            }
        }
        return ans;
    }
}