import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
       * WAP to detect whether a number entered by the user is integer or not
       */

    Scanner input = new Scanner(System.in) ;
      System.out.println("User please enter something: ");
    boolean isInteger = input.hasNextInt() ;
      System.out.println("Its integer ?");
    System.out.println("Analyzing ....");
      System.out.println(isInteger);


    }
}

