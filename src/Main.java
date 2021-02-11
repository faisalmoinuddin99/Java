/*
Java Parameterized Constructor
A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects.
However, you can provide the same values also.

Example of parameterized constructor
In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.
 */

class Students {
    int id ;
    String name ;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
//        System.out.println(this.id + " " + this.name);
    }

    public void displayStudentsDetails(){
        System.out.println(this.id + " " + this.name);
    }

}

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students(1,"faisal" );
        Students s2 = new Students(2,"Rahul") ;

        s1.displayStudentsDetails();
        s2.displayStudentsDetails();

        /*
        1 faisal
        2 Rahul
         */
    }
}