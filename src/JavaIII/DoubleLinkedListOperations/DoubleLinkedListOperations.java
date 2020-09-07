package JavaIII.DoubleLinkedListOperations;

public class DoubleLinkedListOperations {
    Node head; // head of list
    int size;
    class Node {
        int data;
        Node prev;
        Node next;
        Node(int d) { data = d; }
    }

    DoubleLinkedListOperations(){
        size = 0;
    }
    //add at the first
    public void addToTheListFront(int new_data)
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev = null;
        if (head != null)
            head.prev = new_Node;
        head = new_Node;
    }
    public void InsertAt(int new_data,int position)
    {
        if(position<=0){
            System.out.println("Minimum position should be 1!!!!");
            return;
        }else if(position==1){
            addToTheListFront(new_data);
        }else{
            Node prev_Node=head;
            int currentIndex=1;
            while(prev_Node!=null && currentIndex<position-1){
                prev_Node = prev_Node.next;
                currentIndex++;
            }
            if(prev_Node==null){
                System.out.println("Position should be less than list size!!!!");
                return ;
            }
            Node new_node = new Node(new_data);
            new_node.next = prev_Node.next;
            prev_Node.next = new_node;
            new_node.prev = prev_Node;
            if (new_node.next != null)
                new_node.next.prev = new_node;
        }

    }
    void addAtTheEnd(int new_data)
    {
        Node new_node = new Node(new_data);
        Node last = head; /* used in step 5*/
        new_node.next = null;
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        new_node.prev = last;
    }
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String[] args)
    {
        DoubleLinkedListOperations dll = new DoubleLinkedListOperations();
        System.out.println("Created list as below");
        dll.addAtTheEnd(1);
        dll.addAtTheEnd(3);
        dll.addAtTheEnd(4);
        dll.addAtTheEnd(5);
        dll.printlist(dll.head);

        System.out.println(" Inserting 2 at position 2");
        dll.InsertAt(2, 2);
        dll.printlist(dll.head);


        System.out.println(" Inserting 0 at position 1");
        dll.InsertAt( 0,1);
        dll.printlist(dll.head);


        System.out.println(" Inserting 99 at position -1");
        dll.InsertAt( 99,-1);
        dll.printlist(dll.head);


        System.out.println(" Inserting 6 at position 7");
        dll.InsertAt(6,7);
        dll.printlist(dll.head);

        System.out.println(" Inserting 10 at position 9");
        dll.InsertAt(10,9);
        dll.printlist(dll.head);
    }
}