class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashMap<Integer,Integer> map= new HashMap<>();
        List<Integer> ans= new ArrayList<>();
        for(int a=1;a<=Math.cbrt(n);a++){
            for(int b=a;b<=Math.cbrt(n);b++){
                int sum=(a*a*a)+(b*b*b);
                if(sum<=n){
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)>=2){
                ans.add(key);
            }
        }

        Collections.sort(ans);

        return ans;
    }
}