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
      boolean b1 = input.hasNextByte(); // its use to check authenticity of variable
      System.out.println(b1);
      System.out.println("The age of user " + number); // 25

      String str = input.next() ; // its only pick one word
      String strLine = input.nextLine(); // it prints the sentences
      System.out.println(strLine);
    }
}

