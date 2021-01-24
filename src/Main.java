import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Precedence and Associativity

        int a = 6 * 4 + 10 / 5 ;
        /*
        highest Precedence goes to * and /. They are then evaluated on the basis of left to right
        Associativity
        6 * 4 = 24 + 10 / 5
        10 / 5 = 2
        24 + 2
        = 26
         */
        System.out.println(a); // 26

        int b = 60 / 5 - 34 * 2 ;
        /*
        12 - 34 * 2
        = 12 - 68
        = -56
         */
        System.out.println(b); // -56

    }
}

