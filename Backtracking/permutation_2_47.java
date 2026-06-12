package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class permutation_2_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recPermute(0, nums, ans);
        return ans;
    }

    public void recPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            swap(i, index, nums);
            recPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }

    public void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
