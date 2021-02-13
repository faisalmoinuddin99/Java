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
    private final int randNumber;
    private int noOfGuesses;

    Game(){
        Random rand = new Random();
        this.randNumber = rand.nextInt(11);
//        System.out.println(randNumber);
    }

    public boolean isCorrectNumber(int userInput){
        return userInput == this.randNumber;
    }

    public void takeUserInput(){

        gameLogic();

    }
    public void runGame(){

        takeUserInput();
    }
    public void checkUserInput(int userInput){
        if (userInput > this.randNumber){
            System.out.println("You Entered greater number");
        } else if(userInput < this.randNumber){
            System.out.println("You Entered the less number");
        } else{
            System.out.println("Success ");
        }
    }

    public void gameLogic(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Guess the number:");
            int userInput = sc.nextInt();
            boolean isTrue = false;


            isTrue = isCorrectNumber(userInput);

//            System.out.println(isTrue);

            checkUserInput(userInput);
            if (!isTrue) {
                noOfGuesses += 1;

            } else {
                System.out.println("Number of Guesses: " + noOfGuesses);
                break;
            }
        }
    }




}

public class Main {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.runGame();
    }
}

/*
Guess the number:
4
You Entered the less number
Guess the number:
5
You Entered the less number
Guess the number:
8
You Entered the less number
Guess the number:
9
You Entered the less number
Guess the number:
10
Success
Number of Guesses: 4
 */