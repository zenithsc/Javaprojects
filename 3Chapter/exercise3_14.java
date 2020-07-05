public class exercise3_14 {
    public static void main (String[] args){
        cylinderSurfaceArea(3.0, 4.5);
    }
    public static double cylinderSurfaceArea(double radius, double height){
        double radsquared = Math.pow(radius, 2);
        double surfacearea = 2*Math.PI*radsquared + 2*Math.PI*radius*height; //Plugging all values into SA Cylinder formula
        System.out.println(surfacearea);
        return surfacearea;
    }
}
