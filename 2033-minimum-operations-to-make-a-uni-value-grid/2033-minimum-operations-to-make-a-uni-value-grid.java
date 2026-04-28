class Solution {
    public int minOperations(int[][] grid, int x) {
        int count=0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ans.add(grid[i][j]);
            }
        }

        int rem=ans.get(0)%x;
        for (int ele : ans) {
            if (ele % x != rem)
                return -1;
        }

        Collections.sort(ans);
        
        int median=ans.get(ans.size()/2);

        for(int ele:ans){
           count+=Math.abs(ele-median)/x;
        }
        return count;
     }
}