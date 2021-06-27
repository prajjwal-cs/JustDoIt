/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-03-2021
    Time: 17:47
    File: AnStackImplementation.java 
*/
package newstack.array.implementation;

import newstack.array.myinterface.AnStackADT;
import java.util.Arrays;

public class AnStackImplementation implements AnStackADT {
    private final int MAX_CAPACITY;
    int arr[];
    int top;

    public AnStackImplementation(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        arr = new int[this.MAX_CAPACITY];
        top = 0;
    }

    @Override
    public void push(int data) {
        if (top != MAX_CAPACITY) {
            arr[top] = data;
            top++;
        }
        else {
            System.out.println("Stack overflow.");
        }
    }

    @Override
    public int pop() {
        int response = 0;
        if (!isEmpty()) {
            top--;
            response = arr[top];
        }
        else {
            System.out.println("Stack Underflow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if (!isEmpty()) {
            response = arr[top - 1];
        }
        else {
            return -1;
        }
        return response;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public void traverse() {
        if (!isEmpty()) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println("<--top");
            System.out.println("size = " + top);
        }
        else {
            System.out.println("Stack is empty.");
        }
    }
}