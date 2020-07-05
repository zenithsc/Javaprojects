public class exercise3_2 {
    public static void main (String[] args){
        printPowersOf2(3);
        printPowersOf2(10);


    }
    public static void printPowersOf2(int x){
        for (int i = 0; i <= x; i++){
            double y = Math.pow(2,i);
            int z = (int)(y);
            System.out.print(z + " ");
        }
        System.out.println();

    }
}
