public class exercise2_10 {
    public static void main(String[] args){
        scrollline();
        numline();
    }
    public static void scrollline() {
        for (int i = 1; i <=6; i++){
            for (int j = 1; j <=9; j++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }
    public static void numline(){
        for (int k = 1; k <=6; k++) {
            for (int l = 1; l <=9; l++){
                System.out.print(l);
            }
            System.out.print("0");
        }
    }
}
