public class exercise2_17 {
    public static final int size = 4;
    public static void main(String[] args){

        for (int i =0; i<size; i++){
            for (int j = 1; j<= 2*i; j++){
                System.out.print("\\");
            }
            for (int k = 1; k <= (4*size-2)-4*i; k++){
                System.out.print("!");
            }
            for (int j = 1; j<= 2*i; j++) {
                System.out.print("/");
            }
            System.out.println();
        }

    }
}
