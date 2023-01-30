package p2;

// import java.lang.Math;

public class Protection2 extends p1.Protection {
    Protection2() {
        System.out.println("Derived class in another package constructor");

        // System.out.println("n = " + n); !Error: In the same class or package

        // System.out.println("n_pri = " + n_pri); !Error: class only

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
