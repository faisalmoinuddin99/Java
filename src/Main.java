import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Practice Set 5

TODO:
    sum of first n even number:
    even number = 0, 2, 4, 6, 8, ....
    sum = 2+4+6+8 = 20
 */
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:");
        int number = sc.nextInt() ;
        int evenNumber = 0;
        int sum = 0 ;
        System.out.println("Even Number:");
        for (int i = 0; i < number; i++){
            if ( i % 2 == 0 ){
                evenNumber =  i;
                System.out.print(evenNumber + " ");
                sum += evenNumber ;

            }
        }
        System.out.print("\n");
        System.out.println("Sum: " + sum);
    }
}

/*
OUTPUT:

Enter the number: 10
Even Number:
0 2 4 6 8
Sum: 20

 */
