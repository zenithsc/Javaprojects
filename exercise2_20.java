public class exercise2_20 {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            for (int j = 1; j <= 16-4*i; j++){ //Deals with making forwardslash pyramid
                System.out.print("/");
            }
            for (int k = 1; k <= 8*i; k++){ //Makes * pyramid
                System.out.print("*");
            }
            for (int l = 1; l <= 16-4*i; l++){ // makes backslash pyramid
                System.out.print("\\");
            }
            System.out.println();
        }

    }
}

