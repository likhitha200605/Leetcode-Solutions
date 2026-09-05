package Sliding_window_two_pointer;

import java.util.*;
public class Max_of_k_distinct_char {
    public int longestKSubstr(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int maxlen = -1;

        while (r < s.length()) {

            char ch = s.charAt(r);

            // Add character to hashmap
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // If distinct characters become more than k
            while (map.size() > k) {

                char leftChar = s.charAt(l);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                l++;
            }

            // Current window has at most k distinct characters
            if (map.size() == k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }

            r++;
        }

        return maxlen;
    }
}
