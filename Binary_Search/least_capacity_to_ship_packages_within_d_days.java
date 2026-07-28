class least_capacity_to_ship_packages_within_d_days {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int wt : weights) {
            low = Math.max(wt, low);
            high += wt;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(weights, mid) <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int possible(int[] weights, int capacity) {
        int days = 1;
        int load = 0;
        for (int wt : weights) {
            if (load + wt > capacity) {
                load = wt;
                days++;
            } else {
                load += wt;
            }
        }
        return days;
    }
}