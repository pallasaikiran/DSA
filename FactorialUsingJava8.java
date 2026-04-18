import java.util.stream.IntStream;

public class FactorialUsingJava8 {
    public static long factorial(int n) {
        return IntStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("Factorial of " + n + " is :" + factorial(n));
    }

}

/*
 * Let's break it down step by step using n = 5 as an example:
 * 
 * 1. IntStream.rangeClosed(2, n)
 * 
 * Generates a stream of integers from 2 to n (inclusive)
 * 
 * For n=5: [2, 3, 4, 5]
 * 
 * 2. .reduce(1, (a, b) -> a * b)
 * 
 * 1 — the identity/initial value (stored in a)
 * 
 * a — the accumulated result (starts at 1)
 * 
 * b — the current element from the stream
 * 
 * a * b — multiplies the accumulator with the current element
 * 
 */