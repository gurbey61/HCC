package JavaIII.InClassExamples;

public class StackExample {
    private int top;
    private int capacity;
    private int[] arr1;

    // Constructor
    public StackExample() {
        arr1 = new int[]{2,4,6};
        capacity = arr1.length;
    }

    // Pop() and related methods start
    public int pop() {
        // Check if the array is empty
        if(isEmpty()) {
            System.out.println("Error: Stack is empty");
            return -1;
        } else {
            reduceSize();
            return arr1[capacity];
       }
    }

    public boolean isEmpty() {
        if (capacity < 1)
            return true;
        else
            return false;
    }

    public void reduceSize() {
        int[] arr2 = new int[capacity--];
        for (int i = 0; i < capacity -1; i++) {
            arr2[i] = arr1[i];
        }
    }

    // push() and related methods start
    public void push(int data) {
        if (isFull()) {
            expandArray(); // If the array is full then increase its capacity
        }
    }

    public boolean isFull() {
        if (capacity == arr1.length)
            return true;
        else
            return false;
    }

    public void expandArray() {
        int[] arr2 = new int[capacity++];
        for (int i = 0; i < capacity + 1; i++) {
            arr2[i] = arr1[i];
        }
    }


    public static void main(String[] args) {
        StackExample stackExample = new StackExample();

        System.out.println("The element popped is  " + stackExample.pop());
        System.out.println("The element popped is  " + stackExample.pop());
        System.out.println("The element popped is  " + stackExample.pop());
        System.out.println("An element is pushed");
        stackExample.push(1);
        stackExample.push(3);
        stackExample.push(5);
        System.out.println("The element popped is  " + stackExample.pop());
        System.out.println("The element popped is  " + stackExample.pop());
        System.out.println("The element popped is  " + stackExample.pop());

    }
}
