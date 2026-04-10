class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int res = Integer.MAX_VALUE;

        // store indices instead of frequency
        for(int i = 0; i < nums.length; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();

            if(list.size() >= 3){
                for(int i = 0; i <= list.size() - 3; i++){
                    int a = list.get(i);
                    int b = list.get(i+1);
                    int c = list.get(i+2);

                    int ans = Math.abs(a-b) + Math.abs(b-c) + Math.abs(c-a);
                    res = Math.min(res, ans);
                }
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}