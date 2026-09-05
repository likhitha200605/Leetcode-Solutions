package Sliding_window_two_pointer;

public class Number_of_substring_contain_3_character_1358 {
    public int numberOfSubstrings(String s) {
        int arr[] = { -1, -1, -1 };
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
            int minii = Math.min(arr[0], arr[1]);
            cnt += (1 + Math.min(minii, arr[2]));
        }
        return cnt;
    }
}
