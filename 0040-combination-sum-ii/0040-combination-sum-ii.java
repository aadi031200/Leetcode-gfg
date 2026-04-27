import java.util.*;

class Solution {

    public void solve(int idx, int[] cand, int target,
                      List<List<Integer>> ans,
                      List<Integer> ds) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < cand.length; i++) {

            // skip duplicates
            if (i > idx && cand[i] == cand[i - 1]) continue;

            // stop if element is bigger
            if (cand[i] > target) break;

            ds.add(cand[i]);

            solve(i + 1, cand, target - cand[i], ans, ds);

            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] cand, int target) {

        Arrays.sort(cand);

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, cand, target, ans, new ArrayList<>());

        return ans;
    }
}