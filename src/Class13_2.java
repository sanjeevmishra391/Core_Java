// final keyword

// 1. makes data as constant
// 2. prevents child class to override method of parent class
// 3. prevents a class to be inherited. Any other class can not extend final class

// final class cannot be inherited.
final class ProgrammingLanguage {
    String name;

    ProgrammingLanguage(String name) {
        this.name = name;
    }

    // prevents child class to override the method.
    final void printName() {
        System.out.println("Undefined name of language.");
    }
}

// class Java extends ProgrammingLanguage {
// Java(String name) {
// super(name);
// }

// // void printName() {
// // System.out.println("The name of the language is " + name);
// // }
// }

class Class13_2 {
    public static void main(String[] args) {

        final double PI = 3.14;
        // PI = 3; Error

        // ProgrammingLanguage pl = new Java("Java");
        // pl.printName();
    }
}

// this keyword
// super keyword
// final keyword
// static keyword
// break keyword
// continue keyword