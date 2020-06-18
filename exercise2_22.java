public class exercise2_22 {
    public static void main (String[] args){
        for (int i = 0; i<7; i++){
            for (int j = 1; j <= 2*i; j++){ //Prints outer star layer
                System.out.print("*");
            }
            for (int k = 1; k <= 7-i; k++){ //Prints left side dollar layer
                System.out.print("$");
            }
            for (int l = 1; l <= 14-2*i; l++){ //Prints interior star layer
                System.out.print("*");
            }
            for (int m = 1; m <= 7-i; m++) { //Prints right side dollar layer
                System.out.print("$");
            }
            for (int j = 1; j <= 2*i; j++){ //Prints outer star layer
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
