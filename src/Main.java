import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
        find max element present in the array
     */

        int[] arr = {10, 5, 20, 3,7,90};
        int len = arr.length;
        int max = 0;

        for (int i = 0; i < len; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print("Max "+ max);
    }
}

/*
OUTPUT:  Max 90



 */
