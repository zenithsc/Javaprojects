public class exercise3_7 {
    public static void main(String [] args){

    }
    public static int largestAbsVal(int x, int y, int z){
        x = Math.abs(x);
        y = Math.abs(y);
        z = Math.abs(z);
        if (x >= y && x >= z){
            return x;
        }
        else if(y >= z && y >= x){
            return y;
        }
        else {
            return z;
        }

    }
}
