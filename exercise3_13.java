public class exercise3_13 {
    public static void main (String[] args){
        pay(4.00, 11);
    }
    public static double pay (double salary, int hours){
        if (hours > 8){ //Want to determine if hours are overtime or not
            int overtime = hours - 8;   //Finds number of overtime hours
            double payment = salary*8 + (1.5)*salary*overtime;
            System.out.println(payment);
            return payment;

        }
        else{
            double payment = salary * hours;    //Finds pay by wage * hours
            System.out.println(payment);
            return payment;
        }
    }
}
