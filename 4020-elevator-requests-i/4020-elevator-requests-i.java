class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans=0;
        for(int i=1;i<requests.length;i++){
            ans+=Math.abs(requests[i]-requests[i-1]);
        }
        return requests[0]+ans;
    }
}