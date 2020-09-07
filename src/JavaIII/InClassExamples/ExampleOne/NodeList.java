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
public class NodeList {

    private Node head;
    private Node tail;

    private void addNode(char mi) {
        Node node = new Node(mi);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail = node;
            tail = tail.next;
        }

    }

    private void display(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void nodeManager() {
        addNode('A');
        addNode('B');
        addNode('C');
        addNode('D');
        display(head);
    }

    public static void main(String[] args) {
        NodeList2 nl = new NodeList2();
        nl.nodeManager();
    }
}