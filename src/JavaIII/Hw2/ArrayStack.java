package JavaIII.Hw2;

public class ArrayStack {
    private int[] s;
    private int top;


    // Constructor
    ArrayStack(int capacity) {
        s = new int[capacity];
        top = 0;
    }

    // push() and related methods start
    void push(int x) {
        if (top == s.length)
            throw new IllegalStateException();
        s[top] = x;
        top++;
    }

    // Pop() and related methods start
    public int pop() {
        // Check if the array is empty
        if (top == 0)
            throw new IllegalStateException();
        top--;
        return s[top];
    }

    // Popping a Reference Type
//    public String pop() {
//        if(empty())
//            throw new EmptyStackException();
//        else {
//            int retVal = s[top - 1];
//            s[top - 1] = null; // Facilitate garbage collection
//            top--;
//            return retVal;
//        }
//    }

    public boolean empty() {
//        if (capacity == 0)
//            return true;
//        else
//            return false;
        return top ==0;
    }

int peek() {
        if(top == 0)
            throw new IllegalStateException();
        return s[top - 1];
}

    public void display(int [] s){
        for (int a: s) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);

        System.out.println("New elements are pushed\n");
        arrayStack.push(1);
        arrayStack.push(3);
        arrayStack.push(5);
        arrayStack.display(arrayStack.s);
        System.out.println("The element popped is  " + arrayStack.pop());
        arrayStack.display(arrayStack.s);

        System.out.println("The element popped is  " + arrayStack.pop());
        arrayStack.display(arrayStack.s);

        System.out.println("The element popped is  " + arrayStack.pop());
        arrayStack.display(arrayStack.s);

        System.out.println("New elements are pushed\n");
        arrayStack.push(5);
        arrayStack.push(3);
        arrayStack.push(1);
        arrayStack.display(arrayStack.s);

        System.out.println("The element popped is  " + arrayStack.pop());
        arrayStack.display(arrayStack.s);
        System.out.println("The element popped is  " + arrayStack.pop());
        arrayStack.display(arrayStack.s);
        System.out.println("The element popped is  " + arrayStack.pop());
        arrayStack.display(arrayStack.s);

    }
}
