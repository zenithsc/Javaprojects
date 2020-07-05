public class exercise3_10 {
    public static void main(String[] args){
        area(2.0);

    }
    public static double area(double rad){
        double radsquare = Math.pow(rad, 2); //squaring radius
        double a = Math.PI*radsquare;       //calculating area = pi*r^2
        //System.out.println(a);   //To test output
        return a;
    }
}
