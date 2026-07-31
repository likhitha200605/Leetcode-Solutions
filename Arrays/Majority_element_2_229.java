import java.util.*;

class Majority_element_2_229 {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        List<Integer> ls = new ArrayList<>();
        for (int num : nums) {
            if (count1 == 0 && num != element2) {
                count1 = 1;
                element1 = num;
            } else if (count2 == 0 && num != element1) {
                count2 = 1;
                element2 = num;
            } else if (num == element1) {
                count1++;
            } else if (num == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == element1) {
                count1++;
            }
            if (num == element2) {
                count2++;
            }
        }
        int min = (nums.length / 3) + 1;
        if (count1 >= min) {
            ls.add(element1);
        }
        if (count2 >= min) {
            ls.add(element2);
        }
        return ls;
    }
}