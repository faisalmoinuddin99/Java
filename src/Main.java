import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
       * WAP to convert kilometer to miles:
       *
       *  Algorithm :
       *  step1 : Take a kilometer value from user
       *  step2 : multiple kilometer value with 0.62
       *  step3 : Display the result
       *
       * Note: 1 kilometer = 0.62 miles
       */

      Scanner input = new Scanner(System.in) ;
      System.out.print("Kilometer: ");
      double kilometer = input.nextDouble() ;

      double miles = kilometer * 0.62 ;
      System.out.println(miles + " mi");



    }
}

