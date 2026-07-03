public class Moores_Voting_Algorithm {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify candidate
        int freq = 0;
        for (int num : nums) {
            if (num == candidate)
                freq++;
        }

        return (freq > nums.length / 2) ? candidate : -1;
    }
}
