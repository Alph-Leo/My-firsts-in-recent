package chapter6;
import java.util.Scanner;
public class Palindrome {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = input.nextInt();
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


