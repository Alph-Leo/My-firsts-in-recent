package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    private int counter;
    private int rigthAnswer;
    private int wrongAnswer;

    Scanner in = new Scanner(System.in);
    SecureRandom randomNumber = new SecureRandom();


    public int simpleMultiplicationTable() {
        for (counter = 0; counter < 10; counter++) {

            int positiveAnswer = 1 + randomNumber.nextInt(4);
            int negativeAnswer = 1 + randomNumber.nextInt(4);
            int num1 = 1 +  randomNumber.nextInt(3);
            int num2 = 1 + randomNumber.nextInt(9);
            System.out.println("How much is " + num1 + " * " + num2);
            int answer = in.nextInt();
            if (answer == num1 * num2) {
                rigthAnswer++;
                switch (positiveAnswer){
                    case 1 -> System.out.println("Very good !");
                    case 2 -> System.out.println("Excellent !");
                    case 3 -> System.out.println("Nice work !");
                    case 4 -> System.out.println("Keep up the good work !");
                }
            }
            else if (answer != num1 * num2){
                wrongAnswer++;
                switch (negativeAnswer){
                    case 1 -> System.out.println("No. Please try again");
                    case 2 -> System.out.println("Wrong. Please try once more");
                    case 3 -> System.out.println("Don't give up");
                    case 4 -> System.out.println("No. Keep trying");
                }
            }

        }return testRemarks();
    }
    public int testRemarks(){
        if (rigthAnswer < 8){
            System.out.println("Please ask your teacher for extra help\nyou scored less than 75%: " );
        } else {
            System.out.println("Congratulations ! You're ready to go to the next level \nyou scored over 75%: " );

        }
        return rigthAnswer;
    }
}
