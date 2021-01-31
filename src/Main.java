import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    write a program to find out whether a given integer is present in an array or not
     */
        Scanner sc = new Scanner(System.in);
        int[] myArrayList = {30,40,50};
        boolean isPresent = false ;
        System.out.print("Enter the number: ");
        int userInput = sc.nextInt() ;
        for(int i : myArrayList){
            if(i == userInput) {
               isPresent = true ;

            }
        }
        if (isPresent){
            System.out.println("Yes, present");
        } else {
            System.out.println("No, not present");
        }

    }
}

/*
OUTPUT: Enter the number: 30
Yes, present

 */
