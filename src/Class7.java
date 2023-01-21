
// stack : is a data structure.
// top : which stores the index of last data added.
// push(data) : data is added to the last of stack.
// pop() : removes the data that was added most recent.

// garbage collection: automatic memory deallocation done by Java.

class Stack {
    // instance variable
    // int stack[] = new int[10];
    private int stackArr[]; // declaration
    private int top;

    Stack(int size) {
        top = -1;
        stackArr = new int[size]; // memory allocation
        System.out.println("An empty stack of size " + stackArr.length + " is created.");
    }

    // push(data) : add new data to the top
    void push(int data) {
        // length = l
        // index = [0, l-1]
        // top = [0, l-1]
        // l > l-1 it is only possible when (top = l-1)
        if (top + 1 > stackArr.length - 1) {
            System.out.println("Stack is full");
        } else {
            ++top;
            stackArr[top] = data;
        }
    }

    // pop : remove the top most data and return it
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int a = stackArr[top];
            top--;
            return a;
        }
    }

    void printStack() {
        System.out.println("Content of the stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArr[i] + " ");
        }
        System.out.println();
    }
}

class StackString {
    // instance variable
    // int stack[] = new int[10];
    String stackArr[]; // declaration
    int top;

    StackString(int size) {
        top = -1;
        stackArr = new String[size]; // memory allocation
        System.out.println("An empty stack of size " + stackArr.length + " is created.");
    }

    // push(data) : add new data to the top
    void push(String data) {
        // length = l
        // index = [0, l-1]
        // top = [0, l-1]
        // l > l-1 it is only possible when (top = l-1)
        if (top + 1 > stackArr.length - 1) {
            System.out.println("Stack is full");
        } else {
            ++top;
            stackArr[top] = data;
        }
    }

    // pop : remove the top most data and return it
    String pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return "";
        } else {
            String a = stackArr[top];
            top--;
            return a;
        }
    }

    void printStack() {
        System.out.println("Content of the stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArr[i] + " ");
        }
        System.out.println();
    }
}

public class Class7 {

    public static void main(String[] args) {
        Stack myStack = new Stack(10);

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

        myStack.printStack();

        // 2nd object
        Stack myStack2 = new Stack(5);

        myStack2.push(56);
        myStack2.push(5);
        myStack2.push(42);
        myStack2.push(73);
        myStack2.push(4);
        myStack2.push(2);

        myStack2.printStack();

        // string stack object
        StackString stackStringObj = new StackString(7);

        stackStringObj.push("Sanjeev");
        stackStringObj.push("Mishra");
        stackStringObj.push("Shiva");
        stackStringObj.push("Nehashree");
        stackStringObj.push("Deshmukh");

        String removeString = stackStringObj.pop();
        System.out.println(removeString);

        stackStringObj.printStack();

    }
}

// create Stack class and its corresponding methods and variables. Create two
// objects of that class and use different operations