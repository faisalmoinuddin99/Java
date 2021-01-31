import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*
     Quiz:  Traversing array element in reverse order
        */

        int[] marks = {10,20,30,405,60,708,45,34} ;
        for (int  i = marks.length - 1; i>=0; i--){
            System.out.print(marks[i] + " ");
        }
    }
}

