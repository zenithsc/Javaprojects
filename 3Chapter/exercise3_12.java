public class exercise3_12 {
    public static void main (String[] args){
        scientific(6.23,5.0);
    }
    public static double scientific(double decimal, double power){
        double pow = Math.pow(10, power);   //finding 10^power multiplier
        double scinote = decimal * pow;     //multiplying decimal by multiplier to get desired scientific notation
        //System.out.println(scinote);
        return scinote;
    }
}
