import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // find array length
        int [] marks = {90,78,56,8,65,45};
        int len = marks.length ;
        System.out.println(marks[1]);
        System.out.println(len);

        // floating point array
        float[] marks1 = {90.5f,78.78f,56.09f,8.7f,65.9f,45.6f};
        System.out.println(marks1[3]);

        //string array
        String[] students = {"faisal", "harry", "rohan", "shubham"};
        int studentLength = students.length;
        System.out.println(studentLength);
        System.out.println(students[2]);
    }
}

