import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(ANSI_RED+"1.1 First Task"+ANSI_RESET); /////////////////// 1_1  ///////////////////////

        int intArray [] = new int[] {1,2,3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        char [] charArray = new char [6];
            charArray[0] = 'h';
            charArray[1] = 'e';
            charArray[2] = 'l';
            charArray[3] = 'l';
            charArray[4] = 'o';
            charArray[5] = 'w';

        System.out.println(ANSI_RED+"1.2 Second Task"+ANSI_RESET); ////////////////// 1_2 /////////////////

        for (int i=0; i<intArray.length;i++) {
            System.out.print(intArray[i]+ ((i== intArray.length-1)? "\n":","));
        }
        for (int i =0;i<doubleArray.length;i++) {
            System.out.print(doubleArray[i]+((i==doubleArray.length-1)? "\n":","));
        }
        for (char c: charArray) {
            System.out.print(c+",");
        }
        System.out.println("\b");

        System.out.println(ANSI_RED+"1.3 Third Task"+ANSI_RESET); /////////////////// 1_3 /////////////////

        for (int i=intArray.length-1; i>=0;) {
            System.out.print(intArray[i]+ ((i--== 0)? "\n":","));
        }
        for (int i =doubleArray.length-1;i!=-1;i--) {
            System.out.print(doubleArray[i]+((i==0)? "\n":","));
        }
        for(int i = charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]+((i==0)?"\n":","));
        }

        System.out.println(ANSI_RED+"1.4 Fourth Task"+ANSI_RESET); ////////////////// 1_4 /////////////////


    }
}