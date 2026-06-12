package Backtracking;

import java.util.*;

public class Permutation_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        List<Integer> ds = new ArrayList<>();
        recPermute(nums, ans, freq, ds);
        return ans;
    }

    public void recPermute(int[] nums, List<List<Integer>> ans, boolean[] freq, List<Integer> ds) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recPermute(nums, ans, freq, ds);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}
