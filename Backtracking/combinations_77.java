package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinations_77 {
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> ds = new ArrayList<>();
            subset(1, n, ans, ds, k);
            return ans;
        }

        public void subset(int index, int n, List<List<Integer>> ans, List<Integer> ds, int k) {
            if (ds.size() == k) {
                ans.add(new ArrayList<>(ds));
                return;
            }
            if (index <= n) {
                ds.add(index);
                subset(index + 1, n, ans, ds, k);
                ds.remove(ds.size() - 1);
                subset(index + 1, n, ans, ds, k);
            }
        }
    }
}
