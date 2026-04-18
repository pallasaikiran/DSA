public class FactorialNumber {
    public static long factorial(int n) {
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is :" + factorial(n));
    }

}

//
/*
 * The factorial(int n) method computes n! (n factorial), which is the product
 * of all positive integers from 1 to n.
 * 
 * res = 1 — starts with 1 (since 1 is the multiplicative identity)
 * 
 * The loop runs from i = 2 to i = n, multiplying res by i each iteration
 * 
 * Iteration i _____ res
 * start ___ — ______ 1
 * 1 ________2 _______ 1 × 2 = 2
 * 2 ________3 ________2 × 3 = 6
 * 3 ________4 ________6 × 4 = 24
 * 4 ________5 ________24 × 5 = 120
 * 
 * Because multiplying by 1 is unnecessary — it doesn't change the result.
 * 
 * res is already initialized to 1
 * 
 * 1 × anything = anything, so starting the loop at i = 1 would just do res = 1
 * * 1 = 1, which is a wasted iteration
 * 
 * Starting at i = 2 skips that redundant step and goes straight to the first
 * meaningful multiplication
 * 
 */
