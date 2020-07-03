import java.util.Scanner;

public class exercise3_21 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        processName(console);
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
