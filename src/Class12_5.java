class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print() {
        super.Print();
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
        System.out.println("Child's Print()");
        super.Print();
    }
}

public class Class12_5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}
