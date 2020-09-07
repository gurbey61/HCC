package JavaIII.HWDoubleLinkList3;

public class DLinkList {

    Node head;
    Node tail;


    public void insertDLinkList(String Name) {
        Node node = new Node(Name);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail; //before we move the tail
            tail = node; //finally assign tail to the last node
        }
    }


    public void insertPosition(String name, int position) {
        Node node = new Node(name);
        Node temp = head;

        if (position == 0) {
            head = node;
            node.next = temp;
            temp.prev = node;
        } else {
            int counter = 0;
            while (temp != null) {

                if (counter == position - 1) {
                    node.next = temp.next;
                    node.prev = temp;
                    temp.next = node;
                    break;
                } else if (temp.next == null) {
                    temp.next = node;
                    node.prev = temp;
                    break;

                }
                temp = temp.next;
                counter++;
            }


        }
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
        System.out.println("------------------------------------");
    }


    public static void main(String[] args) {
        DLinkList nm = new DLinkList();
        nm.insertDLinkList("David");
        nm.insertDLinkList("Sam");
        nm.insertDLinkList("Betty");
        nm.insertDLinkList("John");

        nm.display();
        nm.insertPosition("Ali", 3);
        nm.display();

    }
}
