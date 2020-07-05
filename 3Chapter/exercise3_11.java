public class exercise3_11 {
    public static void main (String[] args){
        distance(1,0,4,4);

    }
    public static double distance(int x1, int y1, int x2, int y2){
        double xdiff = x2-x1;
        xdiff = Math.pow(xdiff,2);  //Squares difference of x
        double ydiff = y2-y1;
        ydiff = Math.pow(ydiff, 2); //Squares difference of y
        double dist = xdiff + ydiff;    //x^2 + y^2
        dist = Math.sqrt(dist);     //Squarerroot of x^2 + y^2
        //System.out.println(dist);
        return dist;
    }
}
