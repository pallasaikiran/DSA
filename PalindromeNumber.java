public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        boolean palindrome = false;

        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }

        if (reverse == x) {
            palindrome = true;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        boolean isPalindromeNumber = isPalindrome(121);
        System.out.println(isPalindromeNumber);
    }
}

/*
 * // A palindrome number (also known as a palindromic number) is a number that
 * remains the same when its digits are reversed.
 *
 * // In simpler terms, it reads exactly the same from left to right as it does
 * from right to left.
 * 
 * // Time complexity : theta(n)
 * 
 * Explanation:
 * 
 * How each operation works:
 * 
 * 1.temp % 10 → extracts the last digit (e.g., 121 % 10 = 1)
 * 
 * 2.rev * 10 + lastDigit → builds the reversed number by shifting existing
 * digits
 * left and adding the new digit
 * 
 * 3.temp / 10 → removes the last digit (e.g., 121 / 10 = 12)
 * /
 * /
 * 
 * /* Loop iterations:
 * 
 * Iteration|temp|lastDigit (temp%10) | rev (rev*10 + lastDigit) temp |(temp/10)
 * -------1 | 121 | 121%10 = 1 | 0*10 + 1 = 1 | 121/10 = 12
 * -------2 | 12 | 12%10 = 2 | 1*10 + 2 = 12 | 12/10 = 1
 * -------3 | 1 | 1%10 = 1 | 12*10 + 1 = 121 | 1/10 = 0
 */

// Time complexity : theta(n)
