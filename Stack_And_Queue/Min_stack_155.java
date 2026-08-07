import java.util.*;

class Min_stack_155 {
    private Stack<Long> st;
    private long mini;

    public Min_stack_155() {
        st = new Stack<>();
    }

    public void push(int value) {
        if (st.isEmpty()) {
            mini = value;
            st.push((long) value);
        }
        {
            if (value >= mini) {
                st.push((long) value);
            } else {
                st.push(2L * value - mini);
                mini = value;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) {
            return;
        }
        long top = st.pop();
        if (top < mini) {
            mini = (2 * mini - top);
        }
    }

    public int top() {
        if (st.isEmpty()) {
            return -1;
        }
        long top = st.peek();
        if (top >= mini) {
            return (int) top;
        }
        return (int) mini;
    }

    public int getMin() {
        return (int) mini;
    }
}