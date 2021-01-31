import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Chapter 6:  Arrays is a collection of similar type of data
 */

        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 70 ;
        marks[4] = 80;
        marks[5] = 60 ; // Index 5 out of bounds for length 5

        System.out.println(marks[2]); // 0
        System.out.println(marks[1]); // 70
       // System.out.println(marks[5]);  Index 5 out of bounds for length 5

    }

}

