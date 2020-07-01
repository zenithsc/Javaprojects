public class exercise3_15 {
    public static void main (String [] args){
        sphereVolume(2.0);
    }
    public static double sphereVolume(double radius){
        double radiuscubed = Math.pow(radius, 3);
        double volume = (4)*Math.PI*radiuscubed/3;//Sphere volume formula
        System.out.println(volume);
        return volume;
    }
}
