public class exercise3_9 {
    public static void main(String[] args){
        lastDigit(123);
    }
    public static int lastDigit(int x){
        x = Math.abs(x);    //gets rid of negative if its there
        int lastone = x %10; //finds last digit by taking remainder of mod 10
        //System.out.println(lastone);
        return lastone;
    }
}
