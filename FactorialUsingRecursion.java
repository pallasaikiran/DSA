import java.util.stream.IntStream;

public class FactorialUsingRecursion {
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is :" + factorial(n));
    }

}
/*
 * recursion uses extra memory (call stack) for each recursive call
 */
