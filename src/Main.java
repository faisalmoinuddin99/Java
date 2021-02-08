 /*
 Practice Set
  */
 class Employee {
     // properties
     String name;
     int salary ;

     // methods

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getSalary(){
         return salary ;
     }
 }
public class Main {

    public static void main(String[] args) {

Employee e1 = new Employee() ;
        e1.name = "Faisal";
        e1.salary = 500000 ;
        System.out.println(e1.name);
        System.out.println(e1.getSalary());
        Employee e2 = new Employee() ;
        e2.setName("Rahul");
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());
    }

}
