import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*
    for loop:

    . if you already know the number of iteration, you want to loop through then
    you use for loop
    . if you don't know the number of iteration in advance, then you use
    while loop

      */
//       for (int i = 1; i <= 10; i++){
//           System.out.println(i);
//       }

       // quiz print first n odd number
        /*
        2n = Even Number = 0, 2, 4, 6 ...
        2n + 1 = Odd Number = 1, 3, 5, 7 ...

         */
        System.out.println("Using if condition ");
        for(int i = 0; i <= 10; i++){
            if (i%2 != 0){
                System.out.print(i + " "); // 1 3 5 7 9
            }
        } // Alternative
        System.out.println("\n");
        System.out.println("Using direct formula ");
        for(int i = 0; i< 5; i++){
            System.out.print( 2 * i + 1 + " ");
        }

        // Decrementing for loop
        System.out.println("\n");
        System.out.println("Decrementing ");
        for (int i = 7; i!=0; i--){
            System.out.print(i + " ");
        }
    }

    /*
    TC: O(n)

    OUTPUT :

    Using if condition
    1 3 5 7 9

    Using direct formula
    1 3 5 7 9

    Decrementing
    7 6 5 4 3 2 1
     */
}

