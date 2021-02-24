class Phone {
    public void greet (){
        System.out.println("Good Morning...");
    }
    public void on(){
        System.out.println("Phone is booting.....");
    }

    public void showTime(){
        System.out.println("its 8 pm...");
    }
    public void call(){
        System.out.println("Ringing ....");
    }
}
class SmartPhone extends Phone {
    public void on(){
        System.out.println("Smart Phone is booting...");
    }
    public void camera(){
        System.out.println("click images..");
    }
    public void call(){
        System.out.println("Smart phone calling ...");
    }
}

public class Main{
    public static void main(String[] args) {

        // Phone obj = new Phone(); // Allowed
       // SmartPhone obj = new SmartPhone() ; // Allowed
        // SmartPhone b = new Phone() ; Not Allowed

        Phone obj = new SmartPhone(); // Allowed Run time Polymorphism
        obj.on(); // Smart Phone is booting...
        obj.call(); // Smart phone calling ...


        // obj.camera();  Error [ Not Allowed ]
        /* java: cannot find symbol
        symbol:   method camera()
        location: variable obj of type Phone
         */

        obj.showTime();

    }
}