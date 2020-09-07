/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIII.Stack_LinkedList_assignment_1;

/**
 * Stack LinkedList Assignment 1
 * @author gurbey.demirturk
 */
public class NodeManager {

    Node head = null;
    Node tail = null;
    /**
     * Create a node and put value
     * @param name - user's name
     */

    private void pushHead(String name) {
        Node newNode = new Node(name);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

//    private void pushTail(String name) {
//        Node newNode = new Node(name);
//        if (head == null){
//            head = newNode;
//        }else{
//            tail.next = newNode;
//        }
//        tail = newNode;
//    }

    private void popHead() {
        Node current = head;
        head = current.next;
//      head = head.next;  // From CSCMU
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.name);
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        NodeManager Shakespeare = new NodeManager();
        Shakespeare.pushHead("to");
        Shakespeare.display();
        Shakespeare.pushHead("be");
        Shakespeare.display();
        Shakespeare.pushHead("or");
        Shakespeare.display();
        Shakespeare.pushHead("not");
        Shakespeare.display();
        Shakespeare.pushHead("to");
        Shakespeare.display();
        Shakespeare.popHead();
        Shakespeare.display();
        Shakespeare.pushHead("be");
        Shakespeare.display();
        Shakespeare.popHead();
        Shakespeare.display();
        Shakespeare.popHead();
        Shakespeare.display();
        Shakespeare.pushHead("that");
        Shakespeare.display();
        Shakespeare.popHead();
        Shakespeare.display();
        Shakespeare.popHead();
        Shakespeare.display();
        Shakespeare.popHead();
        Shakespeare.display();
        Shakespeare.pushHead("is");
        Shakespeare.display();
    }
}
