package Sliding_window_two_pointer;

import java.util.HashMap;

public class Longest_substring_without_repeating_char_3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxlen = 0;
        while (r < s.length()) {
            char str = s.charAt(r);
            if (map.containsKey(s.charAt(r))) {
                if (l <= map.get(str)) {
                    l = map.get(str) + 1;
                }
            }
            map.put(str, r);
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}
