class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<drones.length;i++){
                int ans=0;
            for(int j=0;j<=1;j++){

                ans+=Math.abs(drones[i][j]-target[j]);
            }
            if(ans<=drones[i][2]) map.put(i,ans);
        }
        Integer minKey=null;
        if(!map.isEmpty()){
              minKey = Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        }

        return map.isEmpty()? -1:(int)minKey;
    }
}