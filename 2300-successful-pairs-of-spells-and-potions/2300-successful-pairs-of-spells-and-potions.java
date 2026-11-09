
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);

        int n = spells.length;
        int m = potions.length;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            long minPotion = (success + spells[i] - 1) / spells[i];

            int low = 0;
            int high = m - 1;
            int index = m;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (potions[mid] >= minPotion) {
                    index = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            ans[i] = m - index;
        }

        return ans;
    }
}
