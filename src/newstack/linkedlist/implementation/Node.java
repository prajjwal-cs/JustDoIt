/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-03-2021
    Time: 14:59
    File: Node.java 
*/
package newstack.linkedlist.implementation;

public class Node<E> {
    E data;
    Node next;

    public Node(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}