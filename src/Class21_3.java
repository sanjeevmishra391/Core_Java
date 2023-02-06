import java.util.Scanner;
import java.io.*;

public class Class21_3 {
    public static void main(String[] args) {
        try {
            File f = new File("C:/data/ouput.txt");

            // creates a new file
            if (f.createNewFile()) {
                System.out.println("File was created");
            } else {
                System.out.println("File already exists");
            }

            Scanner console = new Scanner(System.in);
            String line = console.nextLine();

            FileWriter writer = new FileWriter(f, true);
            writer.write(line + "\n");

            System.out.println("Data is stored.");

            console.close();
            writer.close();

            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
