public class exercise3_18 {
    public static void main (String[] args){
        vertical("whats up");
    }
    public static void vertical (String s1){
        int s1length = s1.length();
        for (int i = 0; i < s1length; i++){     //setting i limit to length of string
            System.out.println(s1.charAt(i));   //printing each character on separate lines
        }
    }
}
