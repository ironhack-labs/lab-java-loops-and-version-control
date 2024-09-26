import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*System.out.println("Write your name: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello " + input);

        System.out.println("Whats your favorite number? ");
        int favoriteNumber = scanner.nextInt();
        if (favoriteNumber == 42) {
            System.out.println("That's my favorite number too!");
        } else if (favoriteNumber == 69) {
            System.out.println("I'm glad you like 69!");
        } else {
            System.out.println("That's not my favorite number...");
        }

        scanner.close();*/

        String fileName = "test.txt";
        FileWriter writer = new FileWriter(fileName, true);
/*        writer.write("Hello World!\n");
        writer.write("Having some dinner with maddie\n");*/
        String toText = "last line";
        System.out.println("The following data: " + toText + " was appended to " + fileName);
        writer.write(toText + "\n");
        writer.close();

        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
        fileScanner.close();
    }
}