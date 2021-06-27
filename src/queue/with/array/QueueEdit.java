/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-03-2021
    Time: 18:51
    File: QueueEdit.java 
*/
package queue.with.array;

public class QueueEdit implements MyQueueADT {
    private Integer[] arr;
    private int front;
    private int rear;
    private int size;

    public QueueEdit(Integer[] arr) {
        this.arr = arr;
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(int data) {
        if (size != arr.length) {
            if (rear == arr.length) {
                rear = 0;
            }
            arr[rear] = data;
            rear++;
            size++;
        } else {
            System.out.println("Queue Overflow");
        }
    }

    @Override
    public int dequeue() {
        int response = 0;
        if (!isEmpty()) {
            if (size != arr.length) {
                if (front == arr.length) {
                    front = 0;
                }
            }
            response = arr[front];
            front++;
            size--;
        } else {
            System.out.println("Queue underflow");
        }
        return response;
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
        System.out.println("Printing queue...");
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