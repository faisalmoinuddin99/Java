import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
       * Calculate the Cumulative Grade Points Average is the CGPA Grades of Subjects are given as 9, 8, 7, 8, 8?
       * Also convert CGPA to Percentage
       */
      Scanner marksInput = new Scanner(System.in) ;
      // Taking marks of all subject
      System.out.println("Physics Marks: ");
      byte physicsMarks = marksInput.nextByte();
      System.out.println("Maths Marks: ");
      byte mathsMarks = marksInput.nextByte() ;
      System.out.println("English Marks: ");
      byte englishMarks = marksInput.nextByte();
      System.out.println("Chemistry Marks: ");
      byte chemistryMarks = marksInput.nextByte() ;
      System.out.println("Biology Marks: ");
      byte bioMarks = marksInput.nextByte() ;

      //  Total Sum
      int sum = physicsMarks + mathsMarks + englishMarks + chemistryMarks + bioMarks ;
      System.out.println("Total: " + sum);

      // Find CGPA
      int CGPA = sum / 5 ;
      System.out.println("CGPA: " + CGPA);

      // Converting CGPA to Percentage
      double percentage = CGPA * 9.5 ;
      System.out.println("Percentage: " + percentage);


    }
}

