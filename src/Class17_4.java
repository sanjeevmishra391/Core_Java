class DataHandler<T, V> {
    private T data;
    private V data2;

    DataHandler(T d1, V d2) {
        data = d1;
        data2 = d2;
    }

    void updateData(T newData) {
        data = newData;
    }

    T getData() {
        return data;
    }

    V getData2() {
        return data2;
    }
}

public class Class17_4 {
    public static void main(String[] args) {
        DataHandler<Integer, String> obj = new DataHandler<Integer, String>(15, "Rohit");
        System.out.println(obj.getData());

        obj.updateData(20);

        System.out.println(obj.getData());
        System.out.println(obj.getData2());

        DataHandler<Character, Boolean> obj2 = new DataHandler<Character, Boolean>('q', true);

        char c = obj2.getData();
        System.out.println(c);

        boolean b = obj2.getData2();
        System.out.println(b);

    }
}
