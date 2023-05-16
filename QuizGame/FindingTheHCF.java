package QuizGame;

public class FindingTheHCF {
        public static void main(String[] args) {
            int num1 = 100, num2 = 1000;
            int hcf = findHCF(num1, num2);
            System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
        }

        // method to find HCF using Euclidean algorithm
        public static int findHCF(int num1, int num2) {
            int temp;
            while(num2 != 0){
                temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        }
    }


