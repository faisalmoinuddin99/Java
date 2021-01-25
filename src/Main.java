import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*
     String Methods :
      */
        String name = "Faisal" ;
        int value = name.length() ;
        System.out.println(value); // 6

        String lowerCase = name.toLowerCase() ;
        System.out.println(lowerCase);

        String uCase = name.toUpperCase();
        System.out.println(uCase);

       String nonTrimmedString = "       faisal     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2)); // isal

        /*
        substring(start index, end index )
        . start index is included
        . end index is excluded
         */
        System.out.println(name.substring(2,5)); // isa

        String newName = "Harry" ;
        System.out.println(newName); // Harry
        System.out.println(newName.replace('r','p')); // Happy
        System.out.println(newName.replace("rry","ier")); // Haier
        System.out.println(newName.replace("r","ier")); // Haieriery

        /*
        startWith() -> return boolean
         */
        System.out.println(newName.startsWith("Ha")); // true
        System.out.println(newName.endsWith("Ha")); //false

        System.out.println(name.charAt(4)); // a

        System.out.println(name.indexOf("sa"));

        System.out.println(name.equals("Faisal")); // true
        System.out.println(name.equals("faisal")); // false

        System.out.println(name.equalsIgnoreCase("faisal")); // true
        /*
        its not having problem with any cases.
         */

        System.out.println(name.equalsIgnoreCase("FaIsAl"));


    }
}

