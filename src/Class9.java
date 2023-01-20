// constructor overloading, object as parameter, object as output,
// call by value, call by reference.

// Employee : firstname, lastname, age, address.

class Employee {

    // instance variables
    String firstName, lastName, address;
    int age;

    // constructor 1
    Employee(String fname, String lname, int a, String add) {
        firstName = fname;
        lastName = lname;
        age = a;
        address = add;

        System.out.println("New employee created. In the constructor 1.");
        System.out.println(
                "Firstname = " + firstName + ", Lastname = " + lastName + ", Age = " + age + ", Address = " + address);
    }

    // constructor 2
    Employee(String fname, String lname, int a) {
        firstName = fname;
        lastName = lname;
        age = a;
        address = "";

        System.out.println("New employee created. In the constructor 2");
        System.out.println(
                "Firstname = " + firstName + ", Lastname = " + lastName + ", Age = " + age + ", Address = " + address);
    }

    boolean checkAgeEquality(Employee emp) {
        if (emp.age == age) {
            return true;
        }

        return false;
    }

    // if you want to return any object then the return type will be class of object
    Employee createNewEmployee() {
        Employee emp = new Employee("Aditya", "Singh", 22);

        return emp;
    }

    // create new employee using the data of another employee
    Employee createDuplicateEmployee(Employee emp) {
        Employee newDuplicateEmp = new Employee(emp.firstName, emp.lastName, emp.age + 5);

        return newDuplicateEmp;
    }

}

public class Class9 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sanjeev", "Mishra", 23, "Prayagraj, UP");
        System.out.println();
        Employee emp2 = new Employee("Shiva", "Reddy", 21);

        System.out.println();

        boolean result = emp1.checkAgeEquality(emp2);
        System.out.println("Age of Emp1 == Emp2 : " + result);

        System.out.println();

        Employee newEmp = emp2.createNewEmployee();
        System.out.println(newEmp.age);

        System.out.println();

        Employee newDupEmp = emp1.createDuplicateEmployee(newEmp);
        System.out.println(newDupEmp.age);

    }
}
