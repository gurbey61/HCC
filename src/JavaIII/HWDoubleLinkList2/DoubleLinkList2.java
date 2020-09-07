package JavaIII.HWDoubleLinkList2;

/* Please create a method that allows you to insert at
 any position within a given double link list,
including at the beginning and the end of the node. */

public class DoubleLinkList2 {

    Node head;
    Node tail;

    public void NewNode(int number) { // Method to initialize and add a tail
        Node newNode = new Node(number);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail; // right before we move the tail
        }
        tail = newNode; // assign newNode to the tail
    }

    public void insertToIndex(int number, int index) { // Method to insert in any index location
        Node newNode = new Node(number);
        Node temp = head;

        if (index == 0) { // index 0 is the new head
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else { // change prev of head node to new node
                newNode.next = temp;
                newNode.prev = null;

                // move the head to point to the new node
                temp.prev = newNode;
                head = newNode;
//            }
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
                System.out.println(temp.number);
                temp = temp.next;
            }
            System.out.println("***************************");
        }


        public static void main (String[]args){ // Driver Method
            DoubleLinkList2 node = new DoubleLinkList2(); // Creating the instance
            node.NewNode(1);
            node.NewNode(2);
            node.NewNode(4);
            node.NewNode(6);

            node.display();

            node.insertToIndex(0, 0);
            node.insertToIndex(3, 3);
            node.insertToIndex(5, 5);
            node.display();

        }
    }

