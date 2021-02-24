import java.util.Scanner;

/*
Problem Statement :

You have to implement a library using Java Class Library
Methods : addBook, issueBook, returnBook, showAvailableBooks
Properties : Array to store the Available books,
Array to store the issued books
 */
class Library {
    public  String[] addBook(String[] books){
        String[] addMoreBooks = new String[books.length+1];

        // copy the content of old array
        for(int content = 0; content < books.length; content++){
            addMoreBooks[content] = books[content];
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Add new Book: ");
        addMoreBooks[addMoreBooks.length-1] = sc.nextLine() ;

        return addMoreBooks ;
    }
    public void display(String[] books){
        for(String i : books){
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        String[] books = {""};
        books = l.addBook(books);
        books = l.addBook(books);
        l.display(books);
    }
}