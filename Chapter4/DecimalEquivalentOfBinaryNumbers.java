package Chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalEquivalentOfBinaryNumbers {

    public static void main(String[] args) {
        System.out.println(convertBinaryNumberToDecimal(1101));
    }


    public static int lengthOfBinaryNumber(int binarynumbers) {
        int lengthOfNumbers = (int) Math.log10(binarynumbers) + 1;
        return lengthOfNumbers;
    }
    public static List<Integer> separateIndexValues(int numbers){
        int length = lengthOfBinaryNumber(numbers);
        int counter = length - 1;
        int separateNumber;
        List<Integer> values = new ArrayList<>();
        for (int index = 0; index < length; index++){
            separateNumber = numbers / (int)Math.pow(10, counter) % 10;
            values.add(separateNumber);
            counter--;
        }
        return values;

    }

    public static boolean isBinaryNumber(int binaryNumber) {
        boolean isBinary = true;
        List<Integer> values = separateIndexValues(binaryNumber);
        for (int value : values){
            if (value != 0 && value != 1) isBinary = false;
        }return isBinary;
    }

    public static  void ensureUserInputIsABinaryNumber(int binaryNumber) {
        System.out.println("Checking if number is a binary number : ");
        Scanner in = new Scanner(System.in);

        while (!isBinaryNumber(binaryNumber)){
            System.out.println("Enter a binary number that is zeros and ones only : ");
            binaryNumber = in.nextInt();
        }
        System.out.println("Is a binary number: " + binaryNumber);

    }

    public static int convertBinaryNumberToDecimal(int binaryNumber) {
        int decimalNumber = 0;
        int power = 0;
        double indexValue;
        for (int index = (separateIndexValues(binaryNumber).size()) - 1; index >= 0; index--){
            indexValue = separateIndexValues(binaryNumber).indexOf(index) * Math.pow(2, power);
            decimalNumber += indexValue;
            power++;

        }return  decimalNumber;
    }
}
