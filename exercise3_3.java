public class exercise3_3 {
    public static void main (String[] args){
        printPowersOfN(5,6);


    }
    public static void printPowersOfN(int n, int x){
        for (int i = 0; i <= x; i++){
            double y = Math.pow(n,i);
            int z = (int)(y);
            System.out.print(z + " ");  //Prints x powers of number n
        }
        System.out.println();

    }
}
