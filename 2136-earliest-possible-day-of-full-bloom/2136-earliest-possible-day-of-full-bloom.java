class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n=plantTime.length;
        
        int ans[][]= new int[n][2];

        for(int i=0;i<n;i++){
            ans[i][0]=plantTime[i];
            ans[i][1]=growTime[i];
        }

        Arrays.sort(ans,(a,b)->b[1]-a[1]);

        int maxBloomdays=0;
        int prevPlanndays=0;

        for(int i=0;i<n;i++){
           int currPlant=ans[i][0];
           int currGrow=ans[i][1];

            prevPlanndays+=currPlant;

            int currentBloomday=prevPlanndays+currGrow;
            maxBloomdays=Math.max(maxBloomdays,currentBloomday);
        }

        return maxBloomdays;
    }
}