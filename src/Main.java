import java.util.Scanner;

public class Main {

    static int Factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }

    static int Factorial_Iterative(int n){
        int product = 1;
        if (n==0 || n==1){
            return 1;
        }else{

            for (int i = 1; i <= n; i++){
                product *= i;
            }
        }
        return product ;
    }
    public static void main(String[] args) {
        /*
        Factorial(5) = 5 * 4 * 3 * 2 * 1
        Factorial(n) = n * n - 1 ... 2 * 1

        Formula : n * Factorial(n-1)
         */
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number :");
        int input = sc.nextInt() ;

        System.out.print("Factorial : " + Factorial(input));
        System.out.print("\n");
        System.out.print("Factorial_Iterative: " + Factorial_Iterative(input) );
    }

}




/*

OUTPUT :

Enter the number :5
Factorial : 120
Factorial_Iterative: 120
 */
