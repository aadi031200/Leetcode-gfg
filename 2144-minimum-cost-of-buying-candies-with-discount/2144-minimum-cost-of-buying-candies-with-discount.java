class Solution {
    public int minimumCost(int[] cost) {
        int score=0;
        Arrays.sort(cost);
        int i=0;
        int j=cost.length-1;
        while(i<j){
            int temp=cost[i];
            cost[i]=cost[j];
            cost[j]=temp;
            i++;
            j--;
        }

        for(int k=2;k<cost.length;k+=3){
            score+=cost[k];
        }
        int sum=0;
        for(int s=0;s<cost.length;s++){
            sum+=cost[s];
        }

        return sum-score;
    }
}