import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n, sum;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = s.nextInt();
        sum=Recursive(n);
        System.out.println("The summation of " + n + " natural number is : " + sum);
    }

    public static int Summation (int num){
        int sum = 0;
        for(int i=0; i<num; i++){
            sum += i;
        }
        return sum;
    }

    public static int Recursive (int num){
        if(num==0){
            return 0;
        }
        else{
            return num + Recursive(num-1);
        }
    }
}
