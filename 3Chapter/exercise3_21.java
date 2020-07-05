import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class exercise3_21 {
    public static void main(String[] args){
        //Scanner console = new Scanner(System.in);
        //Scanner console = new Scanner("Surya Cidambi\n");
        Path source = Paths.get("C:\\Temp\\Input1.txt");
        try (Scanner console = new Scanner(source)) {
            processName(console);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void processName(Scanner console){
        System.out.print("Please enter your full name: ");
        String s1 = console.nextLine();

        int index = s1.indexOf(" ");
        System.out.print("Your name in reverse order is ");
        int length = s1.length();
        for (int i = index; i < length; i++) {
            System.out.print(s1.charAt(i));
        }
        System.out.print(", ");
        for (int i = 0; i < index; i++) {
            System.out.print(s1.charAt(i));
        }


    }
}
