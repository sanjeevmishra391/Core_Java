// stack:

// LIFO: Last In First Out
// 1. push: inserts element to the top of stack
// 2. pop: retrieves and removes the top most element from stack.
// 3. peek: retrieves the top element of stack.

// int peek() {return arr[top];}

import java.util.Stack;

public class Class19 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(25);
        st.push(52);
        st.push(67);
        st.push(9);

        System.out.println(st);

        int p = st.peek();
        System.out.println("Peeked data: " + p);
        System.out.println("Stack after peek operation: " + st);

        p = st.pop();
        System.out.println("Popped data: " + p);
        System.out.println("Stack after pop operation: " + st);

        try {
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
        } catch (Exception e) {
            System.out.println("Can not pop from empty stack");
        }

        st.push(25);
        st.push(52);
        st.push(67);
        st.push(9);

        st.add(2, 85);
        System.out.println("Stack after adding element at 2nd index: " + st);

        boolean isEmpty = st.empty();
        System.out.println("Is Stack empty? " + isEmpty);

    }
}
