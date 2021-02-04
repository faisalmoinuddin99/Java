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

static int sumRec(int n){
    if(n == 1){
        return 1;
    }else{
        return n + sum(n-1);
    }
}
/*
sum(n) = n + sum(n-1)
sum(3) = 3 + sum(2)
sum(3) = 3 + 2 + sum(1)
sum(3) = 3 + 2 + 1
 */

    public static void main(String[] args) {
    int x = sum(3);
        System.out.println("Sum : " + x);

        int y = sumRec(4);
        System.out.println("Sum Rec: " + y);
    }

}

/*

OUTPUT :

*
**
***
****


 */
