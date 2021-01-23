import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
       * Taking input from user
       * Store the value in a variable
       */
      Scanner input = new Scanner(System.in) ; // Scanner class
      System.out.println("Enter the age of user");
      byte number = input.nextByte() ; // 25
      System.out.println("The age of user " + number); // 25
    }
}

