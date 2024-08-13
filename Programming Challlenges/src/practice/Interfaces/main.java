/*Write a java that implements an interface
AdvancedArithmetic which contains amethod signature
int divisor_sum(int n). You need to write a class
calledMyCalculator which implements the interface.
divisorSum function just takes an integer as input and
return the sum of all its divisors.
For example, divisors of 6 are 1, 2, 3 and 6, so
divisor_sum should return 12. The value of n will be at
most 1000.*/

package practice.Interfaces;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        // Iterate through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // If i is a divisor of n, add it to the sum
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class main {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        int n = 6;  // Example input
        System.out.println("Sum of divisors of " + n + " is: " + calculator.divisor_sum(n));

        n = 28;  // Another example input
        System.out.println("Sum of divisors of " + n + " is: " + calculator.divisor_sum(n));
    }
}

