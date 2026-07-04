package Backtracking;

import java.util.ArrayList;
import java.util.List;

class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        recSubset(0, nums, ans, ds);
        return ans;
    }

    public void recSubset(int index, int[] nums, List<List<Integer>> ans, List<Integer> ds) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        recSubset(index + 1, nums, ans, ds);
        ds.add(nums[index]);
        recSubset(index + 1, nums, ans, ds);
        ds.remove(ds.size() - 1);
    }
}