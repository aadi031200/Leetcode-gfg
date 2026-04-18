class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n*2];
        int i=0;
        int j=n;
        int k=0;
        while(i<n){
            ans[k]=nums[i];
            k++;
            ans[k]=nums[j];
            k++;
            i++;
            j++;
        }
        return ans;
    }
}