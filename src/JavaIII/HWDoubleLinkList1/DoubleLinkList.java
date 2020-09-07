package JavaIII.HWDoubleLinkList1;

public class DoubleLinkList {
    private static Node head;
    private static Node tail;

    // Method to insert newNode
    static void insert(int key) {
            Node newNode = new Node(key);
            newNode.next = null;

            // First node to be inserted in double linked list
            if (head == null) {
                head = newNode;
                tail = newNode;
                head.prev = null;
                return;
            }

            // If newNode to be inserted has value more than the last node
            if (newNode.data > tail.data) {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
                return;
            }

            // If newNode to be inserted has value less than the first node
            if (newNode.data < head.data) {
                newNode.prev = null;
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
                return;
            }

            // Find the node before which we need to insert newNode.
            Node temp = head;
            while (temp.data < newNode.data)
                temp = temp.next;

            // Insert newNode before temp
            (temp.prev).next = newNode;
            newNode.prev = temp.prev;
            temp.prev = newNode;
            newNode.next = temp;
        }

        // Method to print nodes in order
        static void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        // Main method
        public static void main(String args[]) {

            insert(9);
            insert(5);
            insert(10);
            insert(1);
            insert(3);
            insert(000);
            insert(200);
            insert(41);
            insert(99);

            System.out.println("Printing the nodes");
            printList(head);
        }
}