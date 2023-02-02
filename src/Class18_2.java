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
    }

}
