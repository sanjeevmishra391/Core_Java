// file handling
// means reading and writing data into the files.

// package:
import java.io.*;

public class Class21 {
    public static void main(String[] args) {
        File f = new File("C:/data");

        System.out.println("File exists? : " + f.exists());
        String name = f.getName();
        System.out.println("Name: " + name);
        String path = f.getPath();
        System.out.println("Path: " + path);
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Can Write? : " + f.canWrite());
        System.out.println("Can Read? : " + f.canRead());
        System.out.println("Directory? : " + f.isDirectory());
        System.out.println("File? : " + f.isFile());
        System.out.println("Last modified: " + f.lastModified());
        System.out.println("File size: " + f.length()); // in terms of bytes

    }
}
