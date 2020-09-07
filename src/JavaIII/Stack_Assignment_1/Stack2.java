package JavaIII.Stack_Assignment_1;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack2 {

    int[] numbers;
    int top; // points to current end of the stack

    public Stack2(int capacity) {
        numbers = new int[capacity];
        top = 0;
    }

    public void push(int x) {
        if (top == numbers.length)
            throw new IllegalStateException();
        numbers[top] = x;
        top++;
    }

public int pop() {
    if (top == 0)
        throw new IllegalStateException();
    top--;
    //numbers = Arrays.copyOf(numbers,numbers.length-1);
    for (int number: numbers) {
        int[] newArray;
        newArray = new int[top];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = number;
        }
   }
    return numbers[top-1];
}

public int peek() {
// System.out.println(stack.peek());
    if(top == 0)
        throw new IllegalStateException();
    return numbers[top - 1];
}

public boolean isEmpty() {
        return top == 0;
}

public void display() {
    for (int number: numbers) {
        System.out.println(number);
    }
//    for (int i=0; i<numbers.length; i++)
//    {
//        int number = numbers[i];
//        System.out.println(number);
//    }
}


public static void main(String[] args) {

        Stack2 st = new Stack2(3);
        st.push(1);
        st.push(2);
        st.push(3);
    System.out.println();
        st.display();
    System.out.println();
    System.out.println(st.pop() + " is removed");
    System.out.println();
        st.display();
    System.out.println();
    System.out.println(st.pop() + " is removed");
    System.out.println();
        st.display();
    System.out.println();
    System.out.println(st.pop() + " is removed");
    st.display();
    System.out.println();
        System.out.println(st.isEmpty());


    }
}