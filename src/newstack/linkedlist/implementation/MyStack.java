/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-03-2021
    Time: 14:59
    File: MyStack.java 
*/
package newstack.linkedlist.implementation;

import newstack.linkedlist.myinterface.StackADT;

public class MyStack<E> implements StackADT<E> {
    Node<E> head;
    Node<E> tail;
    int top;


    @Override
    public void push(E data) {
        Node<E> node = new Node<>(data);
        if (!isEmpty()) {
            node.setNext(head);
            head = node;
        } else {
            head = node;
            tail = node;
        }
        top++;
    }

    @Override
    public void pop() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.getNext();
            }
            top--;
        }
        else {
            System.out.println("Stack Underflow");
        }
    }

    @Override
    public E peek() {
        E response = null;
        if (!isEmpty()) {
            response = head.getData();
        }
        else {
            System.out.println("No element in stack.");
        }
        return response;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void traverse() {
        if (!isEmpty()) {
            Node<E> temp = head;
            System.out.print("top-->");
            while (temp != null) {
                System.out.print(temp.getData() + "-->");
                temp = temp.getNext();
            }
            System.out.println();
        }
        else {
            System.out.println("Stack is Empty.");
        }
    }
}