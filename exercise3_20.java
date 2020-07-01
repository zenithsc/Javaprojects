import java.util.*;
public class exercise3_20 {
    public static void main(String[] args){


    }
    public static void inputBirthday(){
        Scanner console = new Scanner(System.in);
        System.out.println("What month were you born in? ");
        String month = console.nextLine();
        System.out.println("What day are you born on? ");
        int date = console.nextInt();
        System.out.println("What year were you born in? ");
        int year = console.nextInt();
        System.out.println("You were born on " + month + " " + date + "," + year + ". You're old!" );
    }

}
