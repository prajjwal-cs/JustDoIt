/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-03-2021
    Time: 15:46
    File: MyMain.java 
*/
package newstack.linkedlist.main;

import newstack.linkedlist.implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.traverse();
    }
}