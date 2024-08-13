import java.util.Scanner;

public class TakingInput {
    public static void main(String args[]){
        int a, b;
        float c;
        @SuppressWarnings("resource")
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter three numbers to add: ");
        a=s1.nextInt();
        b=s1.nextInt();
        c=s1.nextFloat();
        System.out.println(a+b+c);
    }
}
