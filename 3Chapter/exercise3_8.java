public class exercise3_8 {
    public static void main(String[] args){
        quadratic(1, 3, 2);

    }
    public static void quadratic(int a, int b, int c){
        double bsquare = Math.pow(b, 2);
        double underrad = bsquare - 4*a*c;
        underrad = Math.sqrt(underrad);
        double positiveroot = (-1*b + underrad)/(2*a);  //Calculates -b + root
        double negativeroot = (-1*b - underrad)/(2*a);  //Calculates -b - root
        System.out.println("First root = "+ positiveroot); //Prints first root of quadratic
        System.out.println("Second root = "+ negativeroot); //Prints second root of quadratic
    }

}
