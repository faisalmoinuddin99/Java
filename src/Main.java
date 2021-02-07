

 class Employee {
    int id ;
    String name ;
    int salary;

    public void printDetails(){
        System.out.println("My id number is : " + id);
        System.out.println("My name is : " + name);
    }
    public void getSalary(){
        System.out.format("%s salary is %dk",name,salary);
    }
}
public class Main {

    public static void main(String[] args) {

        System.out.println("Custom Class ");
        Employee faisal = new Employee(); // Instantiating a new Employee Object
        Employee jhon = new Employee() ;
        // Setting Attribute
        faisal.id = 124;
        faisal.name = "Faisal";

        jhon.id = 13;
        jhon.name = "Jhon Khandelwal" ;
        jhon.salary = 50 ;
        // Printing Attribute
//        System.out.println(faisal.id + " " + faisal.name );
        faisal.printDetails();
        jhon.printDetails();
        jhon.getSalary();

        /*
        Custom Class
My id number is : 124
My name is : Faisal
My id number is : 13
My name is : Jhon Khandelwal
Jhon Khandelwal salary is 50k
         */

    }

}
