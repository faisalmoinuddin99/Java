class Employee {
    String name;
    int id;

//    public Employee(){
//        name = "your Name" ;
//        id = 0 ;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee() ;
        System.out.println(emp1.getName());
        System.out.println(emp1.getId());

        emp1.setName("Faisal");
        System.out.println(emp1.getName());
        emp1.setId(612);
        System.out.println(emp1.getId());
    }
}