package QuizGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FindingTheLCM {

        public static void main(String[] args) {

            System.out.println("The lowest common multiple of 30 is: " + findLCM());
            System.out.println("The lowest common multiple of 42 is: " + findLCMOf42());
            System.out.println("The lowest common factors of 30 and 42: " + compareTwoLCMs());

        }
        public static List<Integer> findPrimeFactors(int num1) {
            List<Integer> factors = new ArrayList<>();
            for(int i=2; i<=num1; i++){
                while(num1 % i == 0){
                    factors.add(i);
                    num1 /= i;
                }
            }
            return factors;
        }
        public static List<Integer> findLCM(){
            int num = 30;
            List<Integer> divisors = new ArrayList<>();
            for (int index = 2; index <= num; index++){
                while(num % index == 0) {
                    divisors.add(index);
                    num /= index;
                }
            }return divisors;
        }
    public static List<Integer> findLCMOf42(){
        int num = 42;
        List<Integer> dividers = new ArrayList<>();
        for (int index = 2; index <= num; index++){
            if (num % index == 0) {
                dividers.add(index);
                num /= index;
            }
        }return dividers;
    }
    public static List<Integer> compareTwoLCMs(){
            List<Integer> factorStorage = new ArrayList<>();
            List<Integer> lcmOf30 = findLCM();
            List<Integer> lcmOf42 = findLCMOf42();
            for (int index = 0; index < lcmOf30.size(); index++){
                    if( lcmOf42.contains(lcmOf30.get(index))){
                        factorStorage.add(lcmOf30.get(index));
                }
            }return factorStorage;

    }
    }




