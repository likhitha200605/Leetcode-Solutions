public class Koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalh = possible(piles, mid);
            if (totalh <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public long possible(int[] piles, int mid) {
        long total = 0;
        for (int pile : piles) {
            total += (long) Math.ceil((double) pile / mid);
        }
        return total;
    }
}
