// PriorityQueue

import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Sortbyname implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b) {
        // return a.age - b.age;
        return a.name.compareTo(b.name);
    }
}

public class Class29_4 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        pq.add(54);
        pq.add(13);
        pq.add(4);
        pq.add(5);
        pq.add(73);
        pq.add(29);
        pq.add(10);

        int p = pq.poll();
        System.out.println("Poll result: " + p);

        p = pq.poll();
        System.out.println("Poll result: " + p);

        PriorityQueue<Student> students = new PriorityQueue<>(new Sortbyname());

        Student s = new Student("Sanjeev", 23);
        students.add(s);
        students.add(new Student("Rahul", 21));
        students.add(new Student("Rohit", 22));
        students.add(new Student("Sahil", 24));
        students.add(new Student("Prashant", 25));

        while (!students.isEmpty()) {
            Student st = students.poll();
            System.out.println(st.name + ", " + st.age);
        }
    }
}
