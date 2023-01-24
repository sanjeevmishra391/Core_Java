class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Student extends Person {
    double percentage;

    Student(String n, int a, double p) {
        super(n, a);
        percentage = p;
    }
}

class Class12_3 {
    public static void main(String[] args) {
        Person p1 = new Person("Rohit", 35);

        Student s1 = new Student("Noor", 22, 85.0);

        System.out.println(p1.name); // Rohit
        System.out.println(p1.age); // 35

        System.out.println(s1.name); // Noor
        System.out.println(s1.age); // 22
        System.out.println(s1.percentage); // 85.0

        // in the reference of parent class, we can store the object of child class.
        // but this reference can only access data members of parent class
        p1 = s1;

        // s1 = p1; You cannot store the object of parent class into reference of child
        // class.

        System.out.println("After change in refernce");

        System.out.println(p1.name); // Noor
        System.out.println(p1.age); // 22
        // System.out.println(p1.percentage); !Error

        System.out.println(s1.name); // Noor
        System.out.println(s1.age); // 22
        System.out.println(s1.percentage); // 85.0

        p1.age = 10;

        System.out.println("After modification in age: ");
        System.out.println(p1.age); // 10
        System.out.println(s1.age); // 10

    }
}
