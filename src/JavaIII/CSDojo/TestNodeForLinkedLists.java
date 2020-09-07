package JavaIII.CSDojo;

public class TestNodeForLinkedLists {
    public static void main(String[] args) {
        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);
        Node nodeF = new Node(0);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;

        System.out.println("This linked list's length is: (should print 6)");
        System.out.println(countNodes(nodeA));
    }

    static int countNodes(Node head) {
        // assuming that head != null
        int count = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count += 1;
        }
        return count;
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}