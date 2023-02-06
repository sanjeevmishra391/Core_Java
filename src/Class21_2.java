// Stream: a sequence of data

// TYPES OF STREAMS :
// 1. Input Stream:
// 1.a: AudioInputStream
// 1.b: ByteArrayInputStream
// 1.c: FileInputStream
// 1.d: StringBufferInputStream
// 1.e: ObjectInputStream

// 2. Output Stream:
// 2.a: DataOutputStream
// 2.b: ByteArrayOutputStream
// 2.c: FileOutputStream
// 2.d: StringBufferOutputStream
// 2.e: ObjectOutputStream
// 2.f: PrintStream

// File operations: 
// Create a file
// Read from a file
// Write to a file
// Delete a file

import java.io.*;
import java.util.Scanner;

public class Class21_2 {
    public static void main(String[] args) {
        try {
            File f = new File("C:/data/ip.txt");

            // creating a file
            if (f.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }

            // reading the file
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                System.out.print("Line: ");
                System.out.println(reader.nextLine());
            }

            // writing to a file
            FileWriter writer = new FileWriter(f, true);
            // if append is true then newdata will be added to the end of file.
            // if append is false then newdata overwrites the file
            writer.write("Writing to the ip file.\n");

            writer.close();
            reader.close();

            // deleting a file.
            if (f.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File could not be deleted.");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
