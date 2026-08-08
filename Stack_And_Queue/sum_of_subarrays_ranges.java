import java.util.*;

public class sum_of_subarrays_ranges {

    public static long subArrayRanges(int[] nums) {

        long sumMax = sumOfSubarrayMaximums(nums);
        long sumMin = sumOfSubarrayMinimums(nums);

        return sumMax - sumMin;
    }

    // Sum of all subarray minimums
    public static long sumOfSubarrayMinimums(int[] nums) {

        int n = nums.length;

        int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Smaller Element
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;

            sum += left * right * nums[i];
        }

        return sum;
    }

    // Sum of all subarray maximums
    public static long sumOfSubarrayMaximums(int[] nums) {

        int n = nums.length;

        int[] pge = new int[n];
        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Greater Element
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pge[i] = -1;
            } else {
                pge[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Greater Element
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nge[i] = n;
            } else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {

            long left = i - pge[i];
            long right = nge[i] - i;

            sum += left * right * nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 4, 3, 2 };

        long result = subArrayRanges(nums);

        System.out.println("Sum of Subarray Ranges = " + result);
    }
}
