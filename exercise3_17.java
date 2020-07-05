public class exercise3_17 {
    public static void main (String[] args){
        padString("hello", 6);
    }
    public static String padString(String s1, int length){
        int s1length = s1.length();
        if (s1length < length){     //Checks if there needs to be space padding to add to string to maintain intended length
            int diff = length - s1length;
            String s2 = "";     //creating a new string to hold spaces
            for (int i = 0; i < diff; i++){     //limits number of spaces to difference between intended length
                s2 = s2 + " ";                  //and the string input
            }
            System.out.println(s2 + s1);
            return s2 + s1;

        }
        else{
            System.out.println(s1);
            return s1;
        }
    }
}
