package Chapter5;

public class SumOfASeries {
        public static void main(String[] args) {
            System.out.println("n" + "     " + "Sum");
            System.out.println("---------------");

            long sum = 0;
            for (int n = 1; n <= 100; n++) {
                sum += n;
                System.out.println(n+"." + "     " + sum);
            }

        }
    }


