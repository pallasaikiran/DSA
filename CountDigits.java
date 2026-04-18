class CountDigits {
    static int countDigits(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        while (n != 0) {
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