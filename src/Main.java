import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*
     * Practice set question chapter - 4
     * */
       /*
       Question 2

       Algorithm :
       1. Take a marks from user
       2. Each subject should have grater than 40% and at least 33% to be passed
       3. If less than 33% then fail
        */

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your first subject marks:");
        byte subOne = sc.nextByte();
        System.out.println("Enter your second subject marks:");
        byte subTwo = sc.nextByte() ;
        System.out.println("Enter your third subject marks:");
        byte subThree = sc.nextByte() ;

        float avg = ( subOne + subTwo + subThree ) / 3.0f ;
        double total = subOne + subTwo + subThree ;
        double percentage = (total / 300) * 100 ;

        if (percentage > 40 && subOne > 33 && subTwo > 33 && subThree > 33) {
            System.out.println("Student is pass");
        } else {
            System.out.println("Student is fail");
        }
        System.out.format("Student percentage %.2f",percentage);
        System.out.println("\n");
        System.out.format("Total marks %.0f / 300",total);
    }
}

