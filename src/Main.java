import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*
     * Practice set question chapter - 4
     * */
       /*
       Question 4
       WAP to find out the type of website by its url

       .com - commerical website
       .org - organization website
       .in - indian website
       */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your website url :");
        String url = sc.next() ; // amazon.com or amazon.in or amazon.org
        if (url.endsWith(".com")) {
            System.out.println("its a commerical website");

        }else if (url.endsWith(".org")){
            System.out.println("its a organization website");
        } else  if (url.endsWith(".in")){
            System.out.println("its a indian website");
        }
    }
}

