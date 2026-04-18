public class CountDigitsWithJava8 {

    public static long countDigits(int number) {
        if (number == 0)
            return 1;

        return String.valueOf(Math.abs(number)).chars().count();
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Number of digits in " + number + " is :" + countDigits(number));
    }
}

/*
 * Explanation of Logic:
 * 1.Math.abs(number) : converts to positive number,if number is negative
 * 
 * 2.String.valueOf(12345) : converts integer into string -> "12345"
 * 
 * 3.chars() :
 * i.Converts the String into an IntStream of character ASCII values
 * ii. '1'→49, '2'→50, '3'→51, '4'→52, '5'→53
 * iii.Stream: [49, 50, 51, 52, 53]
 * 
 * 4.count() : returns the count of elements in the stream
 * 
 * In short: It converts the number to a string, then simply counts how many
 * characters are in that string. Each character represents one digit, so the
 * character count = digit count.
 * 
 * ASCII (American Standard Code for Information Interchange) is a system that
 * assigns a number to every character so computers can understand them — since
 * computers only work with numbers.
 * 
 * It's a universal standard that all computers agree on
 * 
 * So when you type 'A', the computer stores 65 internally
 */
