import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
   Reverse an array
     */
int [] arr = {1,2,3,4,5, 21, 78};
int l = arr.length;
int n = Math.floorDiv(l, 2); // find mid element with greatest integer
int temp = 0;
for(int i = 0; i < n; i++){
    // swap arr[i] arr[l-1-i]
    temp = arr[i];
    arr[i] = arr[l-1-i];
    arr[l-1-i] = temp ;

}
for(int  element : arr){
    System.out.print(element+ " ");
}

    }
}

/*
OUTPUT:  78 21 5 4 3 2 1


 */
