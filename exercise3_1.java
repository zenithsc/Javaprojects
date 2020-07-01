public class exercise3_1 {
    public static void main (String[] args){
        printNumbers(15);
        printNumbers(5);

    }
    public static void printNumbers(int x){
        for (int i = 1; i <= x; i++){
            System.out.print("["+ i + "] ");
            //System.out.print(i);
            //System.out.print("] ");
        }
        System.out.println();
    }
}
