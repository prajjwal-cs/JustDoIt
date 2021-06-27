package queue.with.array.main;

public interface NewQueueADT {
    void enqueue(int data);
    void dequeue();
    int peek();
    boolean isEmpty();
    int size();
    void traverse();
}
