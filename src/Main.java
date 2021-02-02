import java.util.Scanner;

public class Main {

    /*
        Variable Argument (VarArgs)

     */
//    static int sum(int a, int b) {
//        return a + b;
//    }
//
//    static int sum(int a, int b, int c){
//        return a + b + c ;
//    }
//
//    static int sum(int a, int b, int c, int d){
//        return a + b + c + d ;
//    }
    /*
    Instead of creating lots of overloaded function, you can use VarArgs, refer below example
     */

    static int sum(int ...arg){
        // here ...arg is something like this int [] arg
        int result = 0;
        for(int a : arg){
            result += a;
        }
        return  result ;
    }
    public static void main(String[] args) {

        System.out.println("Sum of 1 and 2 is: " + sum(1,2));
        System.out.println("Sum of 1, 2 and 3 is: " + sum(1,2,3));
        System.out.println("Sum of 1, 2, 3, and 4 is: " + sum(1,2,3,4));
    }

    }


/*
OUTPUT:
Sum of 1 and 2 is: 3
Sum of 1, 2 and 3 is: 6
Sum of 1, 2, 3, and 4 is: 10

 */
