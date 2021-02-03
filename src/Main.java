import java.util.Scanner;

public class Main {
    /*
   Write a program using function to print the following
   pattern

   *
   **
   ***
   ****

     */

    static void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
    printPattern(4);
    }

}

/*

OUTPUT :

*
**
***
****


 */
