// inheritance

// super keyword: helps to access parent class' constructors, instance variables
// and methods from the child class.

// Imp: super statement should be the first statement in the constructor of child class

class Box {
    double length, width, height;

    // constructor 1
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // constructor 2
    Box(double a) {
        length = a;
        width = a;
        height = a;
    }

    // constructor 3
    Box() {
        length = -1;
        width = -1;
        height = -1;
    }

    double getVolume() {
        return length * width * height;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double w, double h, double we) {
        // length = l;
        // width = w;
        // height = h;

        super(l, w, h); // calls the constructor 1 of Box class
        weight = we;
    }

    BoxWeight(double a, double we) {
        super(a); // calls the constructor 2 of Box class
        weight = we;
    }

    double getWeightedVolume() {
        return getVolume() * weight;
    }
}

class Class12 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 15, 20);

        BoxWeight weightedBox = new BoxWeight(20, 30, 40, 100);

        System.out.println(box1.getVolume());

        System.out.println("Weight Box 1 outputs: ");
        System.out.println(weightedBox.getVolume());

        // System.out.println(box1.weight); !Error
        System.out.println(weightedBox.weight);
        System.out.println(weightedBox.length);
        System.out.println(weightedBox.width);
        System.out.println(weightedBox.height);

        BoxWeight weightedBox2 = new BoxWeight(50, 80);

        System.out.println("Weight Box 2 outputs: ");
        System.out.println(weightedBox2.getVolume());
        System.out.println(weightedBox2.weight);
        System.out.println(weightedBox2.length);
        System.out.println(weightedBox2.width);
        System.out.println(weightedBox2.height);
    }
}
