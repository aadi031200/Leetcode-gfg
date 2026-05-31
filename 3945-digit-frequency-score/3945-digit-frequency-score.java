class Solution {
    public int digitFrequencyScore(int n) {
        int count=0;
        int[] arr= new int[10];
         while(n!=0){
            int m=n%10;
           arr[m]=arr[m]+1;
            n=n/10;
        }

        for(int i=0;i<arr.length;i++){
            count+=i*arr[i];
        }
        return count;
    }
}