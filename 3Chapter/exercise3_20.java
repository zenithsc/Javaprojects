import java.util.*;
public class exercise3_20 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        inputBirthday(console);


    }
    public static void inputBirthday(Scanner console){
        System.out.print("On what day of the month were you born? ");
        int date = console.nextInt();
        System.out.print("What is the name of the month in which you were born? ");
        String month = console.next();
        System.out.print("During what year were you born? ");
        int year = console.nextInt();
        System.out.print("You were born on " + month + " " + date + ", " + year + ". You're mighty old!" );
    }

}
