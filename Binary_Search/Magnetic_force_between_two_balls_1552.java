import java.util.Arrays;

class Magnetic_force_between_two_balls_1552 {
    public boolean canWePlace(int[] position, int dist, int k) {
        int cnt = 1, last = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= dist) {
                cnt++;
                last = position[i];
            }
            if (cnt >= k) {
                return true;
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 1, high = position[n - 1] - position[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canWePlace(position, mid, m)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}