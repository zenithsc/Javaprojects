public class exercise3_6 {
    public static void main (String [] args){
        largerAbsVal(11,2);
    }
    public static int largerAbsVal(int x, int y){
        x = Math.abs(x);
        y = Math.abs(y);
        if (x > y){
            return x;

        }
        else{
            return y;
        }
    }
}
