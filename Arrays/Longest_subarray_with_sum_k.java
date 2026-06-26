public static int longestSubarray(int[] arr, int k) {

    int left = 0, right = 0;
    int sum = arr[0];
    int maxLen = 0;
    int n = arr.length;

    while (right < n) {

        // Shrink window if sum becomes greater than k
        while (left <= right && sum > k) {
            sum -= arr[left];
            left++;
        }

        // Check if current window has sum = k
        if (sum == k) {
            maxLen = Math.max(maxLen, right - left + 1);
        }

        // Expand window
        right++;
        if (right < n) {
            sum += arr[right];
        }
    }

    return maxLen;
}