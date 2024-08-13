import java.util.Scanner;

//* compile time exception is also know as checked exception 

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // int y = sc.nextInt();

        float x = 25/0;

    try {
        float z = 5/0;
        System.out.println(z);
    }
    // System.out.println("hi"); 
    catch (NullPointerException e) {
        System.out.println(e);
        // System.exit(0);
    }  
    // System.out.println("H");
    finally{
        // System.exit(0);
        // float w = 25/0;
        System.out.println("Finally");
    }     
    System.out.println("Program ended");

    }
}
