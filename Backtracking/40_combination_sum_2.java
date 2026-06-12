import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        return subset(0, candidates, target, ans, ds);
    }

    public List<List<Integer>> subset(int ind, int[] num, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return ans;
        }
        for (int i = ind; i < num.length; i++) {
            if (i != ind && num[i] == num[i - 1])
                continue;
            if (num[i] > target)
                break;
            ds.add(num[i]);
            subset(i + 1, num, target - num[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
        return ans;
    }
}