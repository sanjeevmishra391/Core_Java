package p1;

public class SamePackage {
    SamePackage() {
        System.out.println("In the same package constructor");

        Protection p = new Protection();

        System.out.println("n = " + p.n);

        // System.out.println("n_pri = " + p.n_pri); !Error: class only

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
