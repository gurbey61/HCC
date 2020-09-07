package JavaIII.HWDoubleLinkList0;



/* Please create a method that allows you to insert at
 any position within a given double link list,
including at the beginning and the end of the node. */

public class DoubleLinkList0 {

    Node head;
    Node tail;

    public void NewNode(String name) { // Method to initialize and add a tail
        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail; // right before we move the tail
        }
        tail = newNode; // assign newNode to the tail
    }

    public void insertToIndex(String name, int index) { // Method to insert in any index location
        Node newNode = new Node(name);
        Node temp = head;

        if (index == 0) { // index 0 is the new head
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else { // change prev of head node to new node
            newNode.next = temp;
            newNode.prev = null;

            // move the head to point to the new node
            temp.prev = newNode;
            head = newNode;
            }
        } else { // if the index is other than 0 add node between
            int counter = 0;
            while (temp != null) {

                if (counter == index - 1) {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next = newNode;
                    break;
                } else if (temp.next == null) { // if temp is tail
                    temp.next = newNode;
                    newNode.prev = temp;
                    break;
                }
                temp = temp.next; // Move to next node
                counter++;
            }
        }
    }

    public void display () {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
        System.out.println("***************************");
    }


    public static void main (String[]args){ // Driver Method
       DoubleLinkList0 node = new DoubleLinkList0(); // Creating the instance
        node.NewNode("David");
        node.NewNode("Gurbey");
        node.NewNode("Ayse");
        node.NewNode("Johnny");

        node.display();

        node.insertToIndex("Gabby", 0);
        node.insertToIndex("Melva", 3);
        node.insertToIndex("Hava", 5);
        node.display();

    }
}

