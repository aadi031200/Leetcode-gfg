class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < m; i++) {
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid][i] > target) {
                    high = mid - 1;
                } else if (arr[mid][i] < target) {
                    low = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}