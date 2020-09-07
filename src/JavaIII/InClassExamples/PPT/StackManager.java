package JavaIII.InClassExamples.PPT;

public class StackManager {
    Stack head = null; // head of list is top of stack

    boolean empty()
    {
        return head == null;
    }

    void push(String s)
    {
        head = new Stack(s, head);
    }

    public String pop()
    {
        if (empty())
            throw new IllegalStateException();
        else
        {
            String retValue = head.element;
            head = head.next;
            return retValue;
        }
    }

    public String peek()
    {
        if (empty())
            throw new IllegalStateException();
        else
            return head.element;
    }

    public void display() {
        Stack temp = head;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StackManager newNode = new StackManager();
        newNode.push("Alice");
        newNode.push("Bob");
        newNode.push("Carol");
        newNode.display();
        System.out.println(newNode.pop() + " is removed");
        System.out.printf("\n");
        newNode.display();
        System.out.println(newNode.empty());
        newNode.pop();
        newNode.display();
        newNode.pop();
        System.out.printf("\n");
        newNode.display();
        System.out.printf("\n");
        System.out.println(newNode.empty());



    }

}
