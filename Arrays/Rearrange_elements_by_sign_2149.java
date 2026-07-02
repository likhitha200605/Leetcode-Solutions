public class Rearrange_elements_by_sign_2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int num : nums) {
            if (num < 0) {
                arr[neg] = num;
                neg += 2;
            } else {
                arr[pos] = num;
                pos += 2;
            }
        }
        return arr;
    }
}
