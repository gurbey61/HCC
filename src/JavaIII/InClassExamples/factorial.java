package JavaIII.InClassExamples;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("The factorial of " + number + " is " + computeFactorial(number));
    }

    public static int computeFactorial(int number) {
        if (number == 0)
            return 1;
        else if (number == 1)
            return 1;
        else
            return number * computeFactorial(number - 1);
    }
}
