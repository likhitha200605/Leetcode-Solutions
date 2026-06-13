package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_2_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        subset(0, nums, ans, ds);
        return ans;
    }

    public void subset(int index, int[] nums, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            ds.add(nums[i]);
            subset(i + 1, nums, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

}
