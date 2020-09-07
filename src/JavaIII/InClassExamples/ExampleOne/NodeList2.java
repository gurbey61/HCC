/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIII.InClassExamples.ExampleOne;

/**
 *
 * @author dawit.gebremichael
 */
public class NodeList2 {

    private Node head;
    private Node tail;

    public void removehead(){
        head = head.next;
        System.out.println("=== after removing head");
        display(head);
    }

    private void addNodeFront(char data){
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            head = node;
        }
    }
    private void addNode(char mi) {
        Node node = new Node(mi);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = tail.next;
        }

    }

    private void remove(Character data) {
        Node current = head;
        Node prev = null;

        while (current != null) {

            if(current.data == data){
                prev.next = current.next;
            }
// System.out.println(node.data);
            prev = current;
            current = current.next;

        }
    }

    private void display(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void nodeManager() {
        addNode('T');
        addNode('P');
        addNode('D');
        addNode('F');
        display(head);
//System.out.println(head.data);
    }

    public void nodeFrontManager() {
        addNodeFront('T');
        addNodeFront('P');
        addNodeFront('D');
        addNodeFront('F');
        display(head);
        remove('P');
        System.out.println(" ----------");
        display(head);

// removehead();
//System.out.println(head.data);
    }

    public static void main(String[] args) {
        NodeList2 nl = new NodeList2();
//nl.nodeManager();
        System.out.println("\n ---------------");
        nl.nodeFrontManager();
    }
}