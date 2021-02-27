import java.util.Scanner;

/*
Problem Statement :

You have to implement a library using Java Class Library
Methods : addBook, issueBook, returnBook, showAvailableBooks
Properties : Array to store the Available books,
Array to store the issued books
 */

class Library {

    public String [] addBook(String[] book){
        String[] racks = new String[book.length + 1];
        System.arraycopy(book, 0, racks, 0, book.length);
        System.out.println("Enter new Books");
        Scanner sc = new Scanner(System.in);
        racks[racks.length - 1] = sc.nextLine();

        return racks;
    }
    public String [] issueBook(String[] book, String bookName){

        for (int i = 0; i < book.length; i++){
            if (bookName.equals(book[i])){
                for (int j = i; j < book.length-1; j++){
                    book[j] = book[j+1];
                }
                break;
            }
        }
        return book;
    }



    public void showAvailableBook(String[] book){
        System.out.println("Available Books:");

        for(String availableBook : book){
            System.out.print(availableBook + " ");
        }

    }

    public void showAfterIssuingBook(String[] book){
        System.out.println("Available Books after issuing :");
        for (int i = 0; i < book.length - 1; i++){
            System.out.println(book[i]);
        }
    }

    }



class Admin extends Library {

    String[] books = {};
    String[] issuedBooks;
    public void putInRack(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Latest Book Stocks:");
        int numbersOfBookToBePutInRack = sc.nextInt();


        for (int i = 0; i < numbersOfBookToBePutInRack; i++){
            books = addBook(books);
        }
        showAvailableBook(books);

        System.out.println();
        System.out.println("Which book do you want ?");
        String userInput = sc.next();
        issuedBooks = issueBook(books,userInput);
        checkBookPresentOrNot(issuedBooks);

        // Returning the issued book
        addReturnedBooks(userInput);


    }
    // Method to return book and add it to library
    public void addReturnedBooks(String returnBook){
        String lastElement = books[books.length-1];
        for(int i = 0; i< books.length - 1; i++){
            if(books[i].equals(lastElement)){
                books[i++] = returnBook;
            }
        }
        System.out.println("After returning issued book: ");
        for(String i : books){
            System.out.print(i + " ");
        }
    }



    public void checkBookPresentOrNot(String[] issuedBooks){
        if (issuedBooks == null && issuedBooks.length == 0){
            System.out.println("Issued Book Array is Empty");
        } else {
          showAfterIssuingBook(issuedBooks);
        }
    }


}


public class Main {
    public static void main(String[] args) {
        Admin teacher = new Admin();
        teacher.putInRack();

    }
}
/*
OUTPUT:

Latest Book Stocks: 3
Enter new Books
google
Enter new Books
apple
Enter new Books
windows
Available Books:
google apple windows
Which book do you want ?
windows
Available Books after issuing :
google
apple
After returning issued book:
google apple windows

=======
class Base {
    public Base() {
        System.out.println("Constructor of Base class");
    }
}
class Derived1 extends Base {
    public Derived1() {
        System.out.println("Constructor of Derived1 class");
    }
}
class Derived2 extends Derived1{
    public Derived2() {
        System.out.println("Constructor of Derived2 class");
    }
}
public class Main{
    public static void main(String[] args) {
        Derived2 derived2 = new Derived2();
    }
}
/*
. In Java, constructor of base class with no argument gets automatically called in derived class constructor. For example, output of following program is:

Constructor of Base class
Constructor of Derived1 class
Constructor of Derived2 class

. But, if we want to call parameterized constructor of base class, then we can call it using super(). The point to note is base class constructor call must be the first line in derived class constructor. For example, in the following program, super(_x) is first line derived class constructor.
>>>>>>> Chapter10
 */