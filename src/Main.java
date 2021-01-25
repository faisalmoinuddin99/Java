import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Chapter 4 :

        Relational and Logical Operator

        ==, >=, <=, >, <, !=

        &&, ||, !
         */

        // AND Operator ( && )
        boolean x1 = true ;
        boolean y1 = false ;

        boolean x2 = true ;
        boolean y2 = true ;

        boolean x3 = false ;
        boolean y3 = true ;

        boolean x4 = false ;
        boolean y4 = false ;

        System.out.println(x1 && y1); // false
        System.out.println(x2 && y2); // true
        System.out.println(x3 && y3); // false
        System.out.println(x4 && y4); // false

//         OR Opeator ( || )

        System.out.println(x1 || y1); // true
        System.out.println(x2 || y2); // true
        System.out.println(x3 || y3); // true
        System.out.println(x4 || y4); // false

        // NOT Operator (!)

        System.out.println(!x1); // false
        System.out.println(!x2); // false
        System.out.println(!x3);// true
        System.out.println(!x4); // true

        System.out.println(!y1); // true
        System.out.println(!y2); // true
        System.out.println(!y3); // false
        System.out.println(!y4); // true


    }
}

