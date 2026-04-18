class CountDigits {

    static int countDigits(int n) {
        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Number of digits in " + number + " is :" + countDigits(number));
    }
}
/*
 * time complexity : 0(n) [theta(n)]
 */

/**
 * Purpose: Count how many digits are in a given integer.
 * 
 * Key insight: Dividing an integer by 10 removes the last digit. We keep doing
 * 
 * 
 */

/*
 * Iteration n (start) n / 10 n (after) count
 * 1 123 123/10 12 1
 * 2 12 12/10 1 2
 * 3 1 1/10 0 3
 */

/*
 * Loop exits because n = 0, which is not > 0
 * How it works:
 * 
 * 1.Initialize count = 0
 * 
 * 2.Loop condition n > 0 — runs as long as there are digits left
 * 
 * 3.n = n / 10 — integer division drops the last digit (e.g., 123 → 12)
 * 
 * 4.count++ — increment for each digit removed
 * 
 * 5.When n becomes 0, the loop stops and count holds the total number of digits
 */
