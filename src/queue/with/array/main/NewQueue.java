/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-03-2021
    Time: 20:46
    File: NewQueue.java 
*/
package queue.with.array.main;


public class NewQueue implements NewQueueADT {
    private Integer[] arr;
    private int front;
    private int rear;
    private int size;

    public NewQueue(Integer[] arr) {
        this.arr = arr;

    }

    @Override
    public void enqueue(int data) {
        if (size == arr.length) {
            System.out.println("Queue Overflow");
        } else {
            if (rear == arr.length) {
                rear = 0;
            } else {
                arr[rear] = data;
                rear++;
                size++;
            }
        }
    }

    @Override
    public void dequeue() {
        if (!isEmpty()) {
            if (size != arr.length) {
                if (front == arr.length) {
                    front = 0;
                }
            }
            front++;
            size--;
        } else {
            System.out.println("Queue Underflow");
        }
    }

    @Override
    public int peek() {
        return arr[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void traverse() {
        System.out.println("Printing Queue");
        System.out.print("front<--");
        if (rear <= front) {
            for (int i = front; i < arr.length; i++) {
                System.out.print(arr[i] + "<--");
            }
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i] + "<--");
            }
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + "<--");
            }
        }
        System.out.println("rear");
    }
}