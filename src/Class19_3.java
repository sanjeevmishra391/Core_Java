import java.util.ArrayDeque;

// addition and deletion can happen in the front as well as at the tail.

public class Class19_3 {
    public static void main(String[] args) {
        // ArrayDeque
        ArrayDeque<Integer> aq = new ArrayDeque<>();
        aq.add(5);
        aq.addFirst(9);
        aq.addLast(12);

        System.out.println(aq);
    }
}
