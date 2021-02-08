 /*
 Practice Set
  */

class CellPhone {

    public  void ring(){
        System.out.println("ringing");
    }

    public void vibrate(){
        System.out.println("Vibrating");
    }
}

public class Main {

    public static void main(String[] args) {

    CellPhone c1 = new CellPhone();
    c1.ring();
    c1.vibrate();
    }

}
