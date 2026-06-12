package Backtracking;

import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        return subset(0, candidates, target, ans, ds);
    }

    public List<List<Integer>> subset(int i, int[] nums, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return ans;
        }
        if (i == nums.length) {
            return ans;
        }

        if (nums[i] <= target) {
            ds.add(nums[i]);
            subset(i, nums, target - nums[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
        subset(i + 1, nums, target, ans, ds);

        return ans;
    }
}