/*
Java Default Constructor
A constructor is called "Default Constructor" when it doesn't have any parameter.

Syntax of default constructor:
<class_name>(){}

Q) What is the purpose of a default constructor?

The default constructor is used to provide the default values to the object like 0, null, etc.,
depending on the type.

Example of default constructor that displays the default values

 */
class Students {
    String name;
    int rollNo;

    public Students(){} // Default Constructor

    public void display(){
        System.out.println("Student name : " + this.name);
        System.out.println("Student roll_no : " + this.rollNo);
    }


}
public class  Main {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.display();
        /*
        Student name : null
        Student roll_no : 0
        */
    }
}
