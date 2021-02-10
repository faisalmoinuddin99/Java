
class Employee {
    // Data Hiding
    private   int id ;
    private  String name ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
public class Main {

    public static void main(String[] args) {

        Employee harry = new Employee();
//        harry.id = 12;
//        harry.name = "Harry" ; --> throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
    }
}

/*
                        Access Levels

Modifier	    Class	    Package	    Subclass	   World
public	     Y	           Y	        Y	        Y
protected    Y	           Y	        Y	        N
no modifier   Y	           Y	        N	        N
private	     Y	           N	        N	        N

 */