package Chapter7;
import java.util.Random;
public class DiceRolling {

        public static void main(String[] args) {
            int[] frequency = new int[13]; // array to store frequency of each sum
            Random random = new Random(); // object of class Random

            // roll the dice 36,000,000 times
            for (int i = 0; i < 36000000; i++) {
                int die1 = 1 + random.nextInt(6) ; // roll the first die
                int die2 = 1 + random.nextInt(6) ; // roll the second die
                int sum = die1 + die2; // calculate the sum
                frequency[sum]++; // increment the frequency of the sum
            }

            System.out.println("Sum\tFrequency");
            for (int i = 2; i <= 12; i++) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }
    }


