import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Precedence and Associativity

       /*
       How will you write the following expressions in Java ?

       x-y / 2, b ^2 - 4 a c / 2 a, v^2 - u^2, a * b - d
        */

        double x = 3 ;
        double y = 6 ;
        double questionOne = (x - y) / 2 ;
        System.out.println(questionOne);

        double b = 6 ;
        double a = 3 ;
        double c = 7 ;
        double questionTwo = (Math.pow(b,2) - 4 * a * c ) / 2 * a ;
        System.out.println(questionTwo);

        double v = 45 ;
        double u = 89 ;
        double questionThree = (Math.pow(v,2) - Math.pow(u,2)) ;
        System.out.println(questionThree);

        double d = 7 ;
        double questionFour = a * b - d ;
        System.out.println(questionFour);
    }
}

