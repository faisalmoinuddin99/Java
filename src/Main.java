import java.util.Scanner;

public class Main {
    /*
    WAP method to print multiplication table of a
    number n
     */

    static void multiplicationTable(int n, int till){
        int table = 1;
        for(int i = 1; i<=till; i++){
        table = n * i;
            System.out.format("%d * %d = %d ",n,i,table);
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
    multiplicationTable(4,10);
    }

}

/*

OUTPUT :

4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36
4 * 10 = 40

 */
