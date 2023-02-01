// generics

// generics means parameterized types

// Wrapper classes:
// int -> Integer
// byte -> Byte
// short -> Short
// long -> Long
// char -> Character
// float -> Float
// double -> Double
// boolean -> Boolean

class Gen<T> {
    T data; // create variable of type T

    Gen(T d) {
        data = d;
    }

    T getData() {
        return data;
    }

    void showType() {
        System.out.println("The type of T is : " + data.getClass().getName());
    }
}

public class Class17_3 {

    // int is primitive data type.
    // Integer is wrapper class for int data type
    public static void main(String[] args) {
        Gen<Integer> obj = new Gen<Integer>(12);
        int v = obj.getData();
        System.out.println("Data = " + v);
        obj.showType();

        Gen<String> objString = new Gen<String>("Rahul");
        String s = objString.getData();
        System.out.println("Data = " + s);
        objString.showType();

        Gen<Character> objChar = new Gen<Character>('a');
        char c = objChar.getData();
        System.out.println("Data = " + c);
        objChar.showType();
    }
}
