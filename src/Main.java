import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
       check whether the array is sorted or not
     */
//    int[] array = {1, 2100, 3, 455, 5, 34, 67} ;
        int[] array = {1, 2, 3, 4, 5, 34, 67} ;
    boolean isSorted = true;
    for (int i = 0; i < array.length - 1; i++){
        if (array[i] > array[i+1]) {
            isSorted = false ;
        }
    }
    if (isSorted){
        System.out.println("Yes, Sorted");
    } else {
        System.out.println("No, not Sorted");
    }

    }
}

/*
OUTPUT:  Yes, Sorted





 */
