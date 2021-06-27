package queue.with.array;

public interface MyQueueADT {
    void enqueue(int data);
    int dequeue();
    int peek();
    boolean isEmpty();
    int size();
    void traverse();
}
