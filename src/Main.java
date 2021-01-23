import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
       * WAP which ask the user to enter his/her name and greets them with "Hello <name>, have a good day " text
       */

      Scanner userInput = new Scanner(System.in) ;
      System.out.println("Enter your name sir/mam: ");
      String name = userInput.next();
      System.out.println("Hello " + name + ", have a good day");

    }
}

