// Last updated: 22/09/2026, 09:20:47
class MyQueue {

    Stack<Integer> st;
    Stack<Integer> st2;

    public MyQueue() {
        st = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        while (st.size() > 1) {
            st2.push(st.pop());
        }

        int pop = st.pop();

        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }

        return pop;
    }

    public int peek() {
        while (st.size() > 1) {
            st2.push(st.pop());
        }

        int peek = st.peek();

        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }

        return peek;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}