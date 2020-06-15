public class exercise2_3 {
    public static void main(String[] args){
        int num1 =1;
        int num2 = 1;
        for (int i = 1; i <= 12; ++i) {
            System.out.print(num1+" ");
            int numsum = num1 + num2;
            num1 = num2;
            num2 = numsum;
        }
    }
}
