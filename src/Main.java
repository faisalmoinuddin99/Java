/*
GUESS THE NUMBER GAME :


Create a class game, which allows a user to play " Guess the Number "
game once. Game should have a following methods :

1. Constructor to generate the random number.
2. takeUserInput() to take a user input of a number
3. isCorrectNumber() to detect whether the number entered by the
   user is true.
4. getter and setter for noOfGuesses

use properties such as noOfGuesses(int), etc to get this task done !
 */

import java.util.Random;
import java.util.Scanner;

class Game {
    private int randNumber;

    Game(){
        Random rand = new Random();
        this.randNumber = rand.nextInt(11);
        System.out.println(randNumber);
    }
    public void findNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");
        int userInput = sc.nextInt();
        if (userInput == this.randNumber){
            System.out.println("win");
        }else{
            System.out.println("loss");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.findNumber();
    }
}