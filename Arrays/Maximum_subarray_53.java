public class Maximum_subarray_53 {

    public static void kadane(int[] arr) {

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum == 0)
                start = i;

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0)
                sum = 0;
        }

        System.out.println("Maximum Sum = " + maxi);

        System.out.print("Subarray = ");

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}