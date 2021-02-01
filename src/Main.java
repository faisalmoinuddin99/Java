import java.util.Scanner;

public class Main {

    /*
    With Static keyword

    Theory: static keyword helps you to create and access the
    methods without creating any object of the class.

    . Which means you can directly call the method in main
    method.:
     */

    static int addition(int x, int y){
        return  x + y ;
    }

    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = addition(a,b);
        System.out.println(c); // 30


    }
}

/*
OUTPUT:






 */
