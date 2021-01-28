import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /* todo: 1. Notations
                    0 = Rock
                    1 = Paper
                    2 = Scissors
      */
        Scanner userInput = new Scanner(System.in) ;

        System.out.println("RPS Arena Airoli ;) ");
        System.out.print("Please enter your name: ");
        String name = userInput.next() ;
        System.out.format("Welcome %s in this arena :)", name);
        System.out.println("\n");
        int gameCount = 0;
        boolean gameOver = true ;
        while (gameOver) {

            System.out.println("Main menu :");
            System.out.println("0 - Rock");
            System.out.println("1 - Paper");
            System.out.println("2 - Scissor");

        /*
        User's Chance
         */
            System.out.println("Enter your choice :");
            short gameInput = userInput.nextShort();

            if (gameInput > 2) {
                System.out.println("Invalid number");

            }

        /*
        Computer's Chance
         */
            int min = 0;
            int max = 2;
            //Generate random int value from 0 to 2

            int computerRandomChoice = (int) (Math.random() * (max - min + 1) + min);
        /*
        Game Logic
         */

            if (computerRandomChoice == 0 && gameInput == 2) {
                System.out.println("Rock beats Scissor");
                System.out.println("Computer win");
            } else if (computerRandomChoice == 2 && gameInput == 1) {
                System.out.println("Scissor beats Paper");
                System.out.println("Computer win");
            } else if (computerRandomChoice == 1 && gameInput == 0) {
                System.out.println("Paper beats Rock");
                System.out.println("Computer win");
            } else if (gameInput == 0 && computerRandomChoice == 2) {
                System.out.println("Rock beats Scissor");
                System.out.println("User win");
            } else if (gameInput == 2 && computerRandomChoice == 1) {
                System.out.println("Scissor beats Paper");
                System.out.println("User win");
            } else if (gameInput == 1 && computerRandomChoice == 0) {
                System.out.println("Paper beats Rock");
                System.out.println("User win");
            } else {
                System.out.println("Tie");
            }
            gameCount ++ ;
            if (gameCount == 3) {
                break;
            }
        }
    }
}

