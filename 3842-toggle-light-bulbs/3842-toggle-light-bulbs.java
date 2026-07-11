class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> nums) {
        List<Integer> ans= new ArrayList<>();

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0){
                ans.add(entry.getKey());
            }
        }

        Collections.sort(ans);
        return ans;
    }
}