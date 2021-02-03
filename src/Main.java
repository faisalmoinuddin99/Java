import java.util.Scanner;

public class Main {
    /*
   Write a recursive function to calculate sum of first n natural number

     */
static int sum(int n){

    if (n != 0) // termination condition
        return n + sum(n-1); // Recursion
     else {
        return  n; // Back Track
    }

}


    public static void main(String[] args) {
    int x = sum(3);
        System.out.println("Sum : " + x);
    }

}

/*

OUTPUT :

*
**
***
****


 */
