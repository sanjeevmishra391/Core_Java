// method overriding

// Types of errors:
// 1. Compilation Error: It happens during compilation and doesnot let you execute program.
// 2. Runtime Error: It happens when your program is executing.

// Dynamic Method Dispatch: mechanism by which a call to an overridden method is resolved at run time, 
// rather than compile time.

// Polymorphism:
// There are two types of polymorphism:
// 1. Compile Time Polymorphism(early binding, overloading, and static binding): Method Overloading,
// 2. Runtime Polymorphism(late binding, dynamic binding, and overriding): Method Overriding

// Imp: Runtime polymorphism can't be achieved by data members.

class Figure {
    int length, width;

    Figure(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area of the figure is " + (length * width));
    }
}

class Rectangle extends Figure {
    Rectangle(int l, int w) {
        super(l, w);
    }

    void area() {
        System.out.println("Area of rectangle is " + (length * width));
    }
}

class Square extends Figure {
    Square(int a) {
        super(a, a);
    }

    void area() {
        System.out.println("Area of Square is " + (length * width));
    }
}

class Class13 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        Square sq = new Square(5);

        // rect.area();
        // sq.area();

        Figure f = new Rectangle(30, 40);
        f.area();

        f = new Square(50);
        f.area();

        // System.out.println("Result = " + (1 / 0)); !Runtime Error
    }
}
