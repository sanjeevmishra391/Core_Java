package p2;

import p1.Protection;

public class OtherPackage {
    OtherPackage() {
        System.out.println("In the other package class constructor");

        Protection p = new Protection();

        // System.out.println("n = " + p.n); !Error: In the same class or package

        // System.out.println("n_pri = " + p.n_pri); !Error: same class

        // System.out.println("n_pro = " + p.n_pro); !Error: Only in child class

        System.out.println("n_pub = " + p.n_pub);
    }
}
