import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Practice Set 5

TODO:
    sum of first n even number using while


 */
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:");
        int number = sc.nextInt() ;
        int i = 0;
        int sum = 0;
        while(i <= number){
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i ;
            }
            i++;
        }
        System.out.print("\n");
        System.out.println("Sum: "+sum);
    }
}

/*
OUTPUT:

Enter the number:7
0 2 4 6
Sum: 12
 */
