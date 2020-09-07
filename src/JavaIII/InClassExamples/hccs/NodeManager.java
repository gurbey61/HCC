/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIII.InClassExamples.hccs;

/**
 *
 * @author dawit.gebremichael
 */
public class NodeManager {

    Node head;
    Node tail;
    int counter = 0;

    private void push(String value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
            tail = head;
        } else {
            n.next = head;
            head = n;
        }
        counter++;
    }

    private String peek(){
        return head.value;
    }

    private int size(){
        return counter;
    }

    private boolean isEmpty(){
        return head == null;
    }

    private void pop(){
        System.out.println(head.value);
        head = head.next;
        counter--;
    }

    private void add(String value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
            tail = head;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        Node temp = head;
// System.out.println(temp.value);
// System.out.println(temp.next.value);
// System.out.println(temp.next.next.value);
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        NodeManager nm = new NodeManager();
// nm.add("To");
// nm.add("be");
// nm.add("brave");
        nm.push("To");
        nm.push("be");
        nm.push("brave");
        nm.display();
    }
}
