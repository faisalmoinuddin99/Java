import java.util.Scanner;

public class Main {

    /*
    Method Overloading

    . Two or more methods can have same name but different parameters.
    .  Ek he naam but kaam alag alag
     */
    static void foo(){
        System.out.println("I drive a car");
    }

    // Error : method foo() is already defined in class Main
    static String foo(){
        return  "I drive a car" ;
    }
    /*
    Note : Method overloading cannot be performed by changing he return type of the method.
     */

    static void foo(int x){
        System.out.println("I had fly " + x + " planes");
    }

    static void foo(String name, int x){
        System.out.println("Love you " +  name + " " + x);
    }

    public static void main(String[] args) {

    foo(); // I drive a car
    foo(10); // I had fly 10 planes
    foo("Ben",3000); // Love you Ben 3000
    }
}

/*

Arguments are actual
. eg foo(10) -> here 10 is an argument
. eg foo(int x) -> here int x is a parameter
 */
