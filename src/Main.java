import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
       switch control Instruction

       used to give user a choice
        */

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your age:");
        byte age = sc.nextByte();

        switch (age){
            case 18 :
                System.out.println("You are becoming adult");
                break;
            case 23 :
                System.out.println("Got your first job");
                break ;
            case 30 :
                System.out.println("marrying someone");
                break ;
            case 35 :
                System.out.println("becoming father");
                break;
            default:
                System.out.println("Live life happily");
        }
        System.out.println("Thanks for using my java code");

        /*
        Enhance Switch

        switch(age) {
        case 18 -> {
         System.out.println("Got your first job");
         System.out.println("Driving");
        }
        case 23 -> System.out.println("Got your first date");
        case 60 -> System.out.println("Got your retired");
        default -> System.out.println("Enjoy your life);


        }
         */
    }
}

