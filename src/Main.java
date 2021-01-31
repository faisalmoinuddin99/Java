import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Create a java program to add two matrix of size 2 X 3
     */
       int [][] matrixA = new int[2][3];
       int [][] matrixB = new int[2][3] ;

       matrixA[0][0] = 2;
       matrixA[0][1] = 3;
       matrixA[0][2] = 1;
       matrixA[1][0] = 1;
       matrixA[1][1] = 0;
       matrixA[1][2] = 1;

       matrixB[0][0] = 1;
       matrixB[0][1] = 2;
       matrixB[0][2] = 3;
       matrixB[1][0] = 0;
       matrixB[1][1] = 4;
       matrixB[1][2] = 5 ;

       int[][] matrixC = new int[2][3];

        System.out.println("Matrix A");
       for (int i = 0; i < matrixA.length; i++){
           for (int j = 0; j < matrixA[i].length; j++){
               System.out.print(matrixA[i][j]);
               System.out.print(" ");
               matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
           }
           System.out.println("");

       }
        System.out.println("Matrix B");
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA[i].length; j++){
                System.out.print(matrixB[i][j]);
                System.out.print(" ");

            }
            System.out.println("");

        }
        System.out.println("Matrix C");
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA[i].length; j++){
                System.out.print(matrixC[i][j]);
                System.out.print(" ");
            }
            System.out.println("");

        }


    }
}

/*
OUTPUT:
Matrix A
2 3 1
1 0 1
Matrix B
1 2 3
0 4 5
Matrix C
3 5 4
1 4 6

 */
