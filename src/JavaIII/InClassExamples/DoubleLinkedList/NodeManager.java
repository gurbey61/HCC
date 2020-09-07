/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIII.InClassExamples.DoubleLinkedList;

/**
 *
 * @author dawit.gebremichael
 */
public class NodeManager {

    Node head;
    Node tail;

    public void addTail(String value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    // Please create a method that allows you to insert at any position within a given double link list,
    // including at the beginning and the end of the node.
    public void insert(Node prev_Node, String new_data)
    {
        // INSERT BEFORE THE HEAD

        /* 1. allocate node
         * 2. put in the data */
        Node new_Node = new Node(new_data);

        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = head;
        new_Node.prev = null;

        /* 4. change prev of head node to new node */
        if (head != null)
            head.prev = new_Node;

        /* 5. move the head to point to the new node */
        head = new_Node;


        // INSERT BETWEEN NODES
        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        /* 2. allocate node
         * 3. put in the data */
        Node new_node = new Node(new_data);

        /* 4. Make next of new node as next of prev_node */
        new_node.next = prev_Node.next;

        /* 5. Make the next of prev_node as new_node */
        prev_Node.next = new_node;

        /* 6. Make prev_node as previous of new_node */
        new_node.prev = prev_Node;

        /* 7. Change previous of new_node's next node */
        if (new_node.next != null)
            new_node.next.prev = new_node;

        // INSERT AFTER TAIL
        /* 1. allocate node
         * 2. put in the data */


        Node last = head; /* used in step 5*/

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;

    }

    public void delete(String value) {
        Node temp = head;

        if(head.data.equals(value)){
            System.out.println(value + " is matched and removed");
            head = head.next;
        }else {
            while(temp != null){

                if(temp.data.equals(value)){
                    System.out.println(value + " is matched and removed");
                    temp.prev = temp.next;
                }
                temp = temp.next;

            }
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
public void display2(){

    Node temp = tail;
    while(temp != null){
        System.out.println(temp.data);
        //the code update is needed here
        temp = temp.prev;
    }
}

    public static void main(String[] args) {
        NodeManager newNode = new NodeManager();
        newNode.addTail("Alice");
        newNode.addTail("Bob");
        newNode.addTail("Carol");
        newNode.display();
        //newNode.insert(newNode.head.next,"Jane");
        newNode.delete("Alice");
        newNode.display();
//        newNode.delete("Bob");
//        newNode.display();
    }
}

