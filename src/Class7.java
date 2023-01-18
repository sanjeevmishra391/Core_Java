
// stack : is a data structure.
// top : which stores the index of last data added.
// push(data) : data is added to the last of stack.
// pop() : removes the data that was added most recent.

class Stack {
    // instance variable
    int stack[] = new int[10];
    int top;

    Stack() {
        top = -1;
    }

    // push(data) : add new data to the top
    void push(int data) {
        if (top + 1 > 9) {
            System.out.println("Stack is full");
        } else {
            ++top;
            stack[top] = data;
        }
    }

    // pop : remove the top most data and return it
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int a = stack[top];
            top--;
            return a;
        }
    }
}

public class Class7 {

    public static void main(String[] args) {
        Stack myStack = new Stack();

        // test : pop when stack is empty
        // myStack.pop();

        myStack.push(5); // 1
        myStack.push(3); // 2

        // System.out.println(myStack.stack[myStack.top]);

        // int removedData = myStack.pop();
        // System.out.println("Result of pop operation : " + removedData);

        // removedData = myStack.pop();
        // System.out.println("Result of pop operation : " + removedData);

        // removedData = myStack.pop();
        // System.out.println("Result of pop operation : " + removedData);

        // test : push when stack is full
        myStack.push(10); // 3
        myStack.push(30); // 4
        myStack.push(50); // 5
        myStack.push(13); // 6
        myStack.push(15); // 7
        myStack.push(23); // 8
        myStack.push(25); // 9
        myStack.push(33); // 10. now stack will be full
        myStack.push(35); // 11
        myStack.push(65); // 12

        System.out.println(myStack.pop());

    }
}

// create Stack class and its corresponding methods and variables. Create two
// objects of that class and use different operations