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
public class Node {

    char data;
    Node next;

    public Node(char data) {

        this.data = data;
    }

    public Node(char data, Node next) {
        this.data = data;
        this.next = next;
    }

}