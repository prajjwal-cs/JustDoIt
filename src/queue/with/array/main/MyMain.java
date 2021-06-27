/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-03-2021
    Time: 18:51
    File: MyMain.java 
*/
package queue.with.array.main;

import queue.with.array.QueueEdit;

public class MyMain {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        QueueEdit queue = new QueueEdit(array);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.traverse();
        System.out.println("size = " + queue.size());
        queue.dequeue();
        queue.traverse();
        System.out.println("size = " + queue.size());
        System.out.println(queue.peek());
    }
}