

public class Main {
    public static void main(String[] args) {

        // Break and Continue using loop
        for(int i = 0; i<=5; i++) {
           if(i == 2) {
               System.out.println("Ending loop");
               continue;
           }
            System.out.println(i);
            System.out.println("Java is great");
        }

    }
}

/*
OUTPUT:
0
Java is great
1
Java is great
Ending loop
3
Java is great
4
Java is great
5
Java is great
 */

