import java.util.Scanner;

public class exercise3_22 {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        CollegeAdmit(console);

    }
    public static void CollegeAdmit(Scanner console){
        System.out.println("University Admission Program");
        System.out.print("What is your GPA? ");
        double gpa = console.nextDouble();
        System.out.print("What is your SAT Score? ");
        int sat = console.nextInt();
        if (gpa < 1.8 && sat < 900){        //Because output can only be 1 line, have to specify that if both are too low, then to print that gpa is too low
            System.out.println("Your GPA is too low.");
        }
        else if (gpa < 1.8 && sat >= 900){
            System.out.println("Your GPA is too low.");
        }
        else if (sat < 900 && gpa > 1.8){
            System.out.println("Your SAT score is too low.");
        }
        else {
            System.out.println("You were accepted!");
        }
    }
}
