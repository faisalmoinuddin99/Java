import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      // Question 2
        /*
        WAP to encrypt a grade by adding 8 to it. Decrypt it
        to show the correct grade

         */
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Please enter your grade :");
        char grade = sc.next().charAt(0) ;
        grade += 8 ; // encryption
        System.out.println("Encrypted Grade: " + grade );
        grade -= 8 ; // decryption
        System.out.println("Decrypted Grade: " + grade);
    }
}

