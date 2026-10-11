class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        HashSet<Integer> set= new HashSet<>();
        for(int ele:map.values()){
            if(set.contains(ele)) return false;

            set.add(ele);
        }

        return true;

    }
}