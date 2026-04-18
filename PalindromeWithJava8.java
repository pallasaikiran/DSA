public class PalindromeWithJava8 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return str.equals(new StringBuilder(str).toString());
    }

    public static void main(String[] args) {
        boolean isPalindromeNumber = isPalindrome(121);
        System.out.println(isPalindromeNumber);
    }
}
/**
 * Summary:
 * 
 * Step -------------------Operation --------------------- Object Created
 * 1 ------------------ String.valueOf(x) ------------------ String "121"
 * 2 ------------------new StringBuilder(str) StringBuilder -- "121"
 * 3 ----------------- .reverse() ------------- No new object(modifies in place)
 * 4 ------------------ .toString() ----------- String "121"
 * 
 * Total: 3 objects created just to check a palindrome.
 * 
 * In the improved version (two-pointer approach), only 1 object is created —
 * the initial String.valueOf(x). That's why it's more memory efficient.
 * 
 */