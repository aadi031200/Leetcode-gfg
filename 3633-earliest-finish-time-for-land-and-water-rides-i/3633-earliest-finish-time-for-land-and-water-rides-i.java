class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int time=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){

                //land---->water
                int landFi=landStartTime[i]+landDuration[i];
                int finish1=Math.max(landFi,waterStartTime[j])+waterDuration[j];

                //water---->land
                int waterFi=waterStartTime[j]+waterDuration[j];
                int finish2=Math.max(waterFi,landStartTime[i])+landDuration[i];

                time=Math.min(time,Math.min(finish1,finish2));
            }
        }
        return time;
    }
}