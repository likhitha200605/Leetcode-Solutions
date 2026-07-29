public class Least_divisor {
    public int smallestDivisor(int[] nums, int threshold) {
        if (threshold < nums.length)
            return -1;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int min = possible(nums, mid);
            if (min <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int possible(int[] nums, int value) {
        int total = 0;
        for (int num : nums) {
            total += (int) Math.ceil((double) num / value);
        }
        return total;
    }
}
