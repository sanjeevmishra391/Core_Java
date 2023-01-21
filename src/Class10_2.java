// access specifier, static keyword

// four types: public, private, protected and default

// static: helps to access members of any class without creating object
// Rules of static methods:
// 1. They can only directly access static data.
// 2. They can only directly call other static methods.
// 3. You cannot use `this` keyword in static method and you cannot use this keyword to access static data.

class Person {
    // data, methods
    public String name;
    static int age;
    static private int salary;

    Person(String n, int a, int sal) {
        name = n;
        age = a;
        salary = sal;
    }

    void printDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

        int newSalary = changeSalary();
        System.out.println(newSalary);
    }

    private static int changeSalary() {
        salary = salary + 1000;
        return salary;
    }

}

public class Class10_2 {

    static int data = 7;
    int a = 5;

    static void printMyName() {
        System.out.println("Hello, I am Sanjeev.");
    }

    public static void main(String[] args) {
        Person p = new Person("Rahul", 35, 10000);

        System.out.println(Person.age); // use classname to access static member.
        System.out.println();

        p.printDetails();

        // p.changeSalary(); Error

        System.out.println();
        Class10_2 obj = new Class10_2();
        // obj.a = 80;
        System.out.println("a= " + obj.a);
        System.out.println("data= " + data);
        printMyName();
    }
}

// static keyword: helps to access data(variables) and methods without creating
// object.

//