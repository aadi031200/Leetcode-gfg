import java.util.*;

class Solution {
    public int minimumEffort(int[][] tasks) {

        // Sort by (minimum - actual) descending
        Arrays.sort(tasks, (a, b) -> {
            return (b[1] - b[0]) - (a[1] - a[0]);
        });

        int energy = 0;
        int ans = 0;

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            // If current energy is less than required minimum,
            // add extra energy
            if (energy < minimum) {
                ans += (minimum - energy);
                energy = minimum;
            }

            // Finish task
            energy -= actual;
        }

        return ans;
    }
}