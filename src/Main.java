import java.util.Scanner;

public class Main {
    /*
   Write a function to find average of a set of number
   passed as an argument

   Average = Total Sum of all number / Number of Item
     */
    static  int  findAvg(int ...args){
        int sum = 0;
        int len = 0;
        for (int i : args){
            sum += i;
            len++;
        }
        int avg = sum / len ;
       // System.out.println("length "+len);
        return avg ;
    }
    public static void main(String[] args) {


        System.out.println("Average : " + findAvg(10,20,30,40));

    }

}

/*

OUTPUT :

*
**
***
****


 */
