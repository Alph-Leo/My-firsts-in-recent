package Chapter7;

public class VariableLengthArgsList {
    public static void main(String[] args) {
        System.out.println(AverageCalculator(10, 10, 10));
    }

    private static double AverageCalculator(int...numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }return (double) sum / numbers.length;
    }
}
