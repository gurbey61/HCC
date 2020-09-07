package JavaIII.InClassExamples.PPT;

public class QueueManager {
    Queue front = null; // head of list, where items are removed
    Queue rear = null; // last node in list, where items are added

    boolean empty()
    {
        return front == null;
    }

    public void enqueue(String s)
    {
        if (rear != null)
        {
            rear.next = new Queue(s, null);
            rear = rear.next;
        }
        else
        {
            rear = new Queue(s, null);
            front = rear;
        }
    }

    public String dequeue()
    {
        if (empty())
            throw new IllegalStateException();
        else
        {
            String value = front.element;
            front = front.next;
            if (front == null)
                rear = null;
            return value;
        }
    }

    public void display() {
        Queue temp = front;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueManager newQueue = new QueueManager();
        newQueue.enqueue("Alice");
        newQueue.enqueue("Bob");
        newQueue.enqueue("Carol");
        newQueue.display();
        newQueue.dequeue();
        newQueue.display();

    }
}

