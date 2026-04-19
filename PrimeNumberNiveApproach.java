public class PrimeNumberNiveApproach {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {// Check all numbers from 2 to n-1
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

}

// Time Complexity: O(n) - checks every number from 2 to n-1
