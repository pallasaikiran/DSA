public class PrimeUsingEfficientMethod {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 1031;
        System.out.println(isPrime(n));
    }

}

/*
 * What is a Prime Number? (Simple Terms)
 * A prime number is a whole number greater than 1 that can only be divided
 * evenly by 1 and itself.
 * 
 * Simple Definition
 * -> Has exactly 2 factors: 1 and the number itself
 * 
 * -> Cannot be made by multiplying two smaller whole numbers together
 * 
 * Examples
 * Prime Numbers:
 * 2 → Only divisible by 1 and 2
 * 
 * 3 → Only divisible by 1 and 3
 * 
 * 5 → Only divisible by 1 and 5
 * 
 * 7 → Only divisible by 1 and 7
 * 
 * 11 → Only divisible by 1 and 11
 * 
 * Not Prime Numbers:
 * 1 → Only has one factor (itself), so not prime
 * 
 * 4 → Divisible by 1, 2, and 4 (too many factors)
 * 
 * 6 → Divisible by 1, 2, 3, and 6 (too many factors)
 * 
 * 8 → Divisible by 1, 2, 4, and 8 (too many factors)
 * 
 * 9 → Divisible by 1, 3, and 9 (too many factors)
 * 
 * Algorithm Breakdown
 * -------------------
 * Step 1: Handle Edge Cases
 * if (n == 1) {
 * return false; // 1 is not prime by definition
 * }
 * 
 * if (n == 2 || n == 3) {
 * return true; // 2 and 3 are prime
 * }
 * 
 * Step 2: Eliminate Multiples of 2 and 3
 * 
 * if (n % 2 == 0 || n % 3 == 0) {
 * return false; // If divisible by 2 or 3, not prime
 * }
 * 
 * Step 3: Check Only Potential Prime Candidates
 * 
 * for (int i = 5; i * i <= n; i = i + 6) {
 * if (n % i == 0 || n % (i + 2) == 0) {
 * return false;
 * }
 * }
 * ================================================================
 * Why i += 6?
 * Starting from 5, adding 6 each time gives us:
 * 
 * ->5, 11, 17, 23, 29... (all of form 6k-1)
 * 
 * ->Then we check i+2: 7, 13, 19, 25, 31... (all of form 6k+1)
 * 
 * Mathematical Foundation
 * Every Integer Falls Into One of Six Categories
 * Any integer n can be written as:
 * 
 * 6k + 0 = 6k (divisible by 6)
 * 
 * 6k + 1
 * 
 * 6k + 2 (divisible by 2)
 * 
 * 6k + 3 (divisible by 3)
 * 
 * 6k + 4 (divisible by 2)
 * 
 * 6k + 5 = 6k - 1
 * 
 * Why Only (6k±1) Can Be Prime
 * Let's analyze each form:
 * 
 * 6k + 0 = 6k
 * Examples: 6, 12, 18, 24, 30...
 * All divisible by 6 → NOT PRIME (except when k=0, but 0 isn't prime)
 * 
 * 6k + 2
 * Examples: 2, 8, 14, 20, 26...
 * All even numbers → NOT PRIME (except 2)
 * 
 * 6k + 3
 * Examples: 3, 9, 15, 21, 27...
 * All divisible by 3 → NOT PRIME (except 3)
 * 
 * 6k + 4
 * Examples: 4, 10, 16, 22, 28...
 * All even numbers → NOT PRIME
 * 
 * 6k + 1 ✓
 * Examples: 1, 7, 13, 19, 25, 31...
 * Could be prime (need to check)
 * 
 * 6k + 5 = 6k - 1 ✓
 * Examples: 5, 11, 17, 23, 29...
 * Could be prime (need to check)
 * 
 * Detailed Examples
 * -----------------
 * k = 0:
 * 6(0) + 1 = 1 (not prime by definition)
 * 
 * 6(0) - 1 = -1 (negative, not considered)
 * 
 * k = 1:
 * 6(1) + 1 = 7 (prime ✓)
 * 
 * 6(1) - 1 = 5 (prime ✓)
 * 
 * k = 2:
 * 6(2) + 1 = 13 (prime ✓)
 * 
 * 6(2) - 1 = 11 (prime ✓)
 * 
 * k = 3:
 * 6(3) + 1 = 19 (prime ✓)
 * 
 * 6(3) - 1 = 17 (prime ✓)
 * 
 * k = 4:
 * 6(4) + 1 = 25 = 5² (not prime ✗)
 * 
 * 6(4) - 1 = 23 (prime ✓)
 * 
 * 
 */