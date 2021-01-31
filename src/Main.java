import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    2-D Array
     */
        int [][] flats ;
        int rows = 3;
        int col = 2 ;
        flats = new int[2][3];
        // 2 columns and 3 rows
        flats[0][0] = 101 ;
        flats[0][1] = 102 ;
        flats[0][2] = 103 ;
        flats[1][0] = 201 ;
        flats[1][1] = 202 ;
        flats[1][2] = 203 ;



        int len = flats.length;
        System.out.println(len);
        for(int i = 0; i < flats.length; i++){
            for (int j = 0; j < flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}

/*

101 102 103
201 202 203

 */
