package Chapter5;

import java.util.Scanner;
public class SumOfTwoExtremes {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("How many values do you want to enter? ");
            int numValues = input.nextInt();
            System.out.print("Enter the first value: ");
            int value = input.nextInt();
            int min = value;
            int max = value;

            for (int i = 1; i < numValues; i++) {
                System.out.print("Enter the next value: ");
                value = input.nextInt();
                if (value < min)  min = value;
                if (value > max)  max = value;
            }
            int sum = min + max;
            System.out.println("First value: " + value);
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
            System.out.println("Sum of Minimum and Maximum: " + sum);
        }
    }


