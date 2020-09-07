package JavaIII.Practice;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stack<Integer> myIntStack = new Stack<Integer>();

        String [] names = {"Al", "Bob", "Carol"};
        Integer [] numbers = {1, 2, 3};

        System.out.println("Pushing onto the stack the names:");
        System.out.println("Al Bob Carol");
        for (String s: names) {
                stack.push(s);
    }
        System.out.println("Pushing onto the myIntStack the numbers:");
        System.out.println("1, 2, 3");
        for (Integer i: numbers) {
            myIntStack.push(i);
        }

        String message = "Popping and printing all stack values:";
        System.out.println(message);
        while(!stack.empty())
            System.out.println(stack.pop() + " ");

        message = "Popping and printing all mystack values:";
        System.out.println(message);
        while(!myIntStack.empty())
            System.out.println(myIntStack.pop() + " ");
    }
}
