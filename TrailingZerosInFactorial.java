
public class TrailingZerosInFactorial {

    public static int zerosInfactorial(int n) {

        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count = count + n / i;
        }
        return count;

    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Trailling Zeros In Factorial Are" + n + " :" + zerosInfactorial(n));
    }

}

/*
 * Prime factorization = finding the smallest possible pieces (primes) that
 * multiply together to make the original number.
 * 
 * another def : Breaking a number down into prime numbers that multiply
 * together to give the original number.
 * 
 * What is a Prime Number?
 * A number that is only divisible by 1 and itself.
 * 
 * Examples: 2, 3, 5, 7, 11, 13, 17, 19...
 * 
 * Number________________Prime _____________________Factorization Explanation
 * 6 ____________________2 × 3 _____________________ 2 and 3 are both prime
 * 8 ____________________2 × 2 × 2 _________________ only 2 is the prime factor
 * 12 ___________________ 2 × 2 × 3 _________________ prime factors are 2 and 3
 * 30 __________________ 2 × 3 × 5 ________________prime factors are 2, 3 and 5
 * 100 _________________ 2 × 2 × 5 × 5 _____________ prime factors are 2 and 5
 * 
 * How to do it? (Factor Tree)
 * 36
 * / \
 * 2 _ 18
 * ____/ ___\
 * ____2 ____9
 * __________/ \
 * _________3___3
 * 
 * 
 */
/*
 * 36 = 2 × 2 × 3 × 3
 * 
 * Steps:
 * 
 * Is 36 divisible by 2? Yes → 36 ÷ 2 = 18
 * 
 * Is 18 divisible by 2? Yes → 18 ÷ 2 = 9
 * 
 * Is 9 divisible by 2? No. Try 3 → 9 ÷ 3 = 3
 * 
 * 3 is prime → stop
 */

/*
 * Counting Trailing Zeros in Factorial
 * 
 * Core Idea
 * Trailing zeros are created by multiplying 10 = 2 × 5. In any factorial, there
 * are always more 2s than 5s, so we only need to count how many times 5 appears
 * as a factor.
 * 
 * Why count 5s?
 * Let's look at 10! = 3628800
 * 
 * Prime factorization: 2⁸ × 3⁴ × 5² × 7
 * 
 * Factor ___________ Count
 * 2 _________________ 8
 * 5 _________________ 2
 * Each pair of (2 × 5) makes one trailing zero. We have 8 twos but only 2
 * fives, so 5 is the bottleneck → 2 trailing zeros ✅
 * 
 * 
 * Iteration_____i______n / i _______What it counts_____________________count
 * 1_____________5______25/5 = 5__Numbers divisible by 5:(5,10,15,20,25)_5
 * 2___________ 25______ 25/25 = 1__ Numbers divisible by 25: (25) _____6
 * 3___________125______ 125 > 25 __Loop ends ________________________ 6
 * 
 * 
 * First iteration (i = 5): counts all numbers that have at least one factor of
 * 5 → 5, 10, 15, 20, 25 = 5
 * 
 * Second iteration(i = 25): counts numbers that have a second factor of 5→25=1
 * 
 * Total = 5 + 1 = 6
 */