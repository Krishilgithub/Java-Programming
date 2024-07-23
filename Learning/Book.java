
import java.util.Scanner;

public class Book {
    String title;
    String author;
    int ISBN;
    static int totalBooks;

    public static int getTotalBooks(){
        totalBooks=0;
        return totalBooks;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "The book title is " + title;
    }

    @SuppressWarnings("resource")
    public void getBookDetails(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        title = s.nextLine();
        System.out.println("Enter the author of the book: ");
        author = s.nextLine();
        System.out.println("Enter the ISBN of the book: ");
        ISBN = s.nextInt();
    }

    public void printBookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+ISBN);
    }

    public void borrowBook(String titleName){
        if(title.equals(titleName)){
            System.out.println("Book borrowed successfully");
            totalBooks--;
        }else{
            System.out.println("Book not available");
        }
    }

    public void returnBook(String titleName){
        if(title.equals(titleName)){
            System.out.println("Book returned successfully");
            totalBooks++;
        }else{
            System.out.println("Book not found");
        }
    }
}
