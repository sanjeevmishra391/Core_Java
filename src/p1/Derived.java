package p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Derived constructor");
        System.out.println("n = " + n);
        // System.out.println("n_pri = " + n_pri); !Error: class only
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
