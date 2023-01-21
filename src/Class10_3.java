
// static data belongs to class. and if one object changes that data
// then it changes for every other object.

// final keyword: makes data as constant;

class Student {
    // instance variables
    static String name; // static variable
    private float height, weight;

    Student(String n, float height, float weight) {
        name = n;
        this.height = height;
        this.weight = weight;
    }

    float calculateBMI() {
        return (weight / (height * height));
    }

    // static method
    public static void sayMyName() {
        System.out.println("My name is " + name);

        // height = 5; !Error
    }
}

public class Class10_3 {

    static String text = "Random text";

    public static void main(String[] args) {
        Student s1 = new Student("Anuj", 1.35f, 60);
        float bmi = s1.calculateBMI();
        System.out.println("Bmi of student is : " + bmi);

        // System.out.println(s.weight); !Error

        // access static data
        Student.name = "Sanjeev";
        System.out.println(Student.name);

        Student s2 = new Student("Rohan", 1.52f, 60);

        System.out.println(Student.name);
        System.out.println(s1.name);
        System.out.println(s2.name);

        Student.sayMyName();

        System.out.println(Class10_3.text);

        final double PI;
        PI = 3.1457;
        System.out.println(PI);

        // PI = 5; !Error

    }
}
