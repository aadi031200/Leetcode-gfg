class Solution {
    public int candy(int[] arr) {
        int sum=1;
        int i=1;
        int n=arr.length;
        while(i<n){
            if(arr[i]==arr[i-1]){
                sum++;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && arr[i]>arr[i-1]){
                peak+=1;
                sum+=peak;
                i++;
            }
            int down=1;
            while(i<n && arr[i]<arr[i-1]){
               
                sum+=down;
                i++;
                 down+=1;
            }
            if(down>peak){
                sum+=down-peak;
            }
        }
        return sum;
    }
}