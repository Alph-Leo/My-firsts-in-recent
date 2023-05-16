package Chapter5;

import java.util.Scanner;

public class FairTax {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double fairTax = 0.23;

        System.out.println("Enter housing expenses: ");
        double houseExpenses = in.nextDouble();

        System.out.println("Enter food expenses: ");
        double foodExpenses = in.nextDouble();

        System.out.println("Enter clothing expenses: ");
        double clotheExpenses = in.nextDouble();

        System.out.println("Enter transportation expenses: ");
        double transportExpenses  = in.nextDouble();

        System.out.println("Enter education expenses: ");
        double eduExpenses = in.nextDouble();

        System.out.println("Enter health care expenses: ");
        double healthExpenses = in.nextDouble();

        System.out.println("Enter vacation expenses: ");
        double vacationExpenses = in.nextDouble();

        double totalExpenses = houseExpenses + foodExpenses + clotheExpenses + transportExpenses + eduExpenses +
                healthExpenses + vacationExpenses;

         fairTax = totalExpenses * 0.23;

        System.out.printf("The total expenses: %.2f%nFair tax: %.2f%n", totalExpenses, fairTax);
    }
}
