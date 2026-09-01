import java.util.Stack;

class Remove_k_digits_402 {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for (char ch : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        String result = res.reverse().toString();
        result = result.replaceFirst("^0+", "");
        if (result.length() == 0) {
            return "0";
        }
        return result;
    }
}