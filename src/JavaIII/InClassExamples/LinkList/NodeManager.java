/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIII.InClassExamples.LinkList;

/**
 *
 * @author dawit.gebremichael
 */
public class NodeManager {

    Node head = null;
    Node tail = null;
    /**
     * Create a node and put value
     * @param name - user's name
     */
    private void insert(String name) {
        Node newNode = new Node(name);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    private void insertHead(String name) {
        Node newNode = new Node(name);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.name);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        NodeManager nm = new NodeManager();
        nm.insertHead("Caleb");
        nm.insertHead("Meba");
        nm.insertHead("Mimi");
        nm.insert("Gurbey");
        System.out.println("");
        nm.display();
    }

}
