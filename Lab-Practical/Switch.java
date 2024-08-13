
import java.util.Scanner;

public class Switch {

    public static void main(String args[]) {
        int choice;
        int n1;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter 1 : Prime numbers");
            System.out.println("Enter 2 : Odd or Even");
            System.out.println("Enter 3 : Positive or Negative");
            System.out.println("Enter 4 : Factorial");
            System.out.println("Enter your choice : ");
            choice = s.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter a number: ");
                    n1 = s.nextInt();
                    int[] nums = new int[n1];
                    for (int j = 0; j < n1; j++) {
                        nums[j] = s.nextInt();
                    }
                    int[] prime = new int[n1];
                    for (int i = 2; i < n1 / 2; i++) {
                        if (nums[i] % i == 0) {
                            prime[i] = 0;
                        }
                        if (nums[i] == 2) {
                            System.out.println(n1 + " is a prime number");
                        }
                        if (nums[i] % i != 0) {
                            prime[i] = 1;
                        }
                    }
                    for (int j = 0; j < n1; j++) {
                        if (prime[j] == 0) {
                            System.out.println(nums[j] + " is not a prime number");
                        } else {
                            System.out.println(nums[j] + " is a prime number");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Enter a number: ");
                    n1 = s.nextInt();
                    int[] nums = new int[n1];
                    for (int j = 0; j < n1; j++) {
                        nums[j] = s.nextInt();
                    }
                    for (int i = 0; i < n1; i++) {
                        if (nums[i] % 2 == 0) {
                            System.out.println(nums[i] + " is a even number");
                        } else {
                            System.out.println(nums[i] + " is a odd number");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Enter a number: ");
                    n1 = s.nextInt();
                    int[] nums = new int[n1];
                    for (int j = 0; j < n1; j++) {
                        nums[j] = s.nextInt();
                    }
                    for (int i = 0; i < n1; i++) {
                        if (nums[i] > 0) {
                            System.out.println(nums[i] + " is a positive number");
                        } else if (nums[i] < 0) {
                            System.out.println(nums[i] + " is a negative number");
                        } else {
                            System.out.println("You entered 0");
                        }
                    }

                }
                case 4 -> {
                    System.out.println("Enter a number: ");
                    n1 = s.nextInt();
                    int[] nums = new int[n1];
                    for (int j = 0; j < n1; j++) {
                        nums[j] = s.nextInt();
                    }
                    for (int k = 0; k < n1; k++) {
                        for (int i = nums[k]; i > 0; i--) {
                            int fact;
                            fact = s.nextInt();
                            fact *= nums[k];
                            System.out.println("The factorial of " + nums[k] + " is : " + fact);
                        }
                    }
                }
                default -> {
                    System.out.println("Enter Correct Choice !!!!!!!!!!!!!!!!!");
                }
            }
        }
    }
}
