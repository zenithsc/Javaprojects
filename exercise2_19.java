public class exercise2_19 {
    public static final int size = 1;
    public static void main (String[] args){
        plusequals();
        windowpanes();
        plusequals();
        windowpanes();
        plusequals();

    }
    public static void plusequals(){
        for (int i =1; i<=2; i++){
            for (int j = 1; j<2; j++){
                System.out.print("+");
            }
            for (int k = 1; k<=size; k++){
                System.out.print("=");
            }
        }
        System.out.print("+");
        System.out.println();
    }
    public static void windowpanes(){
        for (int l = 1; l <=size; l++) {
            for (int m = 1; m < 3; m++) {
                for (int n = 1; n < 2; n++) {
                    System.out.print("|");
                }
                for (int o = 1; o <= size; o++) {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
