public class LCMUsingGCD {
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
    }
}
/**
 * The GCD-based approach is most efficient with O(log(min(a,b))) time
 * complexity.
 */

/**
 * Formula: LCM(a, b) = (a × b) / GCD(a, b)
 * 
 * Mathematical Relationship:
 * 
 * GCD = largest number that divides both
 * 
 * LCM = smallest number divisible by both
 * 
 * Formula: a × b = GCD(a, b) × LCM(a, b)
 * 
 */

/**
 * Step 1: Find GCD(12, 18)
 * 
 * GCD calculation:
 * 12, 18 → 18 % 12 = 6 → GCD(12, 6)
 * 12, 6 → 12 % 6 = 0 → GCD(6, 0)
 * Result: GCD(12, 18) = 6
 * 
 * Step 2: Apply LCM Formula
 * 
 * LCM(12, 18) = (12 × 18) / 6
 * = 216 / 6
 * = 36
 * 
 * 
 */