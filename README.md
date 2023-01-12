# Core_Java

## Installation steps:

https://www.guru99.com/install-eclipse-java.html

## References:

Java The Complete Reference, Eighth Edition

## About Java:

- simple, high level, robust, object-oriented, multithreaded, platform independent and secure programming language.
- was developed by Sun Microsystems, now owned by Oracle.
- James Gosling is known as the father of Java.

## How Java compiles and execute program?

1. Compilation: Parsing, Process Annotations, Flow, Generates Bytecode (.class file)
2. Execution: ClassLoader(The main class is loaded into the memory bypassing its ‘.class’ file to the JVM), Bytecode Verifier(job is to check that the instructions don’t perform damaging actions), Just-In-Time Compiler(job is to convert the loaded bytecode into machine code)
   ![image](https://user-images.githubusercontent.com/56467938/211311003-edd2f529-a788-4773-9a8c-142092b33954.png)

## JDK, JRE, and JVM

Java Development Kit (JDK) is a software development environment used for developing Java applications and applets.
It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed in Java development.

JRE stands for “Java Runtime Environment”. It provides the minimum requirements for executing a Java application; it consists of the Java Virtual Machine (JVM), core classes, and supporting files.

JVM is responsible for executing the java program line by line, hence it is also known as an interpreter.
![image](https://user-images.githubusercontent.com/56467938/211314614-bec45e86-532d-4139-abc8-9fcd3e2230b1.png)

## Important Notes:

- Java is case sensitive
- Java execution starts with main() method.
- main() method should have signature as `public static void main(String args[])`
- Precedence Table: https://www.programiz.com/java-programming/operator-precedence#:~:text=Associativity%20of%20Operators%20in%20Java,is%20assigned%20to%20variable%20b%20

## Run Java program using ternminal

1. Locate the file and make sure you are in the same folder in which file is located.
2. Run `javac File.java`. This will compile and create the bytecode of the program (.class)
3. After compiling the program, run `java File` command.
