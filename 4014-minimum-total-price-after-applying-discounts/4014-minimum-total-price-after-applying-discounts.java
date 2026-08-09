class Solution {
    public double minPrice(int[] prices, int[] dis) {
        Arrays.sort(prices);
        Arrays.sort(dis);
         double ans=0;
        int j=dis.length;

        for(int i=prices.length-1;i>=0;i--){
            if(j>0){
                double p1=prices[i];
              ans+=(p1*(100-dis[j-1]))/100;
            }else{
                ans+=prices[i];
            }

            j--;
        }
        return ans;
    }
}