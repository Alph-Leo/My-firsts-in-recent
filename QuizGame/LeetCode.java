package QuizGame;

import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] evenArrays = {5, 8, 3, 3, 5, 2, 5, 1, 14};
        int[] arrayAddition = {5, 4, 3, 1, 2};
        int [] arrNumbers = {5, 10, 6, 2, 9, 0};
        String letters = "a, b, c, #, #,  x, z, #";
        String result = deleteLettersBeforeHash(letters);
//        rotatedArray(numbers);
//        myArray(numbers);
//          printArray();
//        System.out.println(highestAndLowestArraySum(arrayAddition));
//        loop();
//        fibonacciSeries();
//        additionQuiz();
//        System.out.println(result);
//        System.out.println(Arrays.toString(reverseArrayIndex(arrNumbers)));
        System.out.println(Arrays.toString(outputTheLcmInArray(8)));





    }

    private static void rotatedArray(int[]... array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print((array[j][i]) + "  ");
            }
        }
    }

    private static void myArray(int[]... multiArray) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = i; j < multiArray[0].length; j++) {
                int n = multiArray[i][j];
                multiArray[i][j] = multiArray[j][i];
                multiArray[j][i] = n;
            }
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[0].length / 2; j++) {
                int n = multiArray[i][j];
                multiArray[i][j] = multiArray[i][multiArray[0].length - 1 - j];
                multiArray[i][multiArray[0].length - 1 - j] = n;

            }
        }
        System.out.println(Arrays.deepToString(multiArray));
    }

    private static void printArray() {
        int[] arrNumbers = {1, 2, 3, 4, 5, 6};
        int[] x = new int[arrNumbers.length];
        int k = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (i % 2 == 0) {
                x[k] = i;
                k++;
            }
        }
        System.out.print(Arrays.toString(x));
    }

    private static void evenNumber(int[] evenArrays) {
        int[] newList = new int[evenArrays.length];
        int n = 0;
        for (int evenArray : evenArrays) {
            if (evenArray % 2 == 0) {
                newList[n] = evenArray;
                n++;
            }
        }
        System.out.println(Arrays.toString(newList));
    }

    public int[] doubleArrays(int[] doubleArray) {
        return new int[0];
    }
    private static int maximumArray(int [] maxArray){
        int maxNum = maxArray[0];
        for (int j : maxArray) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        return maxNum;
    }
    private static String highestAndLowestArraySum(int [] arrayNumbers){
        int highestSum = arrayNumbers[0] + arrayNumbers[1] + arrayNumbers[2] + arrayNumbers[3];
        int lowestSum = arrayNumbers[0] + arrayNumbers[1] + arrayNumbers[2] + arrayNumbers[3];

        for (int i = 3; i < arrayNumbers.length; i++){
            int sum = arrayNumbers[i] + arrayNumbers[i - 1] + arrayNumbers[i - 2] + arrayNumbers[i - 3];
            if (sum > highestSum) highestSum = sum;
            else if (sum < lowestSum) lowestSum = sum;

        }
        return "Highest Sum : " + highestSum +"\n" + "Lowest Sum : " + lowestSum;
    }
    private static void loop(){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            if (i == 5){
                i = 9;
            }
        }
    }
    public static void fibonacciSeries(){
        int n = 0, n1 = 1, n2 = 0;
        int count = 11;
        System.out.print(n + " " + n1);
        for (int i = 2; i < count; i++){
            n2 = n + n1;
            System.out.print(n2 + " ");
            n = n1;
            n1 = n2;

        }
    }
    private static void additionQuiz(){
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() / 7 % 10);
        Scanner in = new Scanner(System.in);
        System.out.println("What is " + num1 + " + " + num2 + " ? ");
        int answer = in.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
    }
    public static String deleteLettersBeforeHash(String letters){
        StringBuilder result = new StringBuilder();
        boolean detectHash = false;
        for (char index : letters.toCharArray()){
            if (index == '#') detectHash = true;
            else if (detectHash) result.append(index);
        }
        return result.toString();
    }

    public static int [] outputTheLcmInArray( int number) {
        List <Integer> numbersStorage = new ArrayList<>();
        int [] divisors = {2, 3, 4, 5, 7, 11};
        int counter = 0;
        int inputNumber = number;
        for (int i = 0; i <= inputNumber * 2; i++) {
            if (inputNumber % divisors[counter] == 0) {
                numbersStorage.add(divisors[counter]);
                inputNumber = inputNumber / divisors[counter];
            }
            else if (inputNumber % divisors[counter] != 0) counter++;
        }

        int [] newArray = outputTheLcmInArray(numbersStorage.size());
        counter=0;
                for (int i = 0; i < numbersStorage.size(); i++) {
                    newArray[counter] = numbersStorage.get(inputNumber);
                    counter++;
                }

        System.out.println(Arrays.toString(newArray));
        return newArray;
        }


    public static int[] reverseArrayIndex(int [] reverseArrays) {

        for (int i = reverseArrays.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int result = reverseArrays[i];
                reverseArrays[i] = reverseArrays[j];
                reverseArrays[j] = result;
            }
        }
        System.out.println(Arrays.toString(reverseArrays));
        return reverseArrays;
    }

}

