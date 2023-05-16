package Chapter7;

public class CommandLineArgument {

    public static void main(String[] args) {

        if (args.length > 0){
            int minimum = Integer.MAX_VALUE;
            int maximum = Integer.MIN_VALUE;
            for (String arg : args){
                int num = Integer.parseInt(arg);
                if (num < minimum) minimum = num;
                if (num > maximum) maximum = num;
                double avg = (double) (maximum + minimum) / 2;
                System.out.println("Minimum value is: " + minimum);
                System.out.println("Maximum value is: " + maximum);
                System.out.println("Average of minimum and maximum is: " + avg);
            }
        }else {
            System.out.println("No command line argument provided ");
        }
    }
}
