import java.util.Stack;

// Stack -> FIFO(First In First Out)

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // push(e), pop(), peek()[gives top element of stack]

        st.push(12);
        System.out.println(st);
        st.push(13);
        System.out.println(st);
        System.out.println("Peek: " + st.peek());
        st.pop();
        System.out.println(st);
    }
}
