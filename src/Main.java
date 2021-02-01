import java.util.Scanner;

public class Main {

    /*
    Without Static keyword

    Theory: if you don't make your methods with static keyword, then for accessing
    that method in main you have to create an object of your class and then you can
    call that method.
     */

     int addition(int x, int y){
        return  x + y ;
    }

    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    Main obj = new Main();
    int c = obj.addition(a,b);
        System.out.println(c); // 30


    }
}

/*
OUTPUT:






 */
