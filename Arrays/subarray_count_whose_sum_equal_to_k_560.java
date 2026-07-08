class subarray_count_whose_sum_equal_to_k_560 {
    public int subarraySum(int[] nums, int k) {
        int prefix = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            prefix += num;
            int remove = prefix - k;
            cnt += map.getOrDefault(remove, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return cnt;
    }
}