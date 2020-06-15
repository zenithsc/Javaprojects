public class exercise2_9 {
    public static void main (String[] args){
        dashline();
        squinty();
        numline();
        dashline();
    }
    public static void dashline(){
        for (int i = 1;i <=40; i++ ){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void squinty(){
        for (int j = 1; j <=10; j++){
            for (int k = 1; k<=1; k++ ){
                System.out.print("_");
            }
            for (int l = 1; l<=1; l++){
                System.out.print("-");
            }
            for (int m = 1; m <=1; m++){
                System.out.print("^");
            }
            for (int l = 1; l<=1; l++) {
                System.out.print("-");
            }

        }
        System.out.println();
    }
    public static void numline(){
        for (int n = 1; n <= 2; n++){
            for (int o = 1; o <= 9; o++){
                for (int p = 1; p<=2; p++){
                    System.out.print(o);
                }
            }
            System.out.print("00");
        }
        System.out.println();
    }
}
