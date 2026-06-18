package Bit_Manipulation;

public class Single_number_136 {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            unique ^= nums[i];
        }
        return unique;
    }
}
