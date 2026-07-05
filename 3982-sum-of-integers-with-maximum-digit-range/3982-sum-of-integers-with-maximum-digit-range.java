class Solution {
    public int maxDigitRange(int[] nums) {
        int ans=0;
        int[] dr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            int dup=nums[i];
            while (dup > 0) {
                int rmn = dup % 10;
                largest = Math.max(largest, rmn);
                smallest = Math.min(smallest, rmn);
               dup= dup / 10;
            }
            // digitrange=Math.max(digitrange,largest-smallest);
            dr[i] = largest - smallest;
        }

        int max = 0;
        for (int i = 0; i < dr.length; i++) {
            max = Math.max(max, dr[i]);
        }
         for (int i = 0; i < dr.length; i++) {
            if (dr[i] == max) {
                ans += nums[i];
            }
        }

        return ans;
    }
}