

public class Main {
    public static void main(String[] args) {

        // Break and Continue using loop
        for(int i = 0; i<=5; i++){
            System.out.println("Inside for loop "+i);
           if (i == 2){
               System.out.println("Inside if statement "+i);
               System.out.println("Ending the loop");
               break;
           }
        }
    }
}

/*
OUTPUT:
Inside for loop 0
Inside for loop 1
Inside for loop 2
Inside if statement 2
Ending the loop
 */

