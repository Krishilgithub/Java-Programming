/**
 * Write a java that implements an interface 
 * AdvancedArithmetic which contains amethod signature 
 * int divisor_sum(int n). You need to write a class 
 * calledMyCalculator which implements the interface. 
 * divisorSum function just takes an integer as input and 
 * return the sum of all its divisors.
 * For example, divisors of 6 are 1, 2, 3 and 6, so 
 * divisor_sum should return 12. The value of n will be at 
 * most 1000.
 */

interface AdvancedArithmetic {
    
    void signature();

    void divisor_sum(int n);
}

class calledMyCalculator implements AdvancedArithmetic{
    public void signature(){}
    
    public void divisor_sum(int n){
        for(int i=0;i<n;i++){
            if(n%i==0){
                System.out.printf("%d ", i);
            }
        }
    }
}

public class ArithmeticTest{
    
}