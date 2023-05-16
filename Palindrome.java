public class Palindrome {

    public static void main(String[] args) {

        int number = 32123;
        if (isPalindrome(number)) {
            System.out.printf("%d is a palindrome%n", number);
        } else {
            System.out.printf("%d is not a palindrome%n", number);
        }
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return original == reverse;
    }
}

