import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Data Type of Expressions & Increment / Decrement Operator
        /*
        1. byte + short -> int
        2. short + int -> int
        3. long + float -> float
        4. int + float -> float
        5. char + int -> int
        6. char + short -> int
        7. long + double -> double
        8. float + double -> double
         */
        float a = 6.54f + 6 ;
        System.out.println(a);

        // Increment and Decrement Operator
        int i = 56;
        System.out.println(i ++); // 56
        System.out.println(i); // 57
        System.out.println(++ i); // 58
        System.out.println(i --); // 58
        System.out.println(i); // 57
        System.out.println(-- i); // 56


    }
}

