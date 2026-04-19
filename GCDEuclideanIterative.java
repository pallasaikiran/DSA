public class GCDEuclideanIterative {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
    }
}
/*
 * GCD(a, b) = GCD(b, a % b)
 * 
 * The remainder of a÷b has the same common divisors as the original numbers.
 * 
 * Example 1: GCD(48, 18)
 * Step ---------a -----------b ------a % b ---------Action
 * 1 ---------- 48 ----------18 -------12 ---------temp=18, b=48%18=12, a=18
 * 2 ----------18 -----------12 -------6 ----------temp=12, b=18%12=6, a=12
 * 3 ----------12 -----------6 --------0 --------- temp=6, b=12%6=0, a=6
 * 4 ----------6 ------------0 ------ - ----------- b=0, return a=6
 */
/**
 * 
 * Iteration Details:
 * while (b != 0) {
 * int temp = b; // Store current b
 * b = a % b; // New b = remainder of a÷b
 * a = temp; // New a = old b
 * }
 */

/**
 * Visual Breakdown for GCD(48, 18):
 * Before Loop:
 * 
 * a = 48, b = 18
 * 
 * Iteration 1:
 * 
 * temp = 18 (store b)
 * 
 * b = 48 % 18 = 12 (new remainder)
 * 
 * a = 18 (old b becomes new a)
 * 
 * Now: a = 18, b = 12
 * 
 * Iteration 2:
 * 
 * temp = 12
 * 
 * b = 18 % 12 = 6
 * 
 * a = 12
 * 
 * Now: a = 12, b = 6
 * 
 * Iteration 3:
 * 
 * temp = 6
 * 
 * b = 12 % 6 = 0
 * 
 * a = 6
 * 
 * Now: a = 6, b = 0
 * 
 * Loop Ends: b = 0, return a = 6
 */

/*
 * Why It Works
 * 1. Mathematical Property: GCD(a, b) = GCD(b, a mod b)
 * 
 * 2.Reduction: Each step reduces the problem size
 * 
 * 3.Termination: Eventually b becomes 0
 * 
 * 4.Result: When b = 0, a contains the GCD
 */