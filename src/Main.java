import java.util.Scanner;

public class Main {



     static void changeVarValue(int a){
         a = 89;
     }

     static void changeArrValue(int[] a) {
         a[0] = 90;
     }

    public static void main(String[] args) {

    // Case 1:
    int x = 10;
    changeVarValue(x);
    System.out.println("After passing x to the change Variable value: " + x); // 10

    // Case 2:
    int [] arr = {10,20,30,50} ;
    changeArrValue(arr);
        System.out.println("After passing arr to the change Array value: " + arr[0]); // 90


        /*
        Case 1: In this case, value dose not  change because the copy is passed.

        Case 2: In case of Array, the reference is passed. Hence arr in main method and a in changeArrValue method
        are pointing to same reference in memory location [ [I@edf4efb ].
         */

    }
}

/*
OUTPUT:






 */
