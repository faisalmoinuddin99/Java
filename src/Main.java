class Employee {

    public Employee(int ...args){
        System.out.println("Printing the Id's");
        int findNoOfEmployee = 0;
        for (int i : args){
            System.out.print(i + " ");
            findNoOfEmployee ++;
        }
        System.out.print("\n");
        System.out.println("Number of Employee present in a company : " + findNoOfEmployee);
    }
}

public class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,2,3,4,5,6,7,8,9,10);

    }
}