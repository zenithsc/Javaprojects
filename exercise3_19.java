public class exercise3_19 {
    public static void main (String[] args){
        printReverse("whats up");
    }
    public static void printReverse (String s1){
        int s1length = s1.length();
        for (int i = s1length - 1; i > 0; i--){     //Setting i to final character and reducing until first character
            System.out.print(s1.charAt(i));
        }
    }
}
