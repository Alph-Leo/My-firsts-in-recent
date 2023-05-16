package Chapter5;

public class CalculatingTheValueOfPi {
    public static void main(String[] args) {

        double pi = 0.0;
        int counter = 0;
        double denominator = 1;
        int index;
        for (index = 1; index < 200000; index ++) {
            if (index % 2 == 0) {
                pi -= 4 / denominator;
                counter++;
                denominator += 2;
            } else {
                    pi += 4 / denominator;
                    counter++;
                    denominator += 2;
                }
            System.out.printf("PI at index %d is = %.5f%n",  index, pi);
            }
        }

    }



