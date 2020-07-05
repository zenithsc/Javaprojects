public class exercise3_5 {
    public static void main (String[] args){
        printGrid(3,6);

    }
    public static void printGrid(int rows, int cols){
        for (int startnum = 1; startnum <=rows; startnum++){ //Establishes number of rows
            for (int i =  0; i <cols-1; i++){   //Establishes length of print
                int x = startnum + rows*i;
                System.out.print(x + ", ");     //Prints all digits except last of the row with commas
            }
            System.out.print(startnum+(cols-1)*rows);   //Prints last digits of row
            System.out.println();
        }

    }
}
