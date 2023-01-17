// homework and this keyword

// this keyword is used to refer the current object

// get function and set function
// get function is used to get the data.
// set function is used to set the data.

class Student {
    // name and roll number instance variables
    String name;
    int roll_number;

    Student(String name, int r) {
        this.name = name;
        this.roll_number = r;
    }

    // return_type funcion_name(inputs) { statements; return data; }
    void printDetails() {
        System.out.println("Details of the student: ");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll_number);
    }

    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }

}

public class Class6_2 {
    public static void main(String[] args) {

        Student student1 = new Student("Sanjeev", 7);
        student1.printDetails();

        student1.setName("Shiva");

        student1.printDetails();

        System.out.println("Name -> " + student1.getName());

        Student student2 = new Student("Gopal Prakash", 13);
        student2.printDetails();

        Student student3 = new Student("Tamanna", 19);
        student3.printDetails();
    }
}

// create Employee class and add few instance variables
// add constructor to initialise instance variables
// add displayDetails method and get and set methods for instance variables.
// create three Employee objects.
