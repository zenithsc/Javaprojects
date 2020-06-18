public class exercise2_16 {
    public static void main(String[] args){
        for (int i =0; i<6; i++){
            for (int j = 1; j<= 2*i; j++){
                System.out.print("\\");
            }
            for (int k = 1; k <= 22-4*i; k++){
                System.out.print("!");
            }
            for (int j = 1; j<= 2*i; j++) {
                System.out.print("/");
            }
            System.out.println();
        }

    }
}
