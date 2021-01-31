import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Create an array of 5 floats and calculate the sum
     */
    float [] myArray = {1.0f,2.1f,3.5f,4.7f,5.8f};
    float sum = 0f;
    int length = myArray.length;
    int i = 0;
    while(i < length){
        sum = sum + myArray[i];
        i++;
    }
        System.out.format("The sum of array is %.2f", sum);
    }
}

/*
OUTPUT: The sum of array is 17.10
 */
