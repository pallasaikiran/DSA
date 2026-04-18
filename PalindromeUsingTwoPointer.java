public class PalindromeUsingTwoPointer {

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        String str = String.valueOf(x);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPalindromeNumber = isPalindrome(12345);
        System.out.println(isPalindromeNumber);
    }

}
/*
 * Key benefits:
 * 
 * Early exit — stops as soon as a mismatch is found
 * 
 * Less memory — no extra objects created
 * 
 * Half the work — only compares up to the middle, since checking both ends
 * simultaneously covers all characters
 * 
 */