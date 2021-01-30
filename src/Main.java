import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Practice Set 5

TODO:
    Find the factorial of given number

    n = 5
    5 * 4 * 3 * 2 * 1 = 120
 */
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:");
        int number = sc.nextInt() ;
        int fact = 1;
        for (int i = number; i>=1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

/*
OUTPUT:

Enter the number:5
120

 */
