package JavaIII.InClassExamples;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter an index to calculate Fibonacci Series: ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        System.out.println("The fibonacci number at index " + index + " is " + calculateFibonacci(index));
    }
    public static int calculateFibonacci(int index) {
        if (index == 0)
            return 1;
        else if (index == 1)
            return 1;
        else
            return calculateFibonacci(index - 1) + calculateFibonacci(index - 2);
    }
}
