import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   /*
   Practice set
    */
        /* Question 1
        Convert string to lower case
         */

        String myString = "My name is Dog" ;
        System.out.println(myString.toLowerCase()); // my name is dog


        /*
        Question 2
        replace spaces with _
         */

        System.out.println(myString.replace(" ", "_")); // My_name_is_Dog

        // Problem 3

        String letterTemplate = "Dear <|name|>, Thanks a lot !" ;
        letterTemplate = letterTemplate.replace("<|name|>", "Faisal") ;
        System.out.println(letterTemplate);

        /*
        Problem 4
        Detect double and triples spaces
         */

        String spaceDetector = "My string is having  double spaces and   Triple spaces";
        System.out.println(spaceDetector.indexOf("  ")); // 19 i.e Double Space Detected
        System.out.println(spaceDetector.indexOf("   ")); // 38 i.e Triple Space Detected
        System.out.println(spaceDetector.indexOf("    ")); // -1 i.e Four Space Not Detected

        /*
        Problem 5
        letter = "Dear Harry, this java course is nice. Thanks ! "
         */

        String myLetter =  "Dear Harry,\n\tThis java course is nice.\nThanks ! " ;
        System.out.println(myLetter);
        /*

        output : Dear Harry,
	                    This java course is nice.
                 Thanks !
        */
    }
}

