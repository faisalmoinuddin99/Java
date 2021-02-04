import java.util.Scanner;

public class Main {
    /*
   Write a recursive function to find fibonacci series
   0, 1, 1, 2, 3, 5, 8, 13, 21, 34

     */
    static  int fib(int n) {
//        if (n==1){
//            return 0;
//        }else if(n==2){
//            return 1;
//        }
        if (n==1 || n==2){
            return n-1; // here if n = 1 then 1-1 = 0 OR n = 2 then n-1 = 2 - 1 = 1
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {

        int result = fib(5);
        System.out.println(result); // 3


    }

}

/*

OUTPUT :

*
**
***
****


 */
