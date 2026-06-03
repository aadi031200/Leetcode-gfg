import java.util.*;

class Solution {

    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        long ans = Math.min(
                solve(landStartTime, landDuration, waterStartTime, waterDuration),
                solve(waterStartTime, waterDuration, landStartTime, landDuration)
        );

        return (int) ans;
    }

    private long solve(int[] start1, int[] dur1,
                       int[] start2, int[] dur2) {

        int m = start2.length;

        int[][] rides = new int[m][2];

        for (int i = 0; i < m; i++) {
            rides[i][0] = start2[i];
            rides[i][1] = dur2[i];
        }

        Arrays.sort(rides, Comparator.comparingInt(a -> a[0]));

        int[] open = new int[m];
        long[] prefixMinDur = new long[m];
        long[] suffixMinOpenPlusDur = new long[m];

        for (int i = 0; i < m; i++) {
            open[i] = rides[i][0];
        }

        prefixMinDur[0] = rides[0][1];
        for (int i = 1; i < m; i++) {
            prefixMinDur[i] = Math.min(prefixMinDur[i - 1], rides[i][1]);
        }

        suffixMinOpenPlusDur[m - 1] =
                (long) rides[m - 1][0] + rides[m - 1][1];

        for (int i = m - 2; i >= 0; i--) {
            suffixMinOpenPlusDur[i] = Math.min(
                    suffixMinOpenPlusDur[i + 1],
                    (long) rides[i][0] + rides[i][1]
            );
        }

        long answer = Long.MAX_VALUE;

        for (int i = 0; i < start1.length; i++) {

            long finishFirst = (long) start1[i] + dur1[i];

            int idx = upperBound(open, finishFirst);

            if (idx >= 0) {
                answer = Math.min(
                        answer,
                        finishFirst + prefixMinDur[idx]
                );
            }

            if (idx + 1 < m) {
                answer = Math.min(
                        answer,
                        suffixMinOpenPlusDur[idx + 1]
                );
            }
        }

        return answer;
    }

    private int upperBound(int[] arr, long target) {
        int l = 0;
        int r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l - 1;
    }
}