package Sliding_window.two_pointer;

public class Maximum_cards_u_can_obtain_1423 {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0;
        int right = 0;
        int maxii = 0;
        for (int i = 0; i < k; i++) {
            left += cardPoints[i];
            maxii = left;
        }
        int rindex = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            left -= cardPoints[i];
            right += cardPoints[rindex];
            rindex--;
            maxii = Math.max(maxii, left + right);
        }
        return maxii;
    }
}
