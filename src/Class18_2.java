// Drawbacks of array:
// 1. Array is of fixed size.
// 2. There maybe wastage of memory if array is not utilized fully.
// 3. There maybe lack of continuous memory for array storage.

// Linked list
// 1. Size is variable.
// 2. Data is not stored in continuous memory
// 3. Each Node in linked list has the address of next data
// 4. The first Node (data + address of next Node) is called Head node.

import java.util.LinkedList;

public class Class18_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(8);
        list.add(5);

        System.out.println(list);

        list.addFirst(19); // adds element in the first position(0th index)

        System.out.println("After adding element in the beginning: " + list);

        list.addLast(70); // adds element at the end of linkedlist

        System.out.println("After adding element at the last: " + list);

        System.out.println("The first element : " + list.getFirst());

        System.out.println("The last element : " + list.getLast());

        list.offer(33); // it adds element to the last of list.

        System.out.println("After using offer method: " + list);

        boolean res = list.offerFirst(200);
        System.out.println("Offer first returned value: " + res);

        System.out.println("After using offer first method: " + list);

        int p = list.peek(); // retrieves the first data and does not removes the data

        System.out.println("Peek result: " + p);

        p = list.poll(); // retrieves the first data and removes that data from list.

        System.out.println("Poll result: " + p);

        System.out.println("List after polling: " + list);

        p = list.peek();

        System.out.println("Peek result: " + p);

        int pop = list.pop();

        System.out.println("Popped data: " + pop);

        System.out.println("List after popping: " + list);

        int r = list.remove();

        System.out.println("Removed data: " + r);

        System.out.println("List after removing: " + list);

    }

}
