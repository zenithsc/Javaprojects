public class exercise3_16 {
    public static void main (String[] args){
        triangleArea(8, 5.2, 7.1);
    }
    public static double triangleArea(double a, double b, double c){
        double s = (a+b+c)/2; //Determine S
        double area = s*(s-a)*(s-b)*(s-c); //Finding area using Heron's formula
        area = Math.sqrt(area);
        System.out.println(area);
        return area;
    }
}
