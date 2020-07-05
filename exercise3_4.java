public class exercise3_4 {
    public static void main(String[] args){
        printSquare(1,5);

    }
    public static void printSquare(int min, int max){
        int diff = max-min;
        for (int j = 0; j <= diff; j++){
            for (int i = j; i <= diff; i++){
                int x = i + min;
                System.out.print(x);    //Prints interior pyramid of numbers
            }
            for (int k = 0; k < j;k++ ){
                int x = k + min;
                System.out.print(x);    //Prints exterior pyramid of numbers
            }
            System.out.println();
        }



    }
}
